package pojos;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.sql.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
	import javax.persistence.TemporalType;

import org.hibernate.annotations.CascadeType;

	@Entity
	public class Appointments{

		private Integer appointmentId;
		@Temporal(TemporalType.DATE)
		private Date apointmentDate;
		private String appointmentTime;
		private String patientName;
		private String doctorEmail;
		private String userName;
		
		
		public Appointments(Integer appointmentId, Date apointmentDate, String appointmentTime, String patientName,
				String doctorEmail,String userName) {
			super();
			this.appointmentId = appointmentId;
			this.apointmentDate = apointmentDate;
			this.appointmentTime = appointmentTime;
			this.patientName = patientName;
			this.doctorEmail = doctorEmail;
			this.userName= userName;
		}


		public Appointments() {
			super();
		}
		
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public Integer getAppointmentId() {
			return appointmentId;
		}

		public void setAppointmentId(Integer appointmentId) {
			this.appointmentId = appointmentId;
		}
		public Date getApointmentDate() {
			return apointmentDate;
		}

		public void setApointmentDate(Date apointmentDate) {
			this.apointmentDate = apointmentDate;
		}

		public String getAppointmentTime() {
			return appointmentTime;
		}

		public void setAppointmentTime(String appointmentTime) {
			this.appointmentTime = appointmentTime;
		}


		public String getPatientName() {
			return patientName;
		}


		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}


		public String getDoctorEmail() {
			return doctorEmail;
		}


		public void setDoctorEmail(String doctorEmail) {
			this.doctorEmail = doctorEmail;
		}



		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}

	


		
		
	

		
		
		
		
		
		
	}

	
	

