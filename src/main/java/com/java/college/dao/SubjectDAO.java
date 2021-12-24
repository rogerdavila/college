package com.java.college.dao;

import java.util.List;

import com.java.college.bean.SubjectBean;

public interface SubjectDAO {

	String add(SubjectBean bean);
	
	List<SubjectBean> list();
	
	int getNextId();

	List<String> listSubjects();
	
}
