package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DoctorDaoInterface;
import pojos.Doctor;
import pojos.Person;


@Service
@Transactional
public class DoctorService implements DoctorServiceIntf {
	
	@Autowired
	private DoctorDaoInterface dao;
	
	public String registerDoctor(Doctor d)
	{
		return dao.registerDoctor(d);
		
	}

	
}
