package org.example;

import java.util.Scanner;

public class BolasLobas {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numcasos = ent.nextInt();

        while (numcasos-- > 0) {
            String paraula = ent.next();
            int posicio1 = ent.nextInt();
            int posicio2 = ent.nextInt();

            String paraulaCadena = new String();

            for (int i = 0; i < paraula.length(); i++) {
                if (i == posicio1) {
                    System.out.print(paraula.charAt(posicio2));
                } else if (i == posicio2) {
                    System.out.print(paraula.charAt(posicio1));
                } else System.out.print(paraula.charAt(i));
            }
            System.out.println();
        }

    }

}
