package org.example.nf2.cadenes;

public class CadenesV {

    public static void main(String[] args) {


        System.out.println("Javier".startsWith("Ja"));
        System.out.println("Javier".startsWith("ja"));
        System.out.println("Javier".toLowerCase().startsWith("ja".toLowerCase()));
        System.out.println();
        System.out.println("Javier".endsWith("er"));
        System.out.println("Javier".endsWith("eR"));
        System.out.println("Javier".toLowerCase().endsWith("ER".toLowerCase()));
        System.out.println();

        if("Javier".contains("vie")) System.out.println("Si");
        else System.out.println("No");


    }
}
