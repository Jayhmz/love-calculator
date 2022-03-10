package com.lc.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.lc.api.Phone;

public class PhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {

		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String userphone, Locale locale) throws ParseException {

		Phone phone = new Phone();

		String[] split = userphone.split("-");

		if (userphone.indexOf('-') == -1) {
			phone.setCountryCode("99");
			phone.setUserNumber(split[0]);
			
			
		} 
		else if( userphone.startsWith("-")) {
			phone.setCountryCode("99");
			phone.setUserNumber(split[1]);
		}
		else {
			phone.setCountryCode(split[0]);
			phone.setUserNumber(split[1]);
		}

		return phone;
	}

}
