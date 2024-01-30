package org.example;

public class Exercici43 {

    public static void main(String[] args) {
//        System.out.println(buscaParaula("ll la le li lo lu", "ll", 0));
        System.out.println(buscaParaula("llo lly   lll  l l ", "l", 0));
    }

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
            if (trobat()) return tractamentTrobat();
            else return tractamentNoTrobat();
        }
    }

    private static int tractamentNoTrobat() {
        return -1;
    }

    private static int tractamentTrobat() {
        return ocurrencia;
    }

    private static boolean trobat() {
        //Variables locals
        String separadors=",.';:- ";

        //Mirem si el text trobat és una paraula aillada
        if(ocurrencia!=-1){ //Acabar este mètode
            if(ocurrencia==0){      //hem trobat la paraula al principi del text
                if(ocurrencia+palabra.length()==texto.length()      //hem trobat la paraula que a més acupa tot el text
                        || separadors.contains(""+texto.charAt(ocurrencia+palabra.length()))){ //si el caracter de després de la
                                                                                        // paraula és un separador vol dir que l'hem trobat
                    return true;
                }
            }else{      //tractament de quan trobem la paraula no al principi del text
                if(  separadors.contains(""+texto.charAt(ocurrencia-1)) && //mirem si la lletra anterior a la paraula és un separador
                        (ocurrencia+palabra.length()==texto.length()      //hem trobat la paraula que a més acupa tot el text
                        || separadors.contains(""+texto.charAt(ocurrencia+palabra.length())))){ //si el caracter de després de la
                    // paraula és un separador vol dir que l'hem trobat
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean elementFinal() {
        return ocurrencia==-1;
    }

    private static void tractarElement() {
        //Anem a buscar la paraula dins del text a partir de la posició
        ocurrencia=texto.indexOf(palabra,posicion);

        //Modifiquem el valor de posicio a buscar per evitar bucle infinit
        posicion=ocurrencia+palabra.length();
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