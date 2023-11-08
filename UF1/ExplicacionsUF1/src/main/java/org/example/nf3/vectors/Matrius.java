package org.example.nf3.vectors;

public class Matrius {

    public static void main(String[] args) {

        //Declaració de variables
        int[][] matriu=new int[4][];       //en vectors multidimensionals només és obligatori indicar la primera dimensió (files)

        //Instanciem cadascuna de les files de la matriu
        matriu[0] = new int[1];
        matriu[1] = new int[4];
        matriu[2] = new int[2];
        matriu[3] = new int[0];

        //Recorregut d'una matriu de dalt a baix i d'esquerra a dreta
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.printf("%d ", matriu[i][j]=i+j);
            }
            System.out.println();
        }

    }

}
