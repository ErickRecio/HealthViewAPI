package com.healthview.api.models;


import javax.persistence.*;


@Entity
@Table(name="datos_usuario")

public class datosUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="altura", columnDefinition = "varchar(10)")
    private String altura;

    @Column(name="pulso_radial", columnDefinition = "varchar(10)")
    private String pulsoRadial;

    @Column(name="peso", columnDefinition = "varchar(10)")
    private String peso;

    @Column(name="actFis", columnDefinition = "varchar(30)")
    private String actFis;

    @Column(name="nombre_us", columnDefinition = "int")
    private int nombreUs;

    public datosUsuario(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPulsoRadial() {
        return pulsoRadial;
    }

    public void setPulsoRadial(String pulsoRadial) {
        this.pulsoRadial = pulsoRadial;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getActFis() {
        return actFis;
    }

    public void setActFis(String actFis) {
        this.actFis = actFis;
    }

    public int getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(int nombreUs) {
        this.nombreUs = nombreUs;
    }



}
