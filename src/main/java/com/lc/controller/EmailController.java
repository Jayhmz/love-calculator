package com.lc.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.lc.api.EmailDTO;
import com.lc.api.LoversDTO;
import com.lc.services.EmailService;

@Controller
public class EmailController {

	@Autowired
	EmailService emailService;

	@GetMapping("/send-mail")
	public String sendMail(@ModelAttribute("email") EmailDTO email, Model model,
			HttpSession session) {
		
		Object attribute = session.getAttribute("crush");
		System.out.println(attribute);
		
		return "email";
	}

	@PostMapping("/process-email")
	public String processEmail(@Valid @ModelAttribute("email") EmailDTO emailDTO, BindingResult result,
			@SessionAttribute("dto") LoversDTO loverboy, Model model) {

		if (result.hasErrors())
			return "email";

		emailService.sendEmail(loverboy.getYourname(), emailDTO.getEmail(), loverboy.getResult());

		return "process-email";
	}
	
}
