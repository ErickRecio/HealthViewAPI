package com.healthview.api.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="usuario")

public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="username", columnDefinition = "varchar(60)")
    private String username;
    @Column(name="pass", columnDefinition = "varchar(20)")
    private String pass;
    @Column(name="nombre", columnDefinition = "varchar(30)")
    private String nombre;
    @Column(name="a_paterno", columnDefinition = "varchar(30)")
    private String aPaterno;
    @Column(name="a_materno", columnDefinition = "varchar(30)")
    private String aMaterno;
    @Column(name="sexo", columnDefinition = "varchar(11)")
    private String sexo;
    @Column(name="fecha_nac", columnDefinition = "date")
    private Date fechaNac;

    public usuario(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }



}

