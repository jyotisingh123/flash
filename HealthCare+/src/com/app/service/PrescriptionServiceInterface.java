package com.app.service;

import java.util.List;
import java.util.Set;

import pojos.Prescription;

public interface PrescriptionServiceInterface {

	public boolean savePrescription(Prescription prescription);
	public Set<Prescription> getPrescriptionByDoctorId(String doctorId);
	public Set<Prescription> getPrescriptionByPatientId(String patientID);
	public boolean updatePrescriptionFormForPatient(Prescription prescription );
}
