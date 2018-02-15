package com.app.dao;

import java.util.List;

import pojos.Prescription;

public interface PrescriptionDaoInterface {

	public boolean savePrescription(Prescription prescription);
	public List<Prescription> getPrescriptionByDoctorId(String doctorId);
	public List<Prescription> getPrescriptionByPatientId(String patientID);
	public boolean updatePrescriptionForPatient(Prescription prescription );
}
