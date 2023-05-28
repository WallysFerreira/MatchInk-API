package com.matchink.api.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CampoNaoEncontradoAdvice {
    @ResponseBody
    @ExceptionHandler(CampoNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String CampoNaoEncontradoHandler(CampoNaoEncontradoException ex) { return ex.getMessage(); }
}
