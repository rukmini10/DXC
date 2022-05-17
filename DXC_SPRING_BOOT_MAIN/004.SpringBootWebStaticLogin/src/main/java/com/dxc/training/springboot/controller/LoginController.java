package com.dxc.training.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dxc.training.springboot.bean.LoginBean;

import org.springframework.web.bind.annotation.ModelAttribute;
@Controller
public class LoginController {
	@RequestMapping(value="/login", method =RequestMethod.GET)
		
	public String init(Model model) {
		System.out.println("\n inside init");
			model.addAttribute("msg", "Please enter your login credentials.");
			
			return "login";		
		}
	
	@RequestMapping(value="/validateUser", method =RequestMethod.POST)
	public String validateUser(Model model, @ModelAttribute("Login Bean") LoginBean loginBean) {
		System.out.println("\n inside controller");
		String str = null;
		model.addAttribute("msg", "Please enter your login credentials.");
		 if(loginBean!=null && loginBean.getUserName()!=null && loginBean.getUserPassword()!=null) {
			 if(loginBean.validateUser())
				 model.addAttribute("msg","Hi" + loginBean.getUserName()+ "you are welcome");
			 return "success";
		 }else {
			 model.addAttribute("error", "please enter valid user credentials");
			 str = "login";
		 }
		 System.out.println("\n page calling : " + str + ".jsp");
		 return str;
	}
	

}
