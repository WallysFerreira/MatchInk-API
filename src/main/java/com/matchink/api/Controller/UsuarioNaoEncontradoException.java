package com.matchink.api.Controller;

public class UsuarioNaoEncontradoException extends RuntimeException {
    public UsuarioNaoEncontradoException(String id) {
        super("Usuario com id " + id + " não foi encontrado");
    }
}
