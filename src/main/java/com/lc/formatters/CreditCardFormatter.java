package com.lc.formatters;

import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Pattern;

import org.springframework.format.Formatter;

import com.lc.api.CardDetail;

public class CreditCardFormatter implements Formatter<CardDetail> {

	@Override
	public String print(CardDetail cardDetails, Locale locale) {

		return cardDetails.getFirstNumbers() + "-" + cardDetails.getSecondNumbers() + "-"
				+ cardDetails.getThirdNumbers() + "-" + cardDetails.getFourthNumbers();
	}

	@Override
	public CardDetail parse(String cardDetails, Locale locale) throws ParseException {

		CardDetail details = new CardDetail();

		details.setFirstNumbers(cardDetails.substring(0, 4));
		details.setSecondNumbers(cardDetails.substring(4, 8));
		details.setThirdNumbers(cardDetails.substring(8, 12));
		details.setFourthNumbers(cardDetails.substring(12, 16));
		return details;
	}

}
