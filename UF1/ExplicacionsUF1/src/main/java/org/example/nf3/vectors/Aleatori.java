package org.example.nf3.vectors;

import java.util.Arrays;
import java.util.Random;

public class Aleatori {

    public static void main(String[] args) {

        //Generar números aleatoris
        Random generador = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(generador.nextInt(4)+1);
        }

        int[] vector=new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[ generador.nextInt(vector.length)  ]= 23;//generador.nextInt(100);
        }

        System.out.println(Arrays.toString(vector));


    }






}
