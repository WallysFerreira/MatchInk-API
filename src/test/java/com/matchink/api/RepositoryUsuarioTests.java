package com.matchink.api;

import com.matchink.api.Model.Usuario;
import com.matchink.api.Repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

@DataMongoTest
public class RepositoryUsuarioTests {
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
