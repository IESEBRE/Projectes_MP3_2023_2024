package org.example.model;

import java.io.Serializable;

public class Alumne implements Serializable {

    private String nom;
    private double pes;

    public Alumne(String nom, double pes) {
        this.nom = nom;
        this.pes = pes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }
}
