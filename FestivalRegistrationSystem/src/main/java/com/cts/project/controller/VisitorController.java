package com.cts.project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.project.entity.Visitor;
import com.cts.project.service.VisitorService;



@Controller
@RequestMapping("/visitor")
public class VisitorController {

	@Autowired
	private VisitorService service;

	@RequestMapping(value="/showFormForAdd.html")
	public ModelAndView showFormForAdd()
	{
		return new ModelAndView("registration","visitor",new Visitor());
	}
	
	@RequestMapping(value="saveCustomer.html",method=RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute("visitor")@Valid Visitor visitor,BindingResult result)
	{
		
		
		ModelAndView model=new ModelAndView();
		String pageName="";

		if(result.hasErrors())
		{
			System.out.println("error");
			pageName="registration";

		}
		else
		{
			System.out.println("welcome");
			service.saveVisitor(visitor);
			pageName="registration";

			
		
		}
		model.setViewName(pageName);

		return model;

		
	}
}
