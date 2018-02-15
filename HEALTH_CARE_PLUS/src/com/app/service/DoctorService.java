package com.app.service;

import java.math.BigInteger;
import java.security.MessageDigest;

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

	/*public String registerDoctor(Doctor d)
	{
		String md5=null;
		String pass=d.getPassword();
		
		try {
			MessageDigest mdEnc=MessageDigest.getInstance("MD5");
			mdEnc.update(pass.getBytes(),0,pass.length());
			md5=new BigInteger(1,mdEnc.digest()).toString(16);
			d.setPassword(md5);
			dao.registerDoctor(d);
	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return pass;
		//return dao.registerDoctor(d);
		
	}*/
	
}
