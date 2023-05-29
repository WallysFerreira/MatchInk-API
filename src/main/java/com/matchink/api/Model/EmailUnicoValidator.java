package com.matchink.api.Model;

import com.matchink.api.Repository.UsuarioRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class EmailUnicoValidator implements ConstraintValidator<EmailUnico, String> {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return Objects.isNull(repository.findByEmail(email));
    }
}
