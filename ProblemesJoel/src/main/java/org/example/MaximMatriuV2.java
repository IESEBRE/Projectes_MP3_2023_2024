package org.example;

import java.util.Scanner;

public class MaximMatriuV2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int f = ent.nextInt(), c = ent.nextInt();
            int maxim = 0,
                    posicio = 1;     //guardo la posició del valor màxim
            for (int i = 1; i <= f*c; i++) {
                    int valor = ent.nextInt();
                    //Si estic llegint el primer valor actualitzo el màxim
                    if ( i == 1) {
                        maxim = valor;
                        posicio = 1;
                    } else if (valor >= maxim) {
                        maxim = valor;
                        posicio = i;
                    }
            }
            //mostro la posició user-friendly del valor màxim
            System.out.printf("%d %d%n", ((posicio-1)/c)+1, ((posicio-1)%c)+1);

        }
    }

}
