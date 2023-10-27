package org.example.nf1.introduccio;

import java.util.Scanner;

public class Exercici22 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n;

        //Forcem a l'usuari a introduir un valor correcte
        do{
            System.out.println("Introduix un enter major que 0:");
            n=ent.nextInt();
            if(n>0) break;
            else System.out.println("Ha de ser major major que 0!!");
        }while(true);

        //Primer dibuix
        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        //Segon dibuix
        for (int i = 1; i <= n; i++) {
            //Bucle que dibuixa espais en blanc
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            //Bucle que dibuixa espais en blanc
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
