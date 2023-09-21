package org.example;

import java.util.Scanner;

public class EntradaDades {

    public static void main(String[] args) {

        //Declaracions de variables
        int valor;
        Scanner ent = new Scanner(System.in);

        System.out.println("Introduix un valor enter:");
        valor = ent.nextInt();

        System.out.println("El valor que has introduït és " + valor);

    }

}
