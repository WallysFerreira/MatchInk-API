package com.matchink.api.Controller;

import com.matchink.api.Model.Estudio;
import com.matchink.api.Repository.EstudioRepository;
import com.matchink.api.Repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/estudios")
@RestController
public class EstudioController {
    private EstudioRepository repository;
    @Autowired
    private UsuarioRepository repo;

    public EstudioController(EstudioRepository repository) { this.repository = repository; }

    @PostMapping()
    @Validated
    Estudio adicionarEstudio(@RequestBody @Valid Estudio estudio) {
        if (repo.existsById(estudio.getId_dono())) {
            return repository.save(estudio);
        } else {
            throw new UsuarioNaoEncontradoException(estudio.getId_dono());
        }
    }
}
