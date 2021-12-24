package com.java.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.college.dao.InstructorDAO;

@Controller
@RequestMapping(value = "instructor")
public class InstructorController {

	@Autowired
	private InstructorDAO instructorDAO;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showInstructors(ModelAndView model) {

		List<String> instructors = instructorDAO.list();

		model.addObject("instructors", instructors);
		model.setViewName("instructors");

		return model;
	}

}
