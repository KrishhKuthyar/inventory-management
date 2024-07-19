package ims.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import ims.validation.FileTypeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Constraint(validatedBy=FileTypeValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FileType {

	/**
	 * Generate error messages
	 *
	 * @return error messages
	 */
	String message() default "{EMSG102}";

	/**
	 * Apply different validations depending on the group
	 *
	 * @return default group
	 */
	Class<?>[] groups() default {};

	/**
	 * Give meta data to the object to be validated.
	 *
	 * @return meta data
	 */
	Class<? extends Payload>[] payload() default {};
}