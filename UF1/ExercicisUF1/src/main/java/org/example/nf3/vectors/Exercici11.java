package org.example.nf3.vectors;

import java.util.Scanner;

public class Exercici11 {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int[][] matriu;
        int valor = 1;
        int n;

        //Demanem la dimensió a l'usuari
        do{
            System.out.println("Introduix la dimensió de la matriu (>=1):");
            n = ent.nextInt();
            if(n<1) System.out.println("Ha de ser major que 0!!");
            else break;
        }while(true);

        //Ja podem instanciar la matriu per què ja sabem la diemnsió
        matriu = new int[n][n];

        //Recorrem la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j]=valor++;
                System.out.print(matriu[i][j]+ " ");
            }
            System.out.println();
        }

    }

}
