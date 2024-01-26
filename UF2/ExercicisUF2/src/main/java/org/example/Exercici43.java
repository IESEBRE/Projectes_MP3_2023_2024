package org.example;

public class Exercici43 {

    //Variables per compartir entre els mètodes
    static String texto, palabra;
    static int posicion;
    static int ocurrencia;



    //Exercici 43
    public static int buscaParaula(String text, String paraula, int posicio){
        int valorRetornat;
        valorRetornat=inicialitzarVariables(text,paraula, posicio);
        if(valorRetornat!=-2){
            return valorRetornat;
        }else{
            do {
                tractarElement();
            } while (!elementFinal() && !trobat());
            if (trobat()) tractamentTrobat();
            else tractamentNoTrobat();
        }
    }

    private static void tractamentNoTrobat() {
    }

    private static void tractamentTrobat() {

    }

    private static boolean trobat() {
        //Mirem si el text trobat és una paraula aillada
        if(ocurrencia!=-1){ //Acabar este mètode


        }


        return false;
    }

    private static boolean elementFinal() {
        return ocurrencia==-1;
    }

    private static void tractarElement() {
        //Anem a buscar la paraula dins del text a partir de la posició
        ocurrencia=texto.indexOf(palabra,posicion);


    }

    private static int inicialitzarVariables(String text, String paraula, int posicio) {
        //Assignem el valor dels paràmetres a les variables del programa
        texto=text;
        palabra=paraula;
        posicion=posicio;

        //Tractament de casos especials
//        si els 2 Strings o algun d'ells són null el mètode retornarà -1,
//        si el número és negatiu se farà el mateix que si val 0,
//                si el segon text és la cadena buida se retornarà el més menut entre el número i la llargada del primer text,
//                si el número és superior o igual a la llargada del primer String, se retornarà -1.
        if(texto==null || palabra==null ) return -1;
        if(posicion<0) posicion=0;
        if(palabra.isEmpty()) return ( posicio<texto.length() ? posicio : texto.length());
        if(posicion>=texto.length()) return -1;
        //Si no hem d'acabar l'execució retornem -2
        return -2;
    }


}
