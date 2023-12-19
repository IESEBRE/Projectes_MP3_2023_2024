package org.example;

import java.util.Arrays;

public class Exercicis {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(vectorDigitsV2(0)));
//        System.out.println(Arrays.toString(vectorDigitsV2(1000000245)));
//        System.out.println(Arrays.toString(vectorDigitsV2(-145)));

        ;
        tractaParametres(null);
        tractaParametres(12,232,3453,56);
        tractaParametres(12,232,3453,56);
        tractaParametres(new int[]{1,2,3,4,5,6});

        System.out.println(tractaParametres(1,1,1,1,1,1,1,1));
        System.out.println(Arrays.toString(tractaParametres(1,1,1,1,1,1,1,1)));
        System.out.println(Arrays.toString(tractaParametres()));
        System.out.println(Arrays.toString(tractaParametres(12,232,3453,56)));
        System.out.println(Arrays.toString(tractaParametres(1,1,1,1,1,1,1,1)));
        System.out.println(Arrays.toString(tractaParametres(new int[0])));
        System.out.println(Arrays.toString(tractaParametres(new int[]{1,2,3,4,5,6})));



    }

    //Exercici 4
    public static String insertaCadena(String primer, String segon, int numero) {
        //Tractament dels casos especials
        if (primer == null) return segon;
        if (segon == null) return primer;
        if (numero < 0) numero = 0;
        if (numero > primer.length()) numero = primer.length();

        String trosDavant = primer.substring(0, numero);
        String trosDarrera = primer.substring(numero);

        return trosDavant + segon + trosDarrera;
    }

    //Exercici 7
    public static String subcadena(String cadena, int ini, int fi) {
        //Tractament dels casos especials
        if (cadena == null) return null;
        if (ini < 0) ini = 0;
        if (fi <= 0 || ini >= cadena.length() || ini >= fi) return "";
        if (fi > cadena.length()) fi = cadena.length();

        return cadena.substring(ini, fi);
    }


    //Exercici 13
    public static int numVector(int[] numero) {
        //Tractament de casos especials
        if (numero == null || numero.length == 0) return 0; //atenció en l'ordre de les comparacions,
        //primer sempre hem de mirar si és null!!

        boolean negatiu = (numero[0] < 0);      //anoto si el número és negatiu

        if (negatiu) numero[0] = numero[0] * -1; //si el número és negatiu li canvio el signe
        int resultat = 0, pot10 = 1;
        for (int i = numero.length - 1; i >= 0; i--) {
            resultat += numero[i] * pot10;
            pot10 = pot10 * 10;
        }
        if (negatiu) {
            numero[0] = numero[0] * -1; //si el número és negatiu li canvio el signe
            resultat = resultat * -1;   //si el número és negatiu li canvio el signe al resultat
        }

        return resultat;
    }

    public static int numVectorV2(int[] numero) {
        //Tractament de casos especials
        if (numero == null || numero.length == 0) return 0;

        int resultat = 0,
                pot10 = (int) Math.pow(10.0, numero.length - 1);
        for (int i = 0; i < numero.length; i++) {
            if (i == 0 && numero[0] < 0)         //si el número és negatiu el sumem en positiu
                resultat += numero[i] * pot10 * -1;
            else resultat += numero[i] * pot10;
            pot10 = pot10 / 10;
        }
        if (numero[0] < 0) resultat *= -1;       //si el número és negatiu canviem el sigen al resultat
        return resultat;
    }


    //Exercici 8
    public static int[] vectorDigits(int numero) {

        boolean negatiu = numero < 0;       //anotem si el número és negatiu
        if (negatiu) numero *= -1;         //si el número és negatiu el passem a positiu

        int[] resultat = new int[Integer.toString(numero).length()];  //creo el vector en el número de caselles necessari
        //resultat=new int[(numero+"").length()];  //creo el vector en el número de caselles necessari

        for (int i = resultat.length - 1; i >= 0; i--) {
            resultat[i] = numero % 10;
            numero = numero / 10;
        }

        if (negatiu)
            resultat[0] = resultat[0] * -1; //si el número era negatiu passem a negatiu la primera casella del vector resultat

        return resultat;
    }

    //Fer el mètode però només usant propietats i mètodes de la classe String i Integer.toString(numero)
    public static int[] vectorDigitsV2(int numero) {
        //Mirem si el número és negatiu i el passem a positiu
        boolean negatiu = numero<0;
        if(negatiu) numero*=-1;

        //Passem el paràmetre enter a String
        String text=Integer.toString(numero);
        int[] resultat = new int[text.length()];

        for (int i = 0; i < text.length() ; i++) {
            resultat[i]=text.charAt(i)-'0';
            //resultat[i]=Integer.parseInt(text.charAt(i)+"");
        }

        //Si el número era negatiu passem a negatiu la primera casella del vector
        if(negatiu) resultat[0]*=-1;

        return resultat;
    }


    // Exercici 17
    public static int[] tractaParametres(int... numeros){
        //Tractament de casos especials
        if(numeros==null || numeros.length==0) return null;

        int suma, max, min;
        suma=max=min=numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            suma+=numeros[i];
            if(numeros[i]>max) max=numeros[i];
            if(numeros[i]<min) min=numeros[i];
        }
        return new int[]{suma, numeros.length, max, min};
    }

}