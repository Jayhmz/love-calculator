package com.lc.annotationValidators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = MobileValidator.class)
public @interface Mobile {
	
	String countryCode() default "+234";
	String userNumber() default "1234567890";
	String message() default "{PhoneErrorMessage}";
	
	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
