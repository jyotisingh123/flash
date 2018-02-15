package pojos;

import java.sql.Date;

import javax.persistence.*;

import pojos.Person;

@Entity
@DiscriminatorValue("doctor")
public class Doctor extends Person {

	
	private String specialization;
	private Integer maxAppointments;
	
	
	public Doctor() {
		super();
	}
	public Doctor(String email, String password, String name, String phoneNo, String gender, String city,
			Date dob,String specialization,Integer maxAppointments) {
		super(email, password, name, phoneNo, gender, city, dob);
		this.specialization=specialization;
		this.maxAppointments=maxAppointments;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Integer getMaxAppointments() {
		return maxAppointments;
	}
	public void setMaxAppointments(Integer maxAppointments) {
		this.maxAppointments = maxAppointments;
	}
	

}
