package com.healthview.api.models;


import javax.persistence.*;

@Entity
@Table(name="dieta")


public class dieta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="tipo_dieta", columnDefinition = "varchar(1)")
    private String alturatipoDietahist;

    @Column(name="desayunos", columnDefinition = "varchar(300)")
    private String desayunos;

    @Column(name="comidas", columnDefinition = "varchar(300)")
    private String comidas;

    @Column(name="cenas", columnDefinition = "varchar(300)")
    private String cenas;

    @Column(name="colacion1", columnDefinition = "varchar(300)")
    private String colacion1;

    @Column(name="colacion2", columnDefinition = "varchar(300)")
    private String colacion2;


    public dieta(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlturatipoDietahist() {
        return alturatipoDietahist;
    }

    public void setAlturatipoDietahist(String alturatipoDietahist) {
        this.alturatipoDietahist = alturatipoDietahist;
    }

    public String getDesayunos() {
        return desayunos;
    }

    public void setDesayunos(String desayunos) {
        this.desayunos = desayunos;
    }

    public String getComidas() {
        return comidas;
    }

    public void setComidas(String comidas) {
        this.comidas = comidas;
    }

    public String getCenas() {
        return cenas;
    }

    public void setCenas(String cenas) {
        this.cenas = cenas;
    }

    public String getColacion1() {
        return colacion1;
    }

    public void setColacion1(String colacion1) {
        this.colacion1 = colacion1;
    }

    public String getColacion2() {
        return colacion2;
    }

    public void setColacion2(String colacion2) {
        this.colacion2 = colacion2;
    }


}