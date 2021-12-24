package com.java.college.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.java.college.bean.FeedbackBean;
import com.java.college.entity.Feedback;

public class FeedbackMapper {

	public static List<FeedbackBean> entityListToBeanList(List<Feedback> feedbacks) {
		
		if (CollectionUtils.isEmpty(feedbacks)) return new ArrayList<FeedbackBean> ();
		
		List<FeedbackBean> beans = new ArrayList<FeedbackBean>();
		
		for (Feedback feedback : feedbacks) {
			beans.add(entityToBean(feedback));
		}
		
		return beans;
	}
	
	public static FeedbackBean entityToBean(Feedback feedback) {
		if (feedback == null) return null;
		
		FeedbackBean bean = new FeedbackBean();
		
		bean.setFid(feedback.getFid());
		bean.setFbValue(feedback.getFbValue());
		bean.setInstructor(feedback.getInstructor());
		bean.setStudentName(feedback.getStudentName());
		bean.setSubject(feedback.getSubject());
		
		return bean;
	}

	public static Feedback beanToEntity(FeedbackBean bean, Feedback feedback) {
		if (feedback == null) return null;
		
		feedback.setFid(bean.getFid());
		feedback.setFbValue(bean.getFbValue());
		feedback.setInstructor(bean.getInstructor());
		feedback.setStudentName(bean.getStudentName());
		feedback.setSubject(bean.getSubject());
		
		return feedback;
	}
	
}
