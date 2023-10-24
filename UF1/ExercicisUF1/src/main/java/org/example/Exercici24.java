package org.example;

import java.util.Scanner;

public class Exercici24 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n;
        char lletra='A';

        //Demanem a l'usuari l'entrada, forçant a que sigue correcta
        do{
            System.out.println("Introduix un enter major que 0:");
            n=ent.nextInt();
            if(n>0) break;
            else System.out.println("Ha de ser major major que 0!!");
        }while(true);

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if(Character.isLetter(lletra)) System.out.printf("%c ", lletra);
                else j--;       //Evitem avançar a la següent columna de la fila
                if( lletra == 'z') lletra='A';  //Si hem arribat a l'última lletra imprimible tornem a la primera
                else lletra++;       //Passem a la següent lletra
            }
            System.out.println();
        }



    }


}
