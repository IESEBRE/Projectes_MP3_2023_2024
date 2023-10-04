package org.example;

import java.util.Scanner;

public class DiaCorrecteAmpliat {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int dia = ent.nextInt();    //Inicialitzem el dia, llegint la dada
        int any = ent.nextInt();    //Inicialitzem l'any, llegint la dada
        boolean anyBixest = (any % 4 == 0 && any % 100 != 0)  || any % 400 == 0;
        //Mostrem el resultat
        if(dia>=1 && dia<=365 || dia == 366 && anyBixest ) System.out.println("Correcte!");
        else System.out.println("Incorrecte!");

    }
}
