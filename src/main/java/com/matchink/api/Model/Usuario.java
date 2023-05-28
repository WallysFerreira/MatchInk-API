package com.matchink.api.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    @Id private String id;

    private List<String> id_estudios;
    private boolean e_tatuador;
    private String nome;
    private String url_foto_perfil;
    private String bio;
    private String link_insta;
    private String email;
    private int likes;
    private int visualizacoes;
    private List<String> url_fotos;

    public Usuario() {
    }

    public Usuario(@JsonProperty("nome") String nome, @JsonProperty("email") String email) {
        this.nome = nome;
        this.email = email;
        likes = visualizacoes = 0;
        this.url_fotos = new ArrayList<String>();
        this.id_estudios = new ArrayList<String>();
        e_tatuador = false;
    }

    public Usuario(@JsonProperty("tatuador") boolean e_tatuador, @JsonProperty("nome") String nome, @JsonProperty("email") String email) {
        this.e_tatuador = e_tatuador;
        this.nome = nome;
        this.email = email;
        likes = visualizacoes = 0;
        this.url_fotos = new ArrayList<String>();
        this.id_estudios = new ArrayList<String>();
    }

    public boolean isTatuador() {
        return e_tatuador;
    }

    public String getId() {
        return id;
    }

    public int getLikes() {
        return likes;
    }

    public List<String> getId_estudios() {
        return id_estudios;
    }

    public List<String> getUrl_fotos() {
        return url_fotos;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public String getLink_insta() {
        return link_insta;
    }

    public String getNome() {
        return nome;
    }

    public String getUrl_foto_perfil() {
        return url_foto_perfil;
    }

    public String getBio() {
        return bio;
    }

    public String getEmail() {
        return email;
    }

    public void setUrl_foto_perfil(String url_foto_perfil) {
        this.url_foto_perfil = url_foto_perfil;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setLink_insta(String link_insta) {
        this.link_insta = link_insta;
    }

    public void setLikes() {
        this.likes += 1;
    }

    public void setVisualizacoes() {
        this.visualizacoes += 1;
    }

    public void pushId_estudio(String id_estudio) {
        this.id_estudios.add(id_estudio);
    }

    public void pushUrl_fotos(String url_foto) {
        this.url_fotos.add(url_foto);
    }
}
