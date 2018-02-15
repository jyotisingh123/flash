package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pojos.Doctor;

@Repository
public class DoctorDao implements DoctorDaoInterface {
	@Autowired
	private SessionFactory sf;
	
	@Override
	public String registerDoctor(Doctor d) 
	{
			sf.getCurrentSession().persist(d);
			return "Register Successfully";
			
	}
	

}
