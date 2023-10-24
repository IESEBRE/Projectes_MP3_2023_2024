package org.example;

import java.util.Scanner;

public class CambialoUnPoco {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while(numCasos-->0){
            //Declaració de variables
            int numValors; // = ent.nextInt();
            int[] valors; //= new int[numValors];
            int valorBuscat, nouValor;

            //Instanciació de les variables
            numValors = ent.nextInt();
            valors = new int[numValors];

            //LLegim els valors a guardar dins del vector
            for (int i = 0; i < valors.length; i++) {
                valors[i] = ent.nextInt();
            }

            valorBuscat = ent.nextInt();
            nouValor = ent.nextInt();
            //Fi de lectura de l'entrada

            //Mostrem el canvi
            for (int i = 0; i < valors.length; i++) {
                if( valors[i] == valorBuscat  ) System.out.print(nouValor);
                else System.out.print(valors[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
