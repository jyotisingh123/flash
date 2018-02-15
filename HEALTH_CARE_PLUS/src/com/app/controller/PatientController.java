
package com.app.controller;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.service.PatientServiceInterface;
import com.app.service.PrescriptionServiceInterface;

import pojos.Doctor;
import pojos.Patient;
import pojos.Person;

@Controller
@RequestMapping("/user")
public class PatientController {
	@Autowired
	private PatientServiceInterface service;
	@Autowired
	private PrescriptionServiceInterface prescriptionService;
	
	@GetMapping("/login")
	public String showLoginForm(Model map)
	{ 
		map.addAttribute("person", new Person());
		return "user/login";
	}
	@PostMapping(value= {"/login"})
	public String processLoginForm(Person p,Model map,RedirectAttributes flashMap)
	{
	System.out.println("inside processLoginForm"+p);
		try {
		 Person validUser=service.validateUser(p.getEmail(),p.getPassword());
		
		 if(validUser instanceof Patient) {
			
			 flashMap.addFlashAttribute("patientId",validUser.getEmail());
			
			 return "redirect:/user/home/"+validUser.getEmail();
		 }
		 else {
			 System.out.println("inside processLoginForm Doctor");
			 
			 return "redirect:/user/doctor/home/"+validUser.getEmail();
		 }
			 
		} catch (NoResultException e) {
			
			map.addAttribute("message", "Invalid Login , Pls retry...");
			System.out.println("NoResultException"+e);
			return "/user/login";
		}
	}
	@GetMapping("/register")
	public String register(Model map)
	{
		map.addAttribute("newUser", new Patient());
		return "patient/registerPatient";
		
	}
	@PostMapping("/register")
	public String ProcessRegisterForm(Patient p,RedirectAttributes flashMap)
	{
		flashMap.addFlashAttribute("message",service.registerPatient(p));
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
	
	@GetMapping("/home/{patientId}")
	public String userHome(@PathVariable("patientId") String patientId,Model map)
	{
		map.addAttribute("specificDoctor", new Doctor());
		map.addAttribute("listDoctor", service.listDoctor());
		map.addAttribute("listPrescriptionForPatient", prescriptionService.getPrescriptionByPatientId(patientId));
		
		return "patient/home";
	}
	/*@PostMapping("/home")
	public String moreInfo(Model map)
	{
		return null;
	}*/
}
