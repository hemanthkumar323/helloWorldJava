package org.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class MainController {
	
	public boolean isUserLoggedIn(Model model){
		if(model.containsAttribute("user"))
			return true;		
		return false;
	}

}
