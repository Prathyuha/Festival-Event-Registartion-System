
 package com.cts.project.controller;
 



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.project.entity.Registration;
import com.cts.project.service.VisitorService;
  
  @Controller
  
  @RequestMapping(value="admin") 
  public class AdminController {
	  @Autowired
	  private VisitorService service;
	  @RequestMapping("/login.html")
	  public String login(Model model) {
		  System.out.println("welcome to the model view");
		  Registration registration=new Registration();
		  model.addAttribute("customer",registration);
			return "login-form";
		  
	  }
	  @RequestMapping(value="/saveCustomer.html")
	  public String loginregistration(Model model) {
	  	System.out.println("welcome to model view");
	  	Registration reg=new Registration();
	  	model.addAttribute("customer", reg);
	  	return "registration";
	  }
	  @RequestMapping(value="/updatepwd.html")
	  public String newPassword(Model model) {
	  	
	  	System.out.println("Welcome to new password modification..");
	  	Registration reg=new Registration();
	  	model.addAttribute("newpassword", reg);
	  	
	  	return "ChangePassword";
	  }

	  @RequestMapping(value="/about.html")
	  public String aboutPage(Model model) {
	  	System.out.println("Welcome to the about view");
	  	//model.addAttribute("about", );
	  	return "about";
	  }
	  @RequestMapping(value="/eventregistration.html",method = RequestMethod.POST)
	  public String eventRegistration(@ModelAttribute("customer") Registration reg,Model model) {
	  	System.out.println("welcome to the registration page..");
	  	return "main-form";
	  }
	  @RequestMapping(value="/main.html")
	  public String mainPage(Model model) {
	  	System.out.println("Welcome to main form:");
	  	
	  	
	  	return "main-form";
	  }

	  @RequestMapping(value="/successRegi.html")
	  public String registationSuccess(@ModelAttribute("customer") Registration r,Model model) {
	  	System.out.println("Welcome to second model..");
	  	System.out.println("The details are:");
	  	System.out.println("The address is:"+r.getAddress());
	  	System.out.println("The email is:"+r.getEmail());
	  	System.out.println("The id is:"+r.getId());
	  	System.out.println("The lastname is:"+r.getLastname());
	  	System.out.println("The pwd is: "+r.getPassword());
	  	System.out.println("The username is:"+r.getUsername());
	  	return "redirect:/admin/eventregis.html";
	  }
  }
  
 