package com.java.college.dao;

import java.util.List;

import com.java.college.bean.FeedbackBean;

public interface FeedbackDAO {

	String add(FeedbackBean bean);
	
	List<FeedbackBean> list();
	
	String getNextId();
	
}
