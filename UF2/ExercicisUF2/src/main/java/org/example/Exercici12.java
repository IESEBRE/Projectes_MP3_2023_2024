package org.example;

import java.util.Scanner;

import static com.iesebre.prova.library.Cadena.buscaCadena;

public class Exercici12 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text="", subcadena;
        int index=0, compt=0;

        //demanem a l'usuari un text acabat en punt
        System.out.println("Introduix un text acabat en punt:");
        do{
            String linia=ent.nextLine();
            text+=linia;
            if(linia.trim().endsWith(".")) break;
            else text+="\n";
        }while(true);

        System.out.println("Introduix un text a buscar dins l'anterior:");
        subcadena=ent.nextLine();

        System.out.println("La subcadena apareix a les posicions:");
        while(true){
            int aparicio=buscaCadena(text,subcadena,index);
            if(aparicio!=-1){       //Hem trobat la subcadena, per tant mostrem la posició i incrementem el comptador
                System.out.println(aparicio);
                compt++;
            }else break;            //No hem trobat la subcadena, per tant ja podem sortir del bucle
            index=aparicio+1;
        }

        System.out.printf("Total d'aparicions: %d%n", compt);
    }

}
