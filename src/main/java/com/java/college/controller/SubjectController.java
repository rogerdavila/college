package com.java.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.college.bean.SubjectBean;
import com.java.college.dao.SubjectDAO;

@Controller
@RequestMapping(value = "subject")
public class SubjectController {

	@Autowired
	private SubjectDAO subjectDAO;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showSubjects(ModelAndView model) {

		List<SubjectBean> subjects = subjectDAO.list();

		model.addObject("subjects", subjects);
		model.setViewName("subjects");

		return model;
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView addSubject(ModelAndView model) {
		SubjectBean subject = new SubjectBean();
		subject.setSubjectId(subjectDAO.getNextId());
		model.addObject("subject", subject);
		model.setViewName("subjectform");

		return model;
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView saveSubject(@ModelAttribute SubjectBean subject) {
		subjectDAO.add(subject);
		return new ModelAndView("redirect:/subject");
	}

}
