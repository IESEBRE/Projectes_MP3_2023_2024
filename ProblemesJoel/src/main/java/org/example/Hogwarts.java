package org.example;

import java.util.Scanner;

public class Hogwarts {

    public static void main(String[] args) {
        //declaració de variables
        Scanner ent = new Scanner(System.in);
        String resposta;

        //Llegim la rersposta
        resposta = ent.nextLine();

        //Mostrem la casa triada
/*        if( resposta.equals( "Coratge") ){
            System.out.println("Gryffindor");
        } else if ( resposta.equals( "Coneixement")) {
            System.out.println("Ravenclaw");
        } else if ( resposta.equals( "Ambicio")) {
            System.out.println("Slytherin");
        } else {
            System.out.println("Hufflepuff");
        }
*/
        switch( resposta ){
            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");
        }


    }
}
