package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class CistellCompra {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = Integer.parseInt(ent.next());
        String[] noms=new String[numCasos];
        double[] preus=new double[numCasos];

        //Llegim els productes i els guardem als respectius vectors
        while (numCasos-- > 0) {
            //Tractament de cada cas
            noms[numCasos]=ent.next();
            preus[numCasos]=Double.parseDouble(ent.next());
        }

        //Llegim el producte seleccionat
        int selec=Integer.parseInt(ent.next());

        //Fem una còpia dels vectors, per després ordenar-los
        String[] copiaNoms=new String[noms.length];
        double[] copiaPreus=new double[preus.length];
        for (int i = 0; i < noms.length; i++) {
            copiaNoms[i]=noms[i];
            copiaPreus[i]=preus[i];
        }

        //Ordenem les còpies
        Arrays.sort(copiaPreus);

        //Obtenim els preus demanats
        double preuMesBarat=copiaPreus[0];
        double preuMesCar=copiaPreus[copiaPreus.length-1];
        double preuSeleccionat=copiaPreus[copiaPreus.length-selec];
        String producteMesBarat=null;
        String producteMesCar=null;
        String producteSeleccionat=null;

        //Recorrem el vector de preus original buscant els preus demanats
        int comptadorTrobats=0;
        for (int i = 0; i < preus.length && comptadorTrobats<3; i++) {
            if(preus[i]==preuMesBarat){
                producteMesBarat=noms[i];
                comptadorTrobats++;
            }
            if(preus[i]==preuMesCar) {
                producteMesCar = noms[i];
                comptadorTrobats++;
            }
            if(preus[i]==preuSeleccionat){
                producteSeleccionat=noms[i];
                comptadorTrobats++;
            }
        }

        //Mostrem el resultat demanat
        System.out.println("EL MES CAR: "+producteMesCar+" "+preuMesCar);
        System.out.println("EL MES BARAT: "+producteMesBarat+" "+preuMesBarat);
        System.out.println("EL BUSCAT: "+producteSeleccionat+" "+preuSeleccionat);

    }

}
