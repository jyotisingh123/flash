package com.app.service;

import java.math.BigInteger;
import java.security.MessageDigest;
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

	/*@Override
	public Person validateUser(String email, String password) {
		String md5=null;
		String pass=password;
		Person p=new Person();
		try {
			MessageDigest mdEnc=MessageDigest.getInstance("MD5");
			mdEnc.update(pass.getBytes(),0,pass.length());
			md5=new BigInteger(1,mdEnc.digest()).toString(16);
			p.setPassword(md5);
			p.setEmail(email);
			return patientDao.validateUser(p.getEmail(), p.getPassword());
	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return p;
		
	}
	@Override
	public String registerPatient(Patient p) {
	
		String md5=null;
		String pass=p.getPassword();
		
		try {
			MessageDigest mdEnc=MessageDigest.getInstance("MD5");
			mdEnc.update(pass.getBytes(),0,pass.length());
			md5=new BigInteger(1,mdEnc.digest()).toString(16);
			p.setPassword(md5);
			patientDao.registerPatient(p);
	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return pass;
	
		
	}*/
}
