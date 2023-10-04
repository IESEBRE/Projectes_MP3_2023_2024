package org.example;

import java.util.Scanner;

public class CondicionalsIII {

    public static void main(String[] args) {

        //Nova estructura condicional --> switch
        /*
        switch( expressió ){
            case valor1:
                //instruccions del cas
                break;
            //altres case
            case valorN:
                //instruccions del cas
                break;
            default:    //en qualsevol altre cas (és opcional)
                //instruccions del default
         }
         */

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int dia;

        //Demanem a l'usuari la introducció d'un dia de la setmana numèric
        System.out.println("Escriu un dia lectiu de la setmana (1-5) i te diré el seu nom:");
        dia = ent.nextInt();

        //Mostrem el resultat usant un switch
        switch( dia ){
            case 1:     //equivalent a if( dia == 1 ) System.out.println("És dilluns :-(");
                System.out.println("És dilluns :-(");
                break;
            case 2:     //equivalent a if( dia == 2 ) System.out.println("És dimarts :-(");
                System.out.println("És dimarts :-(");
                break;
            case 3:     //equivalent a if( dia == 3 ) System.out.println("És dimecres :-|");
                System.out.println("És dimecres :-|");
                break;
            case 4:     //equivalent a if( dia == 4 ) System.out.println("És dijous :-|");
                System.out.println("És dijous :-|");
                break;
            case 5:     //equivalent a if( dia == 5 ) System.out.println("És divendres :-)");
                System.out.println("És divendres :-)");
                break;
            default:
                if(dia == 6 || dia == 7) System.out.println("És finde :-))");
                else System.out.println("Dia incorrecte!!");

        }

        switch(dia){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("No és finde");
                break;
            case 6:
            case 7:
                System.out.println("És finde");
                break;
                default:
                System.out.println("Dia incorrecte");
        }
    }




}
