package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.service.DoctorServiceIntf;
import com.app.service.PrescriptionServiceInterface;

import pojos.Doctor;
import pojos.Prescription;

@Controller

public class PrescriptionController {
	
	@Autowired
	private DoctorServiceIntf service;

	@Autowired
	private PrescriptionServiceInterface prescriptionService;

	
	
	@GetMapping("/givePrescription/{patientId}/{doctorId}/{symptomsDetails}")
	public ModelAndView writePrescription(@PathVariable("patientId") String patientId,
			@PathVariable("doctorId") String doctorId,@PathVariable("symptomsDetails") String symptomsDetails)
	{
		ModelAndView model=new ModelAndView("doctor/givePrescription");
		model.addObject("prescription", new Prescription());
		model.addObject("patientId", patientId);
		model.addObject("doctorId", doctorId);
		model.addObject("symptomsDetails", symptomsDetails);
		
		return model;
	}
	
	
	@PostMapping(value= {"givePrescription/processPrescriptionForm","givePrescription/{abc}/processPrescriptionForm","givePrescription/{abc}/{cde}/processPrescriptionForm"})
	public ModelAndView processPrescriptionForm(@ModelAttribute("prescription") Prescription p,RedirectAttributes flashMap)
	{
		System.out.println("patient Id:"+p.getPatientID());
		String remedy=p.getRemedies();
		String medicine=p.getMedicine();
		String remark=p.getRemark();
		if((remedy!=null&& !remedy.isEmpty())&&(medicine!=null&& !medicine.isEmpty())&&(remark!=null&& !remark.isEmpty()))
		{
			ModelAndView model=new ModelAndView("doctor/prescriptionText");
			
			model.addObject("prescription",prescriptionService.updatePrescriptionFormForPatient(p));
			model.addObject("prescription",p);
			return model;
		}
		return null;
	}
	
	@GetMapping("takePrescription/{doctorId}/{patientId}")
	public ModelAndView getPrescriptionForm(@PathVariable("doctorId") String doctorId,
			@PathVariable("patientId") String patientId)
			
	{
		
		ModelAndView model=new ModelAndView("patient/prescriptionRequestForm");
		model.addObject("doctorId", doctorId);
		model.addObject("patientId", patientId);
		
		return model;
	}
	
	@PostMapping(value= {"submitDetailsForPrescription","takePrescription/{abc}/submitDetailsForPrescription"})
	public ModelAndView processPrescriptionForm(@ModelAttribute("doctorId") String doctorId,
			@ModelAttribute("patientId") String patientId,
			@RequestParam("prescriptionText") String symptoms)
	{
		
		prescriptionService.savePrescription(new Prescription(patientId,doctorId,symptoms));
		ModelAndView model=new ModelAndView("patient/prescriptionSuccess");
		model.addObject("msg","Health Issues Details  Submitted Successfully..... Doctor will come back to you with Presciption");
		return model;
	}
	@GetMapping("/logout")
	public  ModelAndView goHome()
	{
		ModelAndView model=new ModelAndView("user/login");
		
		return model;
	}


	
}
