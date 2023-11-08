package org.example.nf3.vectors;

import java.util.Scanner;

public class Exercici5 {

    public static void main(String[] args) {
        //Declaració de constants
        final int QUANTITAT=2;

        //Comprovo que la QUANTITAT és positiva, per evitar excepcions
        if(QUANTITAT<=0){
            System.out.println("Hi ha un error. Parla en el programador");
            System.exit(-1);
        }

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int[] vector=new int[QUANTITAT];
        int suma=0;             //0 per què és l'element neutre de la suma
        int multiplicacio=1;    //1 per què és l'element neutre de la multiplicació

        //Llegir els QUANTITAT valors i guardar-los al vector
        System.out.printf("Introduix %d valors enters i te diré quin són majors o iguals que la mitjana:%n", QUANTITAT);
        for (int i = 0; i < vector.length; i++) {
            //Llegim el nou valor
            vector[i] = ent.nextInt();

            //Anem acumulant la suma
            suma=suma+vector[i];        // suma+=vector[i]
        }

        //Una vegada hem acabat de llegir i sumar les dades podem calcular la mitjana
        double mitjana = (double) suma / QUANTITAT;
        //mitjana = suma * 1.0  / QUANTITAT;

        //Mostrem els valors majors o iguals que la mitjana
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]>=mitjana) System.out.println(vector[i]);
        }

    }


}
