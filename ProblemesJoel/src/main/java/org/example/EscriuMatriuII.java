package org.example;

import java.util.Scanner;

public class EscriuMatriuII {

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

        //Llegim el contingut de la matriu
        for (int k = 0; k < m.length; k++) {
            for (int l = 0; l < m[k].length; l++) {
                m[k][l]=ent.nextInt();
            }
        }
        //Llegim els valors a canviar
        i=ent.nextInt();
        j=ent.nextInt();

        //Mostrem la matriu intercanviant els valors "i" per "j"
        for (int k = 0; k < m.length; k++) {
            for (int l = 0; l < m[k].length; l++) {
                System.out.printf("%d ", m[k][l]==i ? j : m[k][l]);
                /*if(m[k][l] == i) System.out.printf("%d ", j);
                else System.out.printf("%d ", m[k][l]);*/
            }
            System.out.println();
        }

    }

}
