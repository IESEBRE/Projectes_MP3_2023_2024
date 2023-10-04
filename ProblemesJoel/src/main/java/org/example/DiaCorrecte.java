package org.example;

import java.util.Scanner;

public class DiaCorrecte {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int dia = ent.nextInt();    //Inicialitzem el dia, llegint la dada

        //Mostrem el resultat
        /*if(dia>=1 && dia<366 ) System.out.println("Correcte per un any no bixest!");
        else if( dia == 366 )  System.out.println("Correcte per un any bixest!");
        else System.out.println("Incorrecte!");
        */
        System.out.println( dia>=1 && dia<366 ? "Correcte per un any no bixest!" :
                (dia == 366 ? "Correcte per un any bixest!" : "Incorrecte!"));

    }
}
