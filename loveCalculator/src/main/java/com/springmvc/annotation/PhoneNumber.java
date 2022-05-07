package com.springmvc.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.springmvc.lc.validator.PhoneValidator;

@Documented
@Retention(RUNTIME)
@Target({ ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER })
@Constraint(validatedBy = PhoneValidator.class)
public @interface PhoneNumber {

	String message() default "invalid phone number";

	int lower() default 10;

	int upper() default 10;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
