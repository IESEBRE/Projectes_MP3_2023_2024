package org.example.nf3.vectors;

public class VectorII {

    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5};


        //index 0, 1, 2, 3, ...., numcaselles-1 (numcaselles lo sabem en la propietat numeros.length)
        //numeros[index]

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 1;
        }

        for (int i = numeros.length-1; i >= 0 ; i--) {
            numeros[i] = 1;
        }

    }
}
