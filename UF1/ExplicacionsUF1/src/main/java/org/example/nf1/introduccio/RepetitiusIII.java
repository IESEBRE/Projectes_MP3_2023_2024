package org.example.nf1.introduccio;

import java.util.Scanner;

public class RepetitiusIII {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int valor;

        do{
            System.out.println("Introduix un valor enter positiu major que 0:");
            valor=ent.nextInt();
            if(valor>0) break; //negació de la condició del while
            else System.out.println("T'he dit que ha de ser positiu major que 0!!");
        }while(true);

        System.out.println("Adéu!!");

    }



}
