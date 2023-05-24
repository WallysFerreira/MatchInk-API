package com.matchink.api;

import com.matchink.api.model.Usuario;
import org.junit.jupiter.api.Test;

class ModelUsuarioTests {
    Usuario teste = new Usuario("Teste", "teste@email.com");

    @Test
    void e_tatuador_defaults_false() {
        assert(!teste.isTatuador());
    }

    @Test
    void comecacom_likesevisu_em0() {
        assert(teste.getLikes() == 0 && teste.getVisualizacoes() == 0);
    }

    @Test
    void comecacom_id_estudios_vazio() {
        assert(teste.getId_estudios().size() == 0);
    }

    @Test
    void comecacom_url_fotos_vazio() {
        assert(teste.getUrl_fotos().size() == 0);
    }

    @Test
    void comecasem_link_insta() {
        assert(teste.getLink_insta() == null);
    }

    @Test
    void set_url_foto_perfil() {
        String url = "teste.com";

        teste.setUrl_foto_perfil(url);

        assert(teste.getUrl_foto_perfil() == url);
    }

    @Test
    void adicionar_estudio() {
        String id_estudio = "a34af39aj4a556a";

        teste.pushId_estudio(id_estudio);

        assert(teste.getId_estudios().size() == 1);
    }

    @Test
    void set_bio() {
        String bio = "lorem ipsum";

        teste.setBio(bio);

        assert(teste.getBio() == bio);
    }

    @Test
    void set_link_insta() {
        String link_insta = "instagram.com/fulano";

        teste.setLink_insta(link_insta);

        assert(teste.getLink_insta() == link_insta);
    }

    @Test
    void incrementar_likes() {
        teste.setLikes();
        teste.setLikes();
        teste.setLikes();

        assert(teste.getLikes() == 3);
    }

    @Test
    void incrementar_visualizacoes() {
        teste.setVisualizacoes();

        assert(teste.getVisualizacoes() == 1);
    }

    @Test
    void adicionar_fotos() {
        String url = "www.teste.com/tanana.jpg";
        teste.pushUrl_fotos(url);
        assert(teste.getUrl_fotos().size() == 1);
    }
}
