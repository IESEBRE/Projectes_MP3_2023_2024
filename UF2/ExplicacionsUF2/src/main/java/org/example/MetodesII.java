package org.example;

import java.util.Arrays;

public class MetodesII {

    public static void main(String[] args) {
        int variab=25;
        int[] vector={1,2,3,4,5};

//        pasParametre(25);
//        System.out.println(variab);
//        pasParametre(variab);
//        System.out.println(variab);

        System.out.println(Arrays.toString(vector));
        pasParametreObjecte(vector);
        System.out.println(Arrays.toString(vector));
    }
    public static void pasParametre(int i){

        i=i+1;


    }

    public static int[] pasParametreObjecte(int[] valors){

        int[] copia=new int[valors.length];
        for (int i = 0; i < copia.length; i++) {
            copia[i]=valors[i];
        }

        for (int i = 0; i < valors.length; i++) {
            copia[i]=copia[i]+1;

        }

        return copia;

    }


}
