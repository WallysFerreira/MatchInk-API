package com.matchink.api.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Estudio {
    @Id
    private String id;

    private String id_dono;
    private List<String> id_tatuadores_residentes;
    private List<String> id_tatuadores_convidados;
    private String nome;
    private String link_insta;
    private List<String> url_fotos;
    private double nota;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Estudio() {
    }

    public Estudio(@JsonProperty("id_dono") String id_dono, @JsonProperty("nome") String nome, @JsonProperty("rua") String rua, @JsonProperty("numero") int numero, @JsonProperty("bairro") String bairro, @JsonProperty("cidade") String cidade, @JsonProperty("estado") String estado) {
        this.id_dono = id_dono;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;

        this.id_tatuadores_residentes = new ArrayList<String>();
        this.id_tatuadores_convidados = new ArrayList<String>();
        this.url_fotos = new ArrayList<String>();

        this.id_tatuadores_residentes.add(id_dono);
        this.nota = 5.0;
    }

    public String getId() {
        return Id;
    }

    public List<String> getId_tatuadores_residentes() {
        return id_tatuadores_residentes;
    }

    public List<String> getId_tatuadores_convidados() {
        return id_tatuadores_convidados;
    }

    public String getNome() {
        return nome;
    }

    public String getLink_insta() {
        return link_insta;
    }

    public List<String> getUrl_fotos() {
        return url_fotos;
    }

    public double getNota() {
        return nota;
    }

    public void setLink_insta(String link_insta) {
        this.link_insta = link_insta;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void pushTatuador_residente(String id) {
        this.id_tatuadores_residentes.add(id);
    }

    public void removeTatuador_residente(String id) {
        for (String idTatuador: id_tatuadores_residentes) {
            if (idTatuador == id) {
                this.id_tatuadores_residentes.remove(id);
                return;
            }
        }
    }

    public void pushTatuador_convidado(String id) {
        this.id_tatuadores_convidados.add(id);
    }

    public void removeTatuador_convidado(String id) {
        for (String idTatuador: id_tatuadores_convidados) {
            if (idTatuador == id) {
                this.id_tatuadores_convidados.remove(id);
                return;
            }
        }
    }

    public void pushFotos(String url) {
        this.url_fotos.add(url);
    }

    public void removeFoto(String url) {
        for(String urlFoto: url_fotos) {
            if (urlFoto == url) {
                url_fotos.remove(url);
                return;
            }
        }
    }
}
