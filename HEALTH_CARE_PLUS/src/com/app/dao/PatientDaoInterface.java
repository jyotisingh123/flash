package com.app.dao;

import java.util.List;

import pojos.Appointments;
import pojos.Doctor;
import pojos.Patient;
import pojos.Person;

public interface PatientDaoInterface {

	public String registerPatient(Patient p);
	public Person validateUser(String email, String password);
	List<Doctor> listDoctor();
	public Patient getPatientById(String id);
	public Appointments getAppointment(Appointments a);
}
