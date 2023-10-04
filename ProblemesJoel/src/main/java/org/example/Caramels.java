package org.example;

import java.util.Scanner;

public class Caramels {

    public static void main(String[] args) {

        //Declaració de variables
        Scanner ent=new Scanner(System.in);

        int nebots, caramels;


        //LLegim les dades
        caramels = ent.nextInt();
        nebots = ent.nextInt();

        //Mostrem el resultat
        System.out.println(caramels % nebots);

    }


}
