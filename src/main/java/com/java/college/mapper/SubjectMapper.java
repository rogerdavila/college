package com.java.college.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.java.college.bean.SubjectBean;
import com.java.college.entity.Subject;

public class SubjectMapper {

	public static List<SubjectBean> entityListToBeanList(List<Subject> subjects) {

		if (CollectionUtils.isEmpty(subjects))
			return new ArrayList<SubjectBean>();

		List<SubjectBean> beans = new ArrayList<SubjectBean>();

		for (Subject subject : subjects) {
			beans.add(entityToBean(subject));
		}

		return beans;
	}

	public static SubjectBean entityToBean(Subject subject) {
		if (subject == null)
			return null;

		SubjectBean bean = new SubjectBean();

		bean.setSubjectId(subject.getSubjectId());
		bean.setYear(subject.getYear());
		bean.setInstructor(subject.getInstructor());
		bean.setTheory(subject.getTheory());
		bean.setSubject(subject.getSubject());
		bean.setPractical(subject.getPractical());

		return bean;
	}

	public static Subject beanToEntity(SubjectBean bean, Subject subject) {
		if (subject == null)
			return null;

		subject.setSubjectId(bean.getSubjectId());
		subject.setYear(bean.getYear());
		subject.setInstructor(bean.getInstructor());
		subject.setTheory(bean.getTheory());
		subject.setSubject(bean.getSubject());
		subject.setPractical(bean.getPractical());

		return subject;
	}

}
