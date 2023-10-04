package org.example;

import java.util.Scanner;

public class AviMesGran {

    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String nom1, nom2;
        int edat1, edat2;

        nom1=ent.skip("[\r\n]*").nextLine();
        edat1=ent.skip("[\r\n]*").nextInt();
        nom2=ent.skip("[\r\n]*").nextLine();
        edat2=ent.skip("[\r\n]*").nextInt();

        if(edat1>edat2) System.out.println(nom1);
        else if(edat1<edat2) System.out.println(nom2);
        else //aquí ja sabem que edat1 i edat2 són iguals, per tant no cal posar if
            System.out.println("Tenen la mateixa edat");
    }
}
