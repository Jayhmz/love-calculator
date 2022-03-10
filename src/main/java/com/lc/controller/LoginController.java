package com.lc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.lc.api.LoversDTO;
import com.lc.services.LCAppService;

@Controller
@SessionAttributes("dto")
public class LoginController {

	@Autowired
	LCAppService lcapp;
	
	
	@GetMapping("/login")
	public String loginPage(@ModelAttribute("lovers") LoversDTO lovers) {

		return "login";
	}

	@PostMapping("/process-login")
	public String processLoginPage(@Valid LoversDTO loversDTO, BindingResult result, Model model,
			HttpServletRequest request) {

		if (result.hasErrors()) {
			System.out.println(result);
		}
		// this is the model that captures the parameters enterd by a user as an object
		// of the model
		model.addAttribute("dto", loversDTO); // store the objects to a variable or memory space. this is also the key
												// that is added to the session
		
		String calculateLove = lcapp.calculateLove(loversDTO.getYourname(), loversDTO.getCrushname());
		loversDTO.setResult(calculateLove);
		
		//create another session with permanent session
		HttpSession session = request.getSession(); // this is the object to create a new permanent session with
		session.setAttribute("crush", loversDTO.getCrushname());

		return "homepage";
	}

}
