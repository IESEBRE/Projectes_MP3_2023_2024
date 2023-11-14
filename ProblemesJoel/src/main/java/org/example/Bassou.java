package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Bassou {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int alumnes = ent.skip("[\n\r]*").nextInt();
        String[] noms = new String[alumnes];
        int compt = 0;
        for (int i = 0; i < alumnes ; i++) {
            String nom=ent.skip("[\n\r]*").nextLine();
            if(nom!=null && nom.equals("Bassou")){
                compt++;
                noms[i]=nom;
            }
        }
        noms = new String[compt];
        for (int i = 0; i < noms.length; i++) {
            noms[i]="Bassou";
        }
        System.out.println(Arrays.toString(noms));
    }
}
