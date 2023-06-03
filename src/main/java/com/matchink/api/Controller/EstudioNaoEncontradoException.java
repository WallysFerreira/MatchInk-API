package com.matchink.api.Controller;

public class EstudioNaoEncontradoException extends RuntimeException {
    public EstudioNaoEncontradoException(String id) {
        super("Estudio com id " + id + " não foi encontrado");
    }
}
