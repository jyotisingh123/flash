package com.app.dao;

import pojos.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.QueryProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class PatientDao implements PatientDaoInterface {
	
	@Autowired
	private SessionFactory sf;
	
		public String registerPatient( Patient p) 
		{
				sf.getCurrentSession().persist(p);
				return "Register Successfully";
				
		}

		@Override
		public Person validateUser(String email, String password) {
			String jpql = "select p from Person p where p.email = :em and p.password = :pass";
			return sf.getCurrentSession().createQuery(jpql, Person.class).setParameter("em", email).setParameter("pass", password)
					.getSingleResult();
			
		}
		public List<Doctor> listDoctor() {
			return sf.getCurrentSession().createQuery("select d from Doctor d", Doctor.class).getResultList();
		}

		@Override
		public Patient getPatientById(String email) {
			
			return (Patient) (sf.getCurrentSession()
					.createQuery("select p from Person p where email=:email", 
							Person.class).setParameter("email", email).getSingleResult());
		}

		@Override
		public Appointments getAppointment(Appointments a) {
		
			sf.getCurrentSession().persist(a);
			return a;
		}
		
		
		
	
}
	

