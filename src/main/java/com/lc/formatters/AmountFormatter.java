package com.lc.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.lc.api.Amount;

public class AmountFormatter implements Formatter<Amount> {

	@Override
	public String print(Amount object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Amount parse(String bill, Locale locale) throws ParseException {
		
		System.out.println("inside this amount formmater method");
		
		Amount amount = new Amount();
		String[] split = bill.split("");
		
//		if(bill.indexOf("") == -1) {
//			amount.setBillAmount(split[0]);
//		}
//		
		
		return null;
		
	}

}
