package org.example.nf2.cadenes;

public class CadenesII {

    public static void main(String[] args) {

        char[] paraula=new char[]{'B','o','n', ' ', 'd', 'i', 'a'};

        for (int i = 0; i < paraula.length; i++) {
            System.out.print(paraula[i]);
        }

        System.out.println();

        String paraulaString = new String("Bona nit");
        for (int i = 0; i < paraulaString.length(); i++) {
            System.out.print(paraulaString.charAt(i));
        }


        //Volem comparar si el vector i l'String contenen el mateix text
        int i;
        for (i = 0; i < paraula.length; i++) {
            if(paraula[i]!=paraulaString.charAt(i)) break;        //char
        }
        if(i==paraula.length) System.out.println("Són iguals");
        else System.out.println("Són diferents a partir de la posició "+(i+1));

        //Comparació en el mètode equals
        String copiaVector= new String(paraula);

        if(copiaVector.equals(paraulaString)) System.out.println("Són iguals");
        else System.out.println("Són diferents");

        copiaVector.charAt(0);


    }
}
