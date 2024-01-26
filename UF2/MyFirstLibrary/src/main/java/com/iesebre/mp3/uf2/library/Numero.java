package com.iesebre.mp3.uf2.library;

public class Numero {

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

    public static int revesNumero(int numero){
        //El reves d'un números d'un sol digit és ell mateix
        if(numero>=-9 && numero<=9) return numero;

        //Tractament dels números de més d'un dígit
        int[] vector=vectorDigits(numero);

        //Girem el vector
        int[] girat=new int[vector.length];     //instanciem vector d'igual dimensió que el que volem girar

        boolean negatiu;
        //Si el número es negatiu passem a positiu el vector generat per vectorDigits
        if(negatiu=numero<0) {
            vector[0]=vector[0]*-1;
        }

        for (int i = 0; i < vector.length; i++) {
            girat[vector.length-i-1]=vector[i];
        }


        //retornem el resultat usant el mètode numVector
        //Si el número era negatiu passem a negatiu el resulta de numVector
        return (negatiu ? numVector(girat)*-1: numVector(girat));
    }

    public static boolean numeroCapicua(int n){
        return n==revesNumero(n);
    }

}
