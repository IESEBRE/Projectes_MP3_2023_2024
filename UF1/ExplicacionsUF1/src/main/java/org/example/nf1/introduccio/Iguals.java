package org.example;

import java.util.Scanner;

public class Iguals {
    //Fer un programa en Java que demane la introducció de 2 números enters i digue si són iguals
    // o quin és major que quin
    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int num1, num2;

        //lectura de dades
        System.out.println("Introduix 2 números enters:");
        num1=ent.nextInt();
        num2=ent.nextInt();

        //Resultat
        if( num1 == num2 ) System.out.println("Els valors són iguals.");



    }
}
