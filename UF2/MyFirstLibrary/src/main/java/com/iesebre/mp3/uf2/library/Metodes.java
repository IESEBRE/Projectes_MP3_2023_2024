package com.iesebre.mp3.uf2.library;
public class Metodes {

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



}
