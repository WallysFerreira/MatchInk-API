package com.matchink.api.Controller;

public class CampoNaoEncontradoException extends RuntimeException{
    public CampoNaoEncontradoException(String campo) { super("Campo " + campo + " não encontrado"); }
}
