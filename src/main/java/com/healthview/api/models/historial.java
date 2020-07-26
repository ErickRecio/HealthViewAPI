package com.healthview.api.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="historial")

public class historial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="alturahist", columnDefinition = "varchar(10)")
    private String alturahist;

    @Column(name="pulsoRadial", columnDefinition = "varchar(10)")
    private String pulsoRadial;

    @Column(name="pesohist", columnDefinition = "varchar(20)")
    private String pesohist;

    @Column(name="actFis", columnDefinition = "varchar(10)")
    private String actFis;

    @Column(name="userfk", columnDefinition = "int")
    private int userfk;

    @Column(name="fechamod", columnDefinition = "Date")
    private Date fechamod;

    public historial(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlturahist() {
        return alturahist;
    }

    public void setAlturahist(String alturahist) {
        this.alturahist = alturahist;
    }

    public String getPulsoRadial() {
        return pulsoRadial;
    }

    public void setPulsoRadial(String pulsoRadial) {
        this.pulsoRadial = pulsoRadial;
    }

    public String getPesohist() {
        return pesohist;
    }

    public void setPesohist(String pesohist) {
        this.pesohist = pesohist;
    }

    public String getActFis() {
        return actFis;
    }

    public void setActFis(String actFis) {
        this.actFis = actFis;
    }

    public int getUserfk() {
        return userfk;
    }

    public void setUserfk(int userfk) {
        this.userfk = userfk;
    }

    public Date getFechamod() {
        return fechamod;
    }

    public void setFechamod(Date fechamod) {
        this.fechamod = fechamod;
    }
}
