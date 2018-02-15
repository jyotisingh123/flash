
package com.app.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.service.DoctorServiceIntf;
import com.app.service.PatientServiceInterface;
import com.app.service.PrescriptionServiceInterface;

import pojos.Appointments;
import pojos.Doctor;
import pojos.Patient;
import pojos.Person;
import pojos.Prescription;

@Controller
@RequestMapping("user/doctor")
public class DoctorController {

	@Autowired
	private DoctorServiceIntf service;

	@Autowired
	private PrescriptionServiceInterface prescriptionService;
	
	@Autowired
	private PatientServiceInterface patientService;
	
	
	
	
	@GetMapping("/register")
	public String register(Model map)
	{
		map.addAttribute("newDoctor", new Doctor());
		return "doctor/registerDoctor";
		
	}
	@PostMapping("/register")
	public String ProcessRegisterForm(Model map,Doctor d,RedirectAttributes flashMap)
	{
		flashMap.addFlashAttribute("message",service.registerDoctor(d));
		return "redirect:/user/login";
	}
	@ModelAttribute("cityList")
	public Map<String, String> getCityList() {
	    Map<String, String> cityList = new HashMap<String, String>();
	    cityList.put("Pune", "Pune");
	    cityList.put("Goa", "Goa");
	    cityList.put("New Delhi", "New Delhi");
	    cityList.put("Mumbai", "Mumbai");
	    cityList.put("Agra", "Agra");
	    return cityList;
	}
	@ModelAttribute("specialityList")
	public Map<String, String> getSpecialityList() {
	    Map<String, String> specialityList = new HashMap<String, String>();
	    specialityList.put("Cardiologist", "Cardiologist");
	    specialityList.put("Dentist", "Dentist");
	    specialityList.put("Dermatologist", "Dermatologist");
	    specialityList.put("Gynecologist", "Gynecologist");
	    specialityList.put("Neurologist", "Neurologist");
	    specialityList.put("Orthopedic ", "Orthopedic ");
	    specialityList.put("Physiologist ", "Physiologist ");
	    return specialityList;
	}
	
	


	@GetMapping("/home/{doctorId}")
	public ModelAndView doctorHome(@PathVariable("doctorId") String doctorId)
	{
		System.out.println("Inside doctorHome");
		
		System.out.println("doctorId:"+doctorId);
		ModelAndView modelAndView=new ModelAndView("doctor/home");
		modelAndView.addObject("listPresciption", prescriptionService.getPrescriptionByDoctorId(doctorId));
		return modelAndView;
	}
	

	@GetMapping("/patientDetails/{patientId}")
	public ModelAndView showPatientDetails(@PathVariable("patientId") String patientId)
	{
		Patient p=patientService.getPatientById(patientId);
		
		ModelAndView model=new ModelAndView("doctor/patientDetails");
		model.addObject("patient",p );
		model.addObject("patientId", patientId);
		return model;
	}
	
@GetMapping("patient")
	
	public String requestAppointment(Appointments a,Model map){
		map.addAttribute("doctorEmail",a.getDoctorEmail());
		return "forward:/patient/bookAppointment";
	}
	
	
}
