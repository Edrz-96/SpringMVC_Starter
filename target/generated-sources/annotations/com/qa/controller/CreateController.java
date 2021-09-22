package com.qa.controller;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreateController {

	@RequestMapping("/create")
	public ModelAndView create(HttpServletRequest request, HttpServletResponse response) {
		String str1 = request.getParameter("str1");
		String str2 = request.getParameter("str2");
		String person = str1 + " " + str2;
		System.out.println(str1 + " " + str2);
		ModelAndView mV = new ModelAndView();
		mV.setViewName("person.jsp");
		mV.addObject("newPerson", person);
		return mV;

	}

	@RequestMapping("/")
	public String home() {
		return "WEB-INF/index.jsp";
	}

}
