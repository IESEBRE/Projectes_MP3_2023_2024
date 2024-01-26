package org.example;

import java.util.Scanner;

import static com.iesebre.mp3.uf2.library.Numero.numeroCapicua;
import static com.iesebre.mp3.uf2.library.Numero.revesNumero;

public class Exercici47 {

    //Variables a compartir entre els mètodes
    static int numero, comptador;
    public static void main(String[] args) {

        inicialitzarVariables();
        do{
            tractarElement();
        }while(!elementFinal() && !trobat());
        if(trobat()) tractamentTrobat();
        else tractamentNoTrobat();

    }

    private static void tractamentNoTrobat() {
        System.out.printf("%nNo s'ha trobat un número capicua després de generar %d números%n", comptador);
    }

    private static void tractamentTrobat() {
        System.out.printf("%nEl número %d confirma la teoria després de generar %d números%n", numero, comptador);
    }


    private static boolean trobat() {
        return numeroCapicua(numero);
    }

    private static boolean elementFinal() {
        return trobat() || numero<0;
    }

    private static void tractarElement() {

        //Generem el primer element de la seqüència
        numero = numero + revesNumero(numero);
        comptador++;
        //System.out.println(numero);
    }

    private static void inicialitzarVariables() {
        Scanner ent = new Scanner(System.in);
        comptador=0;
        //Demanem un enter positiu, forçant-ho
        do{
            System.out.println("Introduix un enter positiu (>0):");
            numero=ent.nextInt();
            if(numero>0) break;
            else System.out.println("Ha de ser major que 0!!");
        }while(true);
    }

}
