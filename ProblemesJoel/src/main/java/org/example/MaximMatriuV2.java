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
                    iMax = 0, jMax = 0;     //guardo la posició del valor màxim
            //int[][] matriu = new int[f][c];
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    int valor = ent.nextInt();
                    //matriu[i][j] = ent.nextInt();
                    //Si estic a la primera casella actualitzo el màxim
                    if (i == 0 && j == 0) {
                        //maxim = matriu[0][0];
                        maxim = valor;
                        iMax = 0;
                        jMax = 0;
                    } else if (valor >= maxim) {
                        maxim = valor;
                        iMax = i;
                        jMax = j;
                    }
                }
            }
            //mostro la posició user-friendly del valor màxim
            System.out.printf("%d %d%n", iMax + 1, jMax + 1);

        }
    }

}
