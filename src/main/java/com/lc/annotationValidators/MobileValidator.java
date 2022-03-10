package com.lc.annotationValidators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.lc.api.Phone;

public class MobileValidator implements ConstraintValidator<Mobile, Phone> {

	String countryCode;
	String userNumber;
	@Override
	public void initialize(Mobile mobile) {
		this.countryCode = mobile.countryCode();
		this.userNumber = mobile.userNumber();
	}
	
	@Override
	public boolean isValid(Phone phone, ConstraintValidatorContext arg1) {
		System.out.println("it got to this point");
		
		//create the validation for the phone as well. 
		if (phone == null)
			return false;

		return true;
	}

}
