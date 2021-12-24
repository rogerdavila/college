package com.java.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.college.bean.FeedbackBean;
import com.java.college.dao.FeedbackDAO;

@Controller
@RequestMapping(value = "feedback")
public class FeedbackController {

	@Autowired
	private FeedbackDAO feedbackDAO;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showFeedbacks(ModelAndView model) {

		List<FeedbackBean> feedbacks = feedbackDAO.list();

		model.addObject("feedbacks", feedbacks);
		model.setViewName("feedbacks");

		return model;
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView addFeedback(ModelAndView model) {
		FeedbackBean feedback = new FeedbackBean();
		model.addObject("feedback", feedback);
		model.setViewName("feedbackform");

		return model;
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView saveFeedback(@ModelAttribute FeedbackBean feedback) {
		feedbackDAO.add(feedback);
		return new ModelAndView("redirect:/feedback");
	}

}
