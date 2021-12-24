package com.java.college.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class InstructorDAOImpl implements InstructorDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<String> list() {

		Session s = sessionFactory.openSession();
		Query query = s.createQuery("select distinct s.instructor from Subject s");
		List<String> subjects = query.list();
		
		return subjects;
	}

}
