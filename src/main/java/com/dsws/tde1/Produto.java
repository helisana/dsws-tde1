package com.dsws.tde1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Produto {

    @Id
    @GeneratedValue //auto-increment da Id
    private int id;

    private String nome;

    private String anoFabricacao;

    private String ean;

    public Produto() {
    }

    public Produto(int id, String nome, String anoFabricacao, String ean) {
        this.id = id;
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.ean = ean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }
}
