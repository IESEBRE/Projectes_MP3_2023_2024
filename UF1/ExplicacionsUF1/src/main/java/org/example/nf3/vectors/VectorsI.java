package org.example.nf3.vectors;

import java.util.Scanner;

public class VectorsI {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int a=9;


        //Declaració de variables de tipo vector
        int[] vectorEnters;
        char[] vChars;
        boolean[] respostes;
        String[] frases;
        Scanner[] entrades;

        //Declaració i instanciaicó en una sola instrucció
        int[] diesMes = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        char[] lletres={'A','d','é','u'};           //Podem no posar el new, però només si declarem i instanciem a la vegada

        //Instanciació de vectors
        vectorEnters=new int[4];       //instanciat un vector de 4 caselles enteres
        vChars=new char[]{'H','o','l','a'};
        respostes=new boolean[]{true, false, true};

        //Accés a les caselles d'un vector
        vChars[0] = 'h';
        System.out.println(vChars[0]);

        //vChars[33]=' ';               genera una excepció ArrayIndexOutOfBoundsException

        //Recorregut d'un vector
        for (int i = 0; i < vChars.length; i++) {
            System.out.print(vChars[i]);
        }

        //Instanciem un vector en temps d'execució
        System.out.println("Quants valores vols introduir?:");
        a=ent.nextInt();

        int[] valors= new int[a];
        a++;

        for (int i = 0; i < valors.length; i++) {
            System.out.printf("Introduix el valor %d del vector:", i+1);
            valors[i]=ent.nextInt();
        }


    }

}
