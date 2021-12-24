package com.java.college.dao;

import java.util.List;

import com.java.college.bean.CourseBean;

public interface CourseDAO {

	String add(CourseBean bean);
	
	List<CourseBean> list();
	
}
