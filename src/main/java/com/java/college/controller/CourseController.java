package com.java.college.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.college.bean.CourseBean;
import com.java.college.dao.CourseDAO;

@Controller
@RequestMapping(value = "course")
public class CourseController {

	@Autowired
	private CourseDAO courseDAO;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showCourses(ModelAndView model) {

		List<CourseBean> courses = courseDAO.list();

		model.addObject("courses", courses);
		model.setViewName("courses");

		return model;
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView addCourse(ModelAndView model) {
		CourseBean course = new CourseBean();
		course.setCourseno(courseDAO.getNextNo());
		model.addObject("course", course);
		model.setViewName("courseform");

		return model;
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView saveCourse(@ModelAttribute CourseBean course) {
		courseDAO.add(course);
		return new ModelAndView("redirect:/course");
	}

}
