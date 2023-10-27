package org.example.nf3.vectors;

import java.util.Random;
import java.util.Scanner;

public class Exercici9 {

    //Feu un programa en Java que demane a l'usuari la introducció d'un número enter
    // positiu n, forçant a que sigue correcte, i a continuació mostre n caracters
    // entre la A i la Z (majúscules), de mode aleatori.
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Random r = new Random();
        int[] comptadors = new int['Z'-'A'+1];  //inicialitzat a 0
        int n;

        //Bucle que força a l'usuari a introduir un número enter positiu
        do{
            System.out.println("Introduix un enter positiu:");
            n=ent.nextInt();
            if(n<=0) System.out.println("Ha de ser un enter positiu!!");
            else break;
        }while(true);

        //Bucle per mostrar i comptar els n caracters aleatoris
        for (int i = 0; i < n; i++) {
            char c =(char) (r.nextInt('Z'-'A'+1)+'A');   //Lletra generada aleatòriament
            //Incrementem el comptador de la lletra
            comptadors[c-'A']=comptadors[c-'A']+1;
            //Mostrem la lletra
            System.out.printf("%c",c);
        }
        System.out.println();

        //Mostrem les ocurrències dels caràcters
        for (int i = 0; i < comptadors.length; i++) {
            if(comptadors[i]!=0){   //Només mostrem el comptador de les lletres que han sortit
                System.out.printf("El caràcter %c ha sortit %d vegades.%n", i +'A', comptadors[i]);
            }
        }
        System.out.println();
    }

}
