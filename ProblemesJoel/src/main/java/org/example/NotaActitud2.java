package org.example;

import java.util.Scanner;

public class NotaActitud2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while(numCasos-->0){
            //Tractament de cada cas
            int numNotes = ent.nextInt();       //indica grandària dels vectors
            int[] abans = new int[numNotes];
            int[] despres = new int[numNotes];
            //int[] diferencies = new int[numNotes];

            //Llegim les notes abans d'actitud
            for (int i = 0; i < abans.length; i++) {
                abans[i] = ent.nextInt();
            }

            //Llegim les notes després d'actitud
            for (int i = 0; i < despres.length; i++) {
                despres[i] = ent.nextInt();
            }

            //Calculem el resultat en una sola passada dels bucles
            int maxima=despres[0]-abans[0], comptador=1;
            for (int i = 1; i < abans.length; i++) {
                int diferencia = despres[i]-abans[i];
                if(diferencia>maxima){
                    maxima=diferencia;
                    comptador=1;
                } else if (diferencia == maxima) {
                    comptador++;
                }
            }
/*
            //Calculem les diferències entre les notes
            for (int i = 0; i < diferencies.length; i++) {
                diferencies[i]=despres[i]-abans[i];
            }

            //Anem a calcular la nota màxima i comptar quants alumnes la tenen
            int maxima = diferencies[0];
            for (int i = 1; i < diferencies.length; i++) {
                if( diferencies[i] > maxima) maxima=diferencies[i];
            }

            //Comptem quants alumnes tenen la nota maxima
            int comptador = 0;
            for (int i = 0; i < diferencies.length; i++) {
                if(diferencies[i] == maxima) comptador++;
            }
*/
            //Mostrem el resultat
            System.out.printf("%d %d%n", maxima, comptador);
        }

    }
}
