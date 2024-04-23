package org.example.model;

import java.io.Serializable;
import java.util.Collection;

public class Alumne implements Serializable {

    private String nom;
    private double pes;
    private boolean matriculat;

    private Collection<Matricula> matricules;


    public Alumne(){}

    public Alumne(String nom, double pes, boolean matriculat, Collection<Matricula> matricules) {
        this.nom = nom;
        this.pes = pes;
        this.matriculat=matriculat;
        this.matricules=matricules;
    }

    public Collection<Alumne.Matricula> getMatricules() {
        return matricules;
    }

    private void setMatricules(Collection<Matricula> matricules) {
        this.matricules = matricules;
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

    public static class Matricula implements Comparable<Matricula>{

        @Override
        public int compareTo(Matricula o) {
            return this.modul.compareTo(o.getModul());
        }

        public static enum Modul {
            MP1("Sistemes informàtics"), MP2("Bases de dades"), MP3("Programació"),
            MP4("Llenguatge de marques"), MP5("Entorns de desenvolupament"),
            MP6("Accés a dades"), MP7("Desenvolupament d'interfícies"),
            MP8("Programació multimèdia i dispositius mòbils"),
            MP9("Programació de serveis i processos"),
            MP10("Sistemes de gestió empresarial"), MP11("FOL"),
            MP12("Empresa i empreneduria"), MP13("Projecte"), MP14("Formació en centre de treball");
            private String nom;

            private Modul(String nom) {
                this.nom = nom;
            }

            public String getNom() {
                return nom;
            }

            @Override
            public String toString() {
                return this.name()+" - " +nom;
            }
        }

        private Matricula.Modul modul;
        private int nota;

        public Matricula(Matricula.Modul modul, int nota) {
            this.modul = modul;
            this.nota = nota;
        }

        public Matricula.Modul getModul() {
            return modul;
        }

        public void setModul(Matricula.Modul modul) {
            this.modul = modul;
        }

        public int getNota() {
            return nota;
        }

        public void setNota(int nota) {
            this.nota = nota;
        }
    }


}

