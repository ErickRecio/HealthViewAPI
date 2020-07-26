package com.healthview.api.models;


import javax.persistence.*;

@Entity
@Table(name="recomendaciones")

public class recomendaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="rango", columnDefinition = "varchar(20)")
    private String rango;

    @Column(name="recomendacion", columnDefinition = "varchar(60)")
    private String recomendacion;

    public recomendaciones(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

}

