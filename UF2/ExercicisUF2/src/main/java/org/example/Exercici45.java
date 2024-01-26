package org.example;

import java.util.Scanner;

public class Exercici45 {

    //Variables del programa
    static int num1, num2, compt;


    public static void main(String[] args) {
        
        inicialitzarVariables();
        
        do{
            tractarElement();

        }while(!elementFinal());
        
        tractamentFinal();
        
    }

    private static void tractamentFinal() {
        System.out.printf("%nHas introduït %d parelles.%n", compt);
    }

    private static boolean elementFinal() {
        return num1==num2 || num1==0 || num2==0;
    }

    private static void tractarElement() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduix una parella de números enters (iguals entre ells o iguals a 0 per acabar):");
        num1=ent.nextInt();
        num2=ent.nextInt();

        //Incrementem comptador de parelles
        compt++;
    }

    private static void inicialitzarVariables() {
        //Posem el comptador a 0
        compt=0;
    }


}
