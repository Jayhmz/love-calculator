package com.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lc.api.BillDTO;
import com.lc.api.CardDetail;

@Controller
public class PaymentController {
	
	@GetMapping("/payment")
	public String showPaymentPage(@ModelAttribute("cardNumber") BillDTO dto) {
		
		CardDetail cd = new CardDetail();
		cd.setFirstNumbers("0000");
		cd.setSecondNumbers("8620");
		cd.setThirdNumbers("97");
		cd.setFourthNumbers("0086");
		
		dto.setCardDetail(cd);
		
		
		return "payment"; 
	}
	
	@PostMapping("/order")
	public String processPayment(@ModelAttribute("cardNumber") BillDTO dto) {
		
		return "order";
	}
}
