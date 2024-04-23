package org.example.model;

import java.io.Serializable;

public class Alumne implements Serializable {

    private String nom;
    private double pes;
    private boolean matriculat;


    public Alumne(String nom, double pes, boolean matriculat) {
        this.nom = nom;
        this.pes = pes;
        this.matriculat=matriculat;
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

    public boolean isMatriculat() {
        return matriculat;
    }

    public void setMatriculat(boolean matriculat) {
        this.matriculat = matriculat;
    }


}
