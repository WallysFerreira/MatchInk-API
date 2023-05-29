package com.matchink.api.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.net.MalformedURLException;

@ControllerAdvice
public class MalformedURLAdvice {
    @ResponseBody
    @ExceptionHandler(MalformedURLException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    String MalformedURLHandler(MalformedURLException e) { return "URL inválida"; }
}
