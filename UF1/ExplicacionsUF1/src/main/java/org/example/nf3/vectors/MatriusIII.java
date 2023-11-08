package org.example.nf3.vectors;

public class MatriusIII {

    public static void main(String[] args) {
        //Declaro matriu de reals
        double[][] reals=new double[10][10];
        double cont=0.0;
        //Recorrem la matriu
        for (int i = 0; i < reals.length; i++) {
            for (int j = 0; j < reals[i].length; j++) {
                reals[i][j]=cont++;
                System.out.printf("%g ", reals[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        cont=0.0;
        for (int i = 0; i < reals.length; i++) {
            for (int j = 0; j < reals[i].length; j++) {
                reals[j][i]=cont++;
            }
            System.out.println();
        }
        for (int i = 0; i < reals.length; i++) {
            for (int j = 0; j < reals[i].length; j++) {
                System.out.printf("%g ", reals[i][j]);
            }
            System.out.println();
        }

    }
}
