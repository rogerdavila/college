package com.java.college.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.java.college.dao.CourseDAO;
import com.java.college.dao.CourseDAOImpl;
import com.java.college.dao.FeedbackDAO;
import com.java.college.dao.FeedbackDAOImpl;
import com.java.college.dao.InstructorDAO;
import com.java.college.dao.InstructorDAOImpl;
import com.java.college.dao.SubjectDAO;
import com.java.college.dao.SubjectDAOImpl;

@Configuration
@ComponentScan(basePackages="com.java.college")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public SessionFactory getSessionFactory() {
		return new org.hibernate.cfg.AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	@Bean
	public CourseDAO getCourseDAO() {
		return new CourseDAOImpl();
	}
	
	@Bean
	public FeedbackDAO getFeedbackDAO() {
		return new FeedbackDAOImpl();
	}
	
	@Bean
	public SubjectDAO getSubjectDAO() {
		return new SubjectDAOImpl();
	}
	
	@Bean
	public InstructorDAO getInstructorDAO() {
		return new InstructorDAOImpl();
	}
}
