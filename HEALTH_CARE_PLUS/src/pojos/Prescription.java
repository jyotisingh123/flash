package pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prescription")
public class Prescription {

	
	Integer prescriptionId;
	String patientID;
	String  doctorID;
	String symptomsDetails;
	String   appointment;
	String medicine;
	
	String remedies;
	String remark;
	public Prescription(String patientID, String doctorID, String symptomsDetails, String appointment, String medicine,
			String remedies, String remark) {
		super();
		this.patientID = patientID;
		this.doctorID = doctorID;
		this.symptomsDetails = symptomsDetails;
		this.appointment = appointment;
		this.medicine = medicine;
		this.remedies = remedies;
		this.remark = remark;
	}
	public Prescription()
	{
		System.out.println("in prescription default ctor");
	}
	
	public Prescription(String patientID, String doctorID, String symptomsDetails) {
		super();
		this.patientID = patientID;
		this.doctorID = doctorID;
		this.symptomsDetails = symptomsDetails;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(Integer prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}
	public String getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(String doctorID) {
		this.doctorID = doctorID;
	}
	public String getSymptomsDetails() {
		return symptomsDetails;
	}
	public void setSymptomsDetails(String symptomsDetails) {
		this.symptomsDetails = symptomsDetails;
	}
	public String getAppointment() {
		return appointment;
	}
	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getRemedies() {
		return remedies;
	}
	public void setRemedies(String remedies) {
		this.remedies = remedies;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Prescription [prescriptionId=" + prescriptionId + ", patientID=" + patientID + ", doctorID=" + doctorID
				+ ", symptomsDetails=" + symptomsDetails + ", appointment=" + appointment + ", medicine=" + medicine
				+ ", remedies=" + remedies + ", remark=" + remark + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symptomsDetails == null) ? 0 : symptomsDetails.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prescription other = (Prescription) obj;
		if (symptomsDetails == null) {
			if (other.symptomsDetails != null)
				return false;
		} else if (!symptomsDetails.equals(other.symptomsDetails))
			return false;
		return true;
	}
	
	
	
	
	
}
