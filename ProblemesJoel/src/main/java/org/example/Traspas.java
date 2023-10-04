package org.example;

import java.util.Scanner;

public class Traspas {
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int any = ent.nextInt();    //Inicialitzem l'any, llegint la dada

        //Mostrem el resultat segons si l'any és o no de traspàs
        //if( (any % 4 == 0 && any % 100 != 0)  || any % 400 == 0     ) System.out.println("SI");
        //else System.out.println("NO");
        System.out.println( (any % 4 == 0 && any % 100 != 0)  || any % 400 == 0  ? "SI": "NO");


        /*
        if( any % 4 == 0 && any % 100 != 0 ) System.out.println("SI");
        else if(any % 400 == 0) System.out.println("SI");
        else System.out.println("NO");
        */





    }
}
