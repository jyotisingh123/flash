package com.app.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.PatientDaoInterface;
import com.app.dao.PrescriptionDaoInterface;

import pojos.Appointments;
import pojos.Doctor;
import pojos.Patient;
import pojos.Person;
import pojos.Prescription;

@Service
@Transactional
public class PatientService implements PatientServiceInterface{
	
	/*@Autowired
	PatientDaoInterface dao;*/
	@Autowired
	PrescriptionDaoInterface prescriptionDao;
	@Autowired
	PatientDaoInterface patientDao;

	@Override
	public String registerPatient(Patient p) {
	
		return patientDao.registerPatient(p);
	}

	@Override
	public Person validateUser(String email, String password) {
		
		return patientDao.validateUser(email, password);
	}

	@Override
	public List<Doctor> listDoctor() {
		// TODO Auto-generated method stub
		return patientDao.listDoctor();
	}

	@Override
	public Patient getPatientById(String id) {
		
		return patientDao.getPatientById(id);
		
	}

	@Override
	public Appointments getAppointment(Appointments a) {
		return  patientDao.getAppointment(a);
		
	}

	
}
