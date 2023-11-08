package org.example.nf3.vectors;

import java.util.Arrays;
import java.util.Scanner;

public class Exercici6 {

    public static void main(String[] args) {
        //Declaració de constants
        final int QUANTITAT=3;

        //Comprovo que la QUANTITAT és positiva, per evitar excepcions
        if(QUANTITAT<=0){
            System.out.println("Hi ha un error. Parla en el programador");
            System.exit(-1);
        }

        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int[] vector=new int[QUANTITAT];

        //Llegir els QUANTITAT valors i guardar-los al vector
        System.out.printf("Introduix %d valors enters i te diré quin són majors o iguals que la mediana:%n", QUANTITAT);
        for (int i = 0; i < vector.length; i++) {
            //Llegim el nou valor
            vector[i] = ent.nextInt();
        }

        //Una vegada hem acabat de llegir podem calcular la mediana
        Arrays.sort(vector);            //mètode que retorna el vector ordenat ascendentment
        double mediana;
        //Per trobar la mediana mirem la dimensió del vector si és parell o imparell
        if( vector.length % 2 == 0 ) mediana=(vector[QUANTITAT/2]+vector[(QUANTITAT/2)-1])/2.0;
        else mediana=vector[QUANTITAT/2];

        //Mostrem els valors majors o iguals que la mediana
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]>=mediana) System.out.println(vector[i]);
        }

    }


}
