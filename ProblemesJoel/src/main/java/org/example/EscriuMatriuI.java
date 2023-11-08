package org.example;

import java.util.Scanner;

public class EscriuMatriuI {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int f=1, c=1;
        int i, j;
        int[][] m;  // = new int[f][c];

        //Llegim dimensions de la matriu
        f=ent.nextInt();
        c=ent.nextInt();

        //Ara que tenim les dimensions podem instanciar la matriu
        m = new int[f][c];

        //Llegim el contingut de la matriu i aprofitem per mostrar-la per pantalla
        for (int k = 0; k < m.length; k++) {
            for (int l = 0; l < m[k].length; l++) {
                System.out.printf("%d ", m[k][l]=ent.nextInt());
            }
            System.out.println();
        }
        //Llegim els índexos a mostrar
        i=ent.nextInt();
        j=ent.nextInt();
        System.out.println(m[i][j]);

    }

}
