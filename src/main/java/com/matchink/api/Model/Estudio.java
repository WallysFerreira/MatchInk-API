package com.matchink.api.Model;

import java.util.List;

public class Estudio {
    @Id private String Id;

    private String id_dono;
    private List<String> id_tatuadores_residentes;
    private List<String> id_tatuadores_convidados;
    private String nome;
    private String link_insta;
    private List<String> url_fotos;
    private float nota;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Estudio() {
    }
}
