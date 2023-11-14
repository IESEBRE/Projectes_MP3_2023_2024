package org.example.nf2.cadenes;

public class CadenesIII {

    public static void main(String[] args) {

        if("Hola".equalsIgnoreCase("hola")) System.out.print("Són");
        else System.out.print("No són");

        System.out.println(" iguals");

        System.out.println("sóc un text en majúscules".toUpperCase());
        System.out.println("SÓC UN TEXT EN MINÚSCULES".toLowerCase());

        //Comparació de cadenes
        System.out.println("abc".compareTo("bcd"));
        System.out.println("bcd".compareTo("abc"));

        System.out.println("hola".compareTo("hola"));

        System.out.println("abc".compareTo("wdfsjfdkjdskjfdsfjksdklfj"));

        if("hola".compareTo("Adéu") == 0 ) System.out.println("Són iguals");
        else if("hola".compareTo("Adéu") > 0) System.out.println("hola és més gran que Adéu");
        else System.out.println("Adéu és més gran que hola");

        String cadena1="Bona nit";
        String cadena2="adéu-siau";
        if(cadena1.compareTo(cadena2) == 0 ) System.out.println("Són iguals");
        else if(cadena1.compareTo(cadena2) > 0) System.out.println(cadena1+" és més gran que "+cadena2);
        else System.out.printf("%s és més gran que %s", cadena2, cadena1);
        System.out.println();
        if(cadena1.compareToIgnoreCase(cadena2) == 0 ) System.out.println("Són iguals");
        else if(cadena1.compareToIgnoreCase(cadena2) > 0) System.out.println(cadena1+" és més gran que "+cadena2);
        else System.out.printf("%s és més gran que %s", cadena2, cadena1);
    }
}
