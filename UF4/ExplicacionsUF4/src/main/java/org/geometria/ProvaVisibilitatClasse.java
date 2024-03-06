package org.geometria;

public class ProvaVisibilitatClasse {

    public static void main(String[] args) {
        Cercle c=new Cercle();

        Figura f=new Cercle();
        Object o=new Quadrat();

        ((Quadrat)o).setCostat(2);
        System.out.println(((Quadrat)o).calcularArea());

    }

}
