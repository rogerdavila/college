package com.java.college.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.college.bean.FeedbackBean;
import com.java.college.entity.Feedback;
import com.java.college.mapper.FeedbackMapper;

public class FeedbackDAOImpl implements FeedbackDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public String add(FeedbackBean bean) {
		Feedback feedback = FeedbackMapper.beanToEntity(bean, new Feedback());
		Session s = sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		s.save(feedback);
		t.commit();
		
		return "Feedback added succesfully";
	}

	@Override
	public List<FeedbackBean> list() {

		Session s = sessionFactory.openSession();
		Query query = s.createQuery("from Feedback");
		List<Feedback> feedbacks = query.list();
		
		return FeedbackMapper.entityListToBeanList(feedbacks);
	}

}
