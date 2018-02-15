package pojos;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("patient")
public class Patient extends Person {

	private String address;
	
	public Patient() {
		super();
	}

	public Patient(String email, String password, String name, String phoneNo, String gender, String city,
			Date dob, String address) {
		super(email, password, name, phoneNo, gender, city, dob);
		this.address=address;

	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Patient [address=" + address + "]";
	}

	



	


	
	
}
