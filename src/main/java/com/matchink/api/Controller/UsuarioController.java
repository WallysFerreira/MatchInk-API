package com.matchink.api.Controller;

import com.matchink.api.Model.Usuario;
import com.matchink.api.Repository.UsuarioRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/usuarios/{id}")
    Usuario retornarUmUsuario(@PathVariable String id) {
        return repository.findById(id).orElseThrow(() -> new UsuarioNaoEncontradoException(id));
    }
}
