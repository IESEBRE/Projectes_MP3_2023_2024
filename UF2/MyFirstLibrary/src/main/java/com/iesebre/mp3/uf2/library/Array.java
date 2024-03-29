package com.iesebre.mp3.uf2.library;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] v = new int[]{12,25,3,6,58};
        int num=3;

        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(eliminaNoMultiplesV2(v, num)));
        System.out.println(Arrays.toString(v));
    }

    public static void  eliminaNoMultiples(int[] vector, int numero){
        //Casos especials
        if(vector==null || vector.length==0) return;    //Si el vector és null o no té caselles no hem de fer res

        if(numero==0){              //Si numero val 0 no hi ha cap valor divisible entre 0, per tant posem totes
                                    //les caselles a -1
            for (int i = 0; i < vector.length; i++) {
                vector[i]=-1;
            }
            return;
        }

        //El vector té caselles i el número és diferent de 0

        //1r posem les caselles no divisibles en valor -1
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] % numero !=0 ) vector[i]=-1;
        }

        //2n intentem moure les caselles diferents de -1 cap a l'esquerra
        int index=0;
        for (int i = 0; i < vector.length ; i++) {
            if(vector[i]!=-1){
                vector[index]=vector[i];
                if(index!=i) vector[i]=-1;
                index++;
            }
        }
    }

    public static int[]  eliminaNoMultiplesV2(int[] vector, int numero){
        //Casos especials
        if(vector==null || vector.length==0) return vector;    //Si el vector és null o no té caselles no hem de fer res

        //Creem un vector de la mateixa llargada que el paràmetre
        int[] resultat=new int[vector.length];


        if(numero==0){              //Si numero val 0 no hi ha cap valor divisible entre 0, per tant posem totes
            //les caselles a -1
            for (int i = 0; i < vector.length; i++) {
                resultat[i]=-1;
            }
            return resultat;
        }

        //El vector té caselles i el número és diferent de 0
        int index=0;
        for (int i = 0; i < vector.length ; i++) {
            if(vector[i]%numero==0){
                resultat[index]=vector[i];
                index++;
            }
        }

        for (int i = index; i < resultat.length; i++) {
            resultat[i]=-1;
        }
        return resultat;
    }

}
