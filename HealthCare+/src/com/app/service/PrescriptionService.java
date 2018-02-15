package com.app.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DoctorDaoInterface;
import com.app.dao.PrescriptionDaoInterface;

import pojos.Prescription;
@Service
@Transactional
public class PrescriptionService implements PrescriptionServiceInterface{

	@Autowired
	private PrescriptionDaoInterface dao;
	@Override
	public boolean savePrescription(Prescription prescription) {
		
		return dao.savePrescription(prescription);
		
	}
	@Override
	public Set<Prescription> getPrescriptionByDoctorId(String doctorId)
	{
		Set<Prescription> validPrescriptionSet = new HashSet<Prescription>(dao.getPrescriptionByDoctorId(doctorId));
		return validPrescriptionSet;
	}
	@Override
	public boolean updatePrescriptionFormForPatient(Prescription prescription ) {
	
		return dao.updatePrescriptionForPatient(prescription);
	
	}
	@Override
	public Set<Prescription> getPrescriptionByPatientId(String patientID) {
		
		List<Prescription> invalidPrescription= new ArrayList<>();
		List<Prescription> validPrescription=dao.getPrescriptionByPatientId(patientID);
		for(Prescription presciption:validPrescription) {
			if(presciption.getRemedies()==null && presciption.getMedicine()==null && presciption.getRemark()==null) {
				invalidPrescription.add(presciption);
			}
		}
		validPrescription.removeAll(invalidPrescription);
		Set<Prescription> validPrescriptionSet = new HashSet<Prescription>(validPrescription);
		return validPrescriptionSet;
	}

}
