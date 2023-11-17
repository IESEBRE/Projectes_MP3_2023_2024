package org.example.nf2.cadenes;

import java.util.Scanner;

public class CadenesIV {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        char resposta = ' ';

        do {
            System.out.println("Estàs d'acord? (s/n):");
            String cadenaResposta = ent.nextLine().trim();     //Llegim la resposta de l'usuari
            if (cadenaResposta.length() != 0 && !cadenaResposta.isEmpty()) {
                resposta = cadenaResposta.charAt(0);
                break;
            }
            else System.out.println("Has de contestar s/n");
        }while(true);



        if(resposta == 's' || resposta =='S') System.out.println("Has dit que sí!!");
        else System.out.println("No has dit que sí :-(");

        do {
            System.out.println("Estàs d'acord? (s/n):");
            String cadenaResposta = ent.nextLine().toLowerCase();     //Llegim la resposta de l'usuari
            if (!cadenaResposta.isBlank()) {
                resposta = cadenaResposta.charAt(0);
                break;
            }
            else System.out.println("Has de contestar s/n");
        }while(true);

        if(resposta == 's') System.out.println("Has dit que sí!!");
        else System.out.println("No has dit que sí :-(");
    }
}
