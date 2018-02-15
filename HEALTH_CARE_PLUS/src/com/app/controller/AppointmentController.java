package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.app.service.PatientServiceInterface;

import pojos.Appointments;
import pojos.Person;
import pojos.Prescription;

@Controller
@SessionAttributes({"doctorEmail","usersEmail"})

public class AppointmentController {
	
@Autowired
private PatientServiceInterface service;

	@GetMapping("user/doctor/confirmAppointment/{doctorId}/{patientId}")
	public ModelAndView showAppointment(Appointments a,Model map,@PathVariable("patientId") String patientId,
			@PathVariable("doctorId") String doctorId)
	{
		ModelAndView model=new ModelAndView("doctor/confirmAppointment");
		model.addObject("appointments", new Appointments());
		model.addObject("patientId", patientId);
		model.addObject("doctorId", doctorId);
		return model;
	}
		
	@PostMapping("user/doctor/confirmAppointment/{doctorId}/confirmAppointment")
	public String bookAppointment(Appointments a,Model map)
	{
		System.out.println("in book appointment controller");
		map.addAttribute("list_appointment",service.getAppointment(a));
		return "doctor/successAppointment";
	}
	@GetMapping("/user/about")
	public String showLoginForm(Model map)
	{ 
		//map.addAttribute("person", new Person());
		return "user/about";
	}
	
}
