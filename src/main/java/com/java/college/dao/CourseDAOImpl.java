package com.java.college.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.college.bean.CourseBean;
import com.java.college.entity.Course;
import com.java.college.mapper.CourseMapper;

public class CourseDAOImpl implements CourseDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public String add(CourseBean bean) {
		Course course = CourseMapper.beanToEntity(bean, new Course());
		Session s = sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		s.save(course);
		t.commit();
		
		return "Course added succesfully";
	}

	@Override
	public List<CourseBean> list() {

		Session s = sessionFactory.openSession();
		Query query = s.createQuery("from Course");
		List<Course> courses = query.list();
		
		return CourseMapper.entityListToBeanList(courses);
	}

}
