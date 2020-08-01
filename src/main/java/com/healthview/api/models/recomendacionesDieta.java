package com.healthview.api.models;

import javax.persistence.*;

@Entity
@Table(name="recomendaciones_dieta")

public class recomendacionesDieta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="uno", columnDefinition = "varchar(200)")
    private String uno;

    @Column(name="dos", columnDefinition = "varchar(200)")
    private String dos;

    public recomendacionesDieta(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }


}