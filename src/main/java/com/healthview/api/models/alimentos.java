package com.healthview.api.models;


import javax.persistence.*;

@Entity
@Table(name="alimentos")

public class alimentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="nombre_al", columnDefinition = "varchar(100)")
    private String nombreAl;

    @Column(name="porcion", columnDefinition = "varchar(100)")
    private String porcion;

    @Column(name="c_kal", columnDefinition = "varchar(10)")
    private String cKal;

    @Column(name="grasa", columnDefinition = "varchar(10)")
    private String grasa;

    @Column(name="carbohidratos", columnDefinition = "varchar(10)")
    private String carbohidratos;

    @Column(name= "proteina", columnDefinition = "varchar(10)")
    private String proteina;

    @Column(name= "imagen", columnDefinition = "varchar(10)")
    private String imagen;

    public alimentos(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAl() {
        return nombreAl;
    }

    public void setNombreAl(String nombreAl) {
        this.nombreAl = nombreAl;
    }

    public String getPorcion() {
        return porcion;
    }

    public void setPorcion(String porcion) {
        this.porcion = porcion;
    }

    public String getcKal() {
        return cKal;
    }

    public void setcKal(String cKal) {
        this.cKal = cKal;
    }

    public String getGrasa() {
        return grasa;
    }

    public void setGrasa(String grasa) {
        this.grasa = grasa;
    }

    public String getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(String carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}

