package com.matchink.api;

import com.matchink.api.model.Usuario;
import com.matchink.api.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

@DataMongoTest
public class RepositoryUsuarioClass {
    @Autowired
    UsuarioRepository repo;

    @Test
    void teste_save() throws Exception {
        Usuario teste1 = new Usuario("testesave", "save@email.com");
        repo.save(teste1);
        assert(teste1.getId() != null);
    }

    @Test
    void teste_save_falha() throws Exception {
        Usuario teste2 = new Usuario("testesaveerrado", "saveerrado@email.com");
        assert(teste2.getId() == null);
    }
}
