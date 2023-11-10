package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Amplitud {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int nuMedicions=ent.nextInt();          //número de medicions a repartir
            int[] medicions=new int[nuMedicions];
            for (int i = 0; i < medicions.length; i++) {
                medicions[i]=ent.nextInt();        //lectura de les medicions
            }
            Arrays.sort(medicions);                //ordenem les medicions ascendentment
            System.out.println(Arrays.toString(medicions));
            for (int i = 0; i < medicions.length/2; i++) {
                if(medicions.length % 2 == 0)       //tenim un número parell de medicions
                    System.out.printf("%d %d ", medicions[(medicions.length/2)-1-i], medicions[(medicions.length/2)+i]);
                else
                    System.out.printf("%d %d ", medicions[(medicions.length/2)-i], medicions[(medicions.length/2)+1+i]);
            }
            if(medicions.length % 2 == 0) System.out.println();
            else System.out.println(medicions[0]);          //En el cas de dimensió imparell cal escriure la primera medició

        }
    }
}


//3 4 2 5 1