package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class MetodesI {

    public static void main(String[] args) {

        //System.out.println(Arrays.toString(args));

        //System.out.println("Me dic "+args[0]+" i visc a "+args[1]);
        //Scanner ent = new Scanner(System.in);

        int num=proximEnter("Escriu un número:");
        String[] noms=dividir("Ana Pere Antoni"," ");
        System.out.println(Arrays.toString(noms));
        //String noms2="Ana Pere Antoni".split(" ");

        //Crido al mètode noRetornoRes
        noRetornoRes(67);
    }

    //Vaig a crear un mètode nou semblant a String.split(...) --> separa el text pel separador
    public static String[] dividir(String text, String separador){

        return text.split(separador);
    }

    //Vaig a crear un mètode nou semblant a Scanner.nexInt(...)
    public static int proximEnter(){
        Scanner ent = new Scanner(System.in);
        return ent.nextInt();
    }

    public static int proximEnter(String pregunta){
        System.out.println(pregunta);
        Scanner ent = new Scanner(System.in);
        return ent.nextInt();
    }

    //Vaig a crear un mètode nou que no retorna res, però mostra el número que rep per pantalla
    public static void noRetornoRes(int numero){

        int valor=proximEnter("Introduix un enter:");
        //Mostra la suma del valor que rep com a paràmetre més l'introduït per l'usuari
        System.out.println(numero+valor);

    }

}
