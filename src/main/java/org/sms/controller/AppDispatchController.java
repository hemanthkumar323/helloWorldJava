package org.sms.controller;

import org.sms.beans.user.User;
import org.sms.beans.user.UserMgr;
import org.sms.context.Context;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AppDispatchController extends MainController {

	@RequestMapping(value={"/","welcome","loginPage"})
	public ModelAndView login(){
		return new ModelAndView("loginPage");
	}
	
	
	
	@RequestMapping(value="verifyCredentials")
	public ModelAndView verifyCredentialsAndRedirect(
			String userName,String password,String schoolName,Model model){
		if(!isUserLoggedIn(model))		
			return new ModelAndView(new RedirectView("loginPage"));
		else{
			ApplicationContext ctx = Context.getCtx();
			UserMgr _userMgr = (UserMgr)ctx.getBean("userMgr");
			int status = _userMgr.verifyCredentials(userName, password, schoolName);
			if(status>=1){
				ModelAndView mav = new ModelAndView("home");
				User currentUser = _userMgr.getUser(userName, schoolName);				
				model.addAttribute("user",currentUser);
						
			}
			return new ModelAndView(new RedirectView("loginPage"));
		}
	}
}
