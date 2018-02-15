package com.app.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pojos.Prescription;

@Repository
public class PrescriptionDao implements PrescriptionDaoInterface{

	@Autowired
	private SessionFactory sf;
	
	
	
	@Override
	public boolean savePrescription(Prescription prescription) {
		System.out.println("Inside savePrescription");
		try {
		sf.getCurrentSession().persist(prescription);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public List<Prescription> getPrescriptionByDoctorId(String doctorID) {
		
		System.out.println("Inside getPrescriptionby id"+doctorID);
		try {
		return sf.getCurrentSession().createQuery("select p from Prescription p where p.doctorID=:doctorID",Prescription.class).setParameter("doctorID", doctorID).getResultList();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updatePrescriptionForPatient(Prescription prescription) 
	
	{
		String app=prescription.getAppointment();
		String medi=prescription.getMedicine();
		String remark=prescription.getRemark();
		String remedy=prescription.getRemedies();
		String pID=prescription.getPatientID();
		String doctorId=prescription.getDoctorID();
		String str="update Prescription set appointment=:app,medicine=:medi,remark=:remark,remedies=:remedy"
				+ " where doctorID=:doctorId and patientID=:pID";
		Query query=sf.getCurrentSession().createQuery(str).setParameter("app", app)
				.setParameter("medi", medi)
				.setParameter("remark", remark)
				.setParameter("remedy", remedy)
				.setParameter("doctorId", doctorId)
				.setParameter("pID", pID);

		
			int result=query.executeUpdate();
			if(result>0) {
				return true;
			}
			return false;
	}

	@Override
	public List<Prescription> getPrescriptionByPatientId(String patientID) {
		System.out.println("Inside getPrescription by patientid"+patientID);
		try {
		return sf.getCurrentSession().createQuery("select p from Prescription p where p.patientID=:patientID",Prescription.class).setParameter("patientID", patientID).getResultList();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
		
	}

