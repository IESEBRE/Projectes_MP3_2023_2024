package org.example.nf1.introduccio;

import java.util.Scanner;

public class RepetitiusII {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int valor;

        //System.out.println("Introduix un valor enter (0 per finalitzar):");
        //valor=ent.nextInt();

        //Demanar a l'usuari la introducció d'un valor mentre no es complix una condició
        /*while(valor!=0){
            System.out.println("Introduix un valor enter (0 per finalitzar):");
            valor=ent.nextInt();
        }*/
        /*
        do{

        }while(condició_true);
        */

        do{
            System.out.println("Introduix un valor enter (0 per finalitzar):");
            valor=ent.nextInt();
        }while(valor!=0);

    }

}
