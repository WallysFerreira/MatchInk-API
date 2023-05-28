package com.matchink.api.Controller;

import com.matchink.api.Model.Usuario;
import com.matchink.api.JsonPatch;
import com.matchink.api.Repository.UsuarioRepository;
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

    @PatchMapping("/usuarios/{id}")
    Usuario atualizarCampo(@PathVariable String id, @RequestBody JsonPatch patch) {
        Usuario usuario = repository.findById(id).orElseThrow(() -> new UsuarioNaoEncontradoException(id));

        switch(patch.getOp()) {
            case "replace":
                switch(patch.getPath()) {
                    case "bio":
                        usuario.setBio(patch.getValue());
                        break;
                    case "url_foto_perfil":
                        usuario.setUrl_foto_perfil(patch.getValue());
                        break;
                    default:
                        throw new CampoNaoEncontradoException(patch.getPath());
                }
        }

        repository.save(usuario);

        return usuario;
    }
}
