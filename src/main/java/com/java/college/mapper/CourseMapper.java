package com.java.college.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.java.college.bean.CourseBean;
import com.java.college.entity.Course;

public class CourseMapper {

	public static List<CourseBean> entityListToBeanList(List<Course> courses) {
		
		if (CollectionUtils.isEmpty(courses)) return new ArrayList<CourseBean> ();
		
		List<CourseBean> beans = new ArrayList<CourseBean>();
		
		for (Course course : courses) {
			beans.add(entityToBean(course));
		}
		
		return beans;
	}
	
	public static CourseBean entityToBean(Course course) {
		if (course == null) return null;
		
		CourseBean bean = new CourseBean();
		
		bean.setCourseno(course.getCourseno());
		bean.setDuration(course.getDuration());
		bean.setEndDate(course.getEndDate());
		bean.setStartDate(course.getStartDate());
		bean.setHod(course.getHod());
		
		return bean;
	}

	public static Course beanToEntity(CourseBean bean, Course course) {
		if (course == null) return null;
		
		course.setCourseno(bean.getCourseno());
		course.setDuration(bean.getDuration());
		course.setEndDate(bean.getEndDate());
		course.setStartDate(bean.getStartDate());
		course.setHod(bean.getHod());
		
		return course;
	}
	
}
