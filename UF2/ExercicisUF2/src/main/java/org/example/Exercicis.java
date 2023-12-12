package org.example;
public class Exercicis {

    public static void main(String[] args) {
        System.out.println(subcadena("text", 1,2));
        System.out.println(subcadena(null, 1,2));
        System.out.println(subcadena("text", 2,1));
        System.out.println(subcadena("text", -1,-2));
        System.out.println(subcadena("text", -1,2));
        System.out.println(subcadena("text", 1,-2));
        System.out.println(subcadena("text", 1,-2));
    }

    //Exercici 4
    public static String insertaCadena(String primer, String segon, int numero){
        //Tractament dels casos especials
        if(primer==null) return segon;
        if(segon==null) return primer;
        if(numero < 0 ) numero=0;
        if(numero>primer.length()) numero=primer.length();

        String trosDavant=primer.substring(0,numero);
        String trosDarrera=primer.substring(numero);

        return trosDavant+segon+trosDarrera;
    }

    //Exercici 7
    public static String subcadena(String cadena, int ini, int fi){
        //Tractament dels casos especials
        if(cadena==null) return null;
        if(ini<0) ini=0;
        if(fi<=0 || ini>=cadena.length() || ini>=fi) return "";
        if(fi>cadena.length()) fi=cadena.length();

        return cadena.substring(ini, fi);
    }

}
