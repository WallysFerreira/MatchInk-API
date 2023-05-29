package com.matchink.api.Model;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailUnicoValidator.class)
public @interface EmailUnico {
    String message() default "Email já registrado";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
