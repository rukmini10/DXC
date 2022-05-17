package com.dxc.training.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingsController {
     @RequestMapping("/greetings")
     public String greetings(HttpServletRequest request) {
    	 System.out.println("\nYou Are Welcome");
    	 String str = request.getParameter("name");
    	 if(str==null) {
    		 str = "Rukmini";
    	 }
    	 HttpSession session = request.getSession();
    	 session.setAttribute("name", str);
    	 return "welcome";
    			 
     }
}
