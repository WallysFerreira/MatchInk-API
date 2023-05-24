package com.matchink.api.model;

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

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        likes = visualizacoes = 0;
        this.url_fotos = new ArrayList<String>();
    }

    public Usuario(boolean e_tatuador, String nome, String url_foto_perfil, String link_insta, String email) {
        this.e_tatuador = e_tatuador;
        this.nome = nome;
        this.url_foto_perfil = url_foto_perfil;
        this.link_insta = link_insta;
        this.email = email;
        this.url_fotos = new ArrayList<String>();
        likes = visualizacoes = 0;
    }

    public Usuario(String nome, String url_foto_perfil, String bio, String link_insta, String email) {
        this.nome = nome;
        this.url_foto_perfil = url_foto_perfil;
        this.bio = bio;
        this.link_insta = link_insta;
        this.email = email;
        this.url_fotos = new ArrayList<String>();
        likes = visualizacoes = 0;
    }

    public Usuario(boolean e_tatuador, String nome, String url_foto_perfil, String bio, String link_insta, String email) {
        this.e_tatuador = e_tatuador;
        this.nome = nome;
        this.url_foto_perfil = url_foto_perfil;
        this.bio = bio;
        this.link_insta = link_insta;
        this.email = email;
        likes = visualizacoes = 0;
        this.url_fotos = new ArrayList<String>();
    }


}
