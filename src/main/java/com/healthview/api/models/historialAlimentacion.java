package com.healthview.api.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="historialAlimentacion")

public class historialAlimentacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="fechaDato", columnDefinition = "date")
    private Date fechaDato;

    @Column(name="carb", columnDefinition = "varchar(20)")
    private String carb;

    @Column(name="lip", columnDefinition = "varchar(20)")
    private String lip;

    @Column(name="prot", columnDefinition = "varchar(20)")
    private String prot;

    @Column(name="cKal", columnDefinition = "varchar(20)")
    private String cKal;

    @Column(name="userfk", columnDefinition = "varchar(20)")
    private int userfk;

    public historialAlimentacion(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaDato() {
        return fechaDato;
    }

    public void setFechaDato(Date fechaDato) {
        this.fechaDato = fechaDato;
    }

    public String getCarb() {
        return carb;
    }

    public void setCarb(String carb) {
        this.carb = carb;
    }

    public String getLip() {
        return lip;
    }

    public void setLip(String lip) {
        this.lip = lip;
    }

    public String getProt() {
        return prot;
    }

    public void setProt(String prot) {
        this.prot = prot;
    }

    public String getcKal() {
        return cKal;
    }

    public void setcKal(String cKal) {
        this.cKal = cKal;
    }

    public int getUserfk() {
        return userfk;
    }

    public void setUserfk(int userfk) {
        this.userfk = userfk;
    }
}
