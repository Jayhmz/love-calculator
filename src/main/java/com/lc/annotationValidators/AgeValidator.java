package com.lc.annotationValidators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;
	
	@Override
	public void initialize(Age age) {
		this.lower = age.minimum();
		this.upper = age.maximum();
	}
	
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext arg1) {
		if(value == null)
			return false;
		if(value < lower || value > upper)
			return false;
		return true;
	}

	
}
