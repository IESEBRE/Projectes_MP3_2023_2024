package com.iesebre.mp3.uf2.library;

public class Cadena {

    /**
     * Mira si un text apareix dins un altre a partir d'una posició
     * @param primer el text on busquem
     * @param segon el text que busque
     * @param desde la posició a partir de la qual busquem
     * @return true si el segon text es roba dins el primer a partir de la posició, false en cas contrari
     */
    public static int buscaCadena(String primer, String segon, int desde){
        //Casos especials
        if(primer==null || segon==null) return -1;
        if(desde<0) desde=0;
        if(segon.isEmpty()) return (desde<primer.length()?desde:primer.length());
        if(desde>=primer.length()) return -1;
        if(segon.length()>primer.length()) return -1;
        if(!primer.contains(segon)) return -1;

        //Tractament de casos normals
        for (int i = desde; i + segon.length() <primer.length() ; i++) {
            //Mirem si la primera lletra del segon text coincidix en la i-èssima del primer
//            if(primer.charAt(i)==segon.charAt(0)){
//                //Mirem si la resta de caracters de primer coincidixen en los de segon
//                //while....
//            }
            String trosset=primer.substring(i, i+segon.length());
            if(trosset.equals(segon)) return i;

        }

        return -1;

    }

    /**
     * Inserta un text dins un altre a partir d'una posició
     * @param primer el text on insertem
     * @param segon el text que insertem
     * @param numero la posició a partir de la qual insertem
     * @return el text resultant d'insertar el segon text dins el primer a partir de la posició
     */
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
    /**
     * Retorna una subcadena d'una cadena donada
     * @param cadena la cadena original
     * @param ini la posició inicial de la subcadena
     * @param fi la posició final de la subcadena
     * @return la subcadena de la cadena original
     */
    public static String subcadena(String cadena, int ini, int fi) {
        //Tractament dels casos especials
        if (cadena == null) return null;
        if (ini < 0) ini = 0;
        if (fi <= 0 || ini >= cadena.length() || ini >= fi) return "";
        if (fi > cadena.length()) fi = cadena.length();

        return cadena.substring(ini, fi);
    }
}
