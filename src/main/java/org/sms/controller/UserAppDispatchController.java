package org.sms.controller;

import org.sms.beans.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserAppDispatchController extends MainController{
	
	@RequestMapping("home")
	public ModelAndView navigateToHome(Model model){
		if(!isUserLoggedIn(model) )
			return new ModelAndView("loginPage");					
		return new ModelAndView("home");
	}
	
	@RequestMapping("logout")
	public ModelAndView logOut(Model model){
		if(!isUserLoggedIn(model) )
			return new ModelAndView("loginPage");		
		model.addAttribute("user", "");
		return new ModelAndView("home"); 
		
	}
}
