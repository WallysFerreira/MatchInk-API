package com.matchink.api.Controller;

import com.matchink.api.Model.Usuario;
import com.matchink.api.Repository.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/usuarios")
    Usuario adicionarUsuario(@RequestBody Usuario novoUsuario) {
        return repository.save(novoUsuario);
    }
}
