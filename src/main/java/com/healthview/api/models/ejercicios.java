package com.healthview.api.models;

import javax.persistence.*;

@Entity
@Table(name="ejercicios")

public class ejercicios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="nomEjerc", columnDefinition = "varchar(100)")
    private String nomEjerc;

    @Column(name="cKal", columnDefinition = "varchar(50)")
    private String cKal;

    public ejercicios(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomEjerc() {
        return nomEjerc;
    }

    public void setNomEjerc(String nomEjerc) {
        this.nomEjerc = nomEjerc;
    }

    public String getcKal() {
        return cKal;
    }

    public void setcKal(String cKal) {
        this.cKal = cKal;
    }

}
