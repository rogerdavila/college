package com.java.college.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.college.bean.SubjectBean;
import com.java.college.entity.Subject;
import com.java.college.mapper.SubjectMapper;

public class SubjectDAOImpl implements SubjectDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public String add(SubjectBean bean) {
		Subject subject = SubjectMapper.beanToEntity(bean, new Subject());
		Session s = sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		s.save(subject);
		t.commit();
		
		return "Subject added succesfully";
	}

	@Override
	public List<SubjectBean> list() {

		Session s = sessionFactory.openSession();
		Query query = s.createQuery("from Subject");
		List<Subject> subjects = query.list();
		
		return SubjectMapper.entityListToBeanList(subjects);
	}
	
}
