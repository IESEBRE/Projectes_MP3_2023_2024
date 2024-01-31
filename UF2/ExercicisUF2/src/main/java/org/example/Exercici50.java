package org.example;

import java.util.Scanner;

import static com.iesebre.mp3.uf2.library.Numero.numeroPerfecte;

public class Exercici50 {

    //Variables locals a compartir entre els mètodes
    static int[] numeros;
    static int index;

    public static void main(String[] args) {
         inicialitzarVariables();
         do{
             tractarElement();
         }while(!elementFinal() && !trobat());
         if(!elementFinal() && trobat()) tractamentTrobat();
         else tractamentNoTrobat();
    }

    private static void inicialitzarVariables() {
        Scanner ent = new Scanner(System.in);
        int quantitat;

        //Inicialitzem l'índex del vector
        index=-1;

        //Demanem a l'usuari la quantitat de números a introduïr
        System.out.println("Quants números vols introduïr?:");
        do{
            quantitat=ent.nextInt();
            if(quantitat<=0) System.out.println("Ha de ser un número enter major que 0!!");
            else break;
        }while(true);

        //Instanciem el vector en la quantitat de caselles indicada
        numeros=new int[quantitat];

        //Demanem a l'usuari que introduisque quantitat valors enters
        System.out.printf("Introduix %d números enters qualsevol:%n", quantitat);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=ent.nextInt();
        }

    }

    private static void tractarElement() {
        //Incrementem l'índex per anar passant d'element
        index++;
    }

    private static boolean elementFinal() {
        return index == numeros.length;
    }

    private static boolean trobat() {
        return numeroPerfecte(numeros[index]);
    }

    private static void tractamentTrobat() {
        System.out.println("S'ha el número perfecte "+numeros[index]);
    }

    private static void tractamentNoTrobat() {
        System.out.println("No s'ha trobat cap número perfecte");
    }
}
