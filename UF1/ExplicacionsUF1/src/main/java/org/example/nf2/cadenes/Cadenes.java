package org.example.nf2.cadenes;

public class Cadenes {

    public static void main(String[] args) {

        String cadena = "Sóc una cadena de caràcters";
        cadena = cadena + " ampliada";

        if(cadena.equals("Sóc")) System.out.println("Si");
        else System.out.println("No");

        String cadena1=new String("Hola");
        String cadena2=new String("Hola");

        if(cadena1 == cadena2) System.out.println("Sí que és el mateix objecte");
        else System.out.println("No és el mateix objecte");

        if(cadena1.equals(cadena2) ) System.out.println("Sí que té el mateix text");
        else System.out.println("No és el mateix text");

        char[] paraula=new char[]{'B','o','n', ' ', 'd', 'i', 'a'};
        String paraulaCadena=new String(paraula);       //"Bon dia"
        String unAltre=new String(paraulaCadena);

        unAltre=paraulaCadena;


    }





}
