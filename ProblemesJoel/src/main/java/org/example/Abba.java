package org.example;

import java.text.Normalizer;
import java.util.Scanner;

public class Abba {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.skip("[\r\n]*").nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            String[] noms=ent.skip("[\r\n]*").nextLine().split(", ");

            //Recorrem el vector fins la penúltima casella
            for (int i = 0; i < noms.length-1; i++) {
                //Treiem els accents del nom actual (noms[i])
                String s = noms[i].toUpperCase();            //Abans de tractar ho passo a majúscules
                s = Normalizer.normalize(s, Normalizer.Form.NFD);
                s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                System.out.print(s.charAt(0));              //Una vegada trets els accents i passat a majúscula mostrem
                                                            //mostrem la primera lletra de la cadena
            }

            //Guardem a "noms" els noms de la seua última casella
            noms=noms[noms.length-1].split(" i ");
            //Mirem si han quedat 2 o 3 noms al vector (són els únics casos possibles)
            switch(noms.length){
                case 2:
                    String s = noms[0].toUpperCase();            //Abans de tractar ho passo a majúscules
                    s = Normalizer.normalize(s, Normalizer.Form.NFD);
                    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                    System.out.print(s.charAt(0));
                    s = noms[1].toUpperCase();            //Abans de tractar ho passo a majúscules
                    s = Normalizer.normalize(s, Normalizer.Form.NFD);
                    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                    System.out.print(s.charAt(0));
                    /*for (int i = 0; i < noms.length; i++) {
                        //Treiem els accents del nom actual (noms[i])
                        s = noms[i].toUpperCase();            //Abans de tractar ho passo a majúscules
                        s = Normalizer.normalize(s, Normalizer.Form.NFD);
                        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                        System.out.print(s.charAt(0));              //Una vegada trets els accents i passat a majúscula mostrem
                        //mostrem la primera lletra de la cadena
                    }*/
                    break;
                case 3:
                    s = noms[0].toUpperCase();            //Abans de tractar ho passo a majúscules
                    s = Normalizer.normalize(s, Normalizer.Form.NFD);
                    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                    System.out.print(s.charAt(0));
                    s = noms[2].toUpperCase();            //Abans de tractar ho passo a majúscules
                    s = Normalizer.normalize(s, Normalizer.Form.NFD);
                    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                    System.out.print(s.charAt(0));
                    /*for (int i = 0; i < noms.length; i++) {
                        if(i==1) continue;
                        //Treiem els accents del nom actual (noms[i])
                        s = noms[i].toUpperCase();            //Abans de tractar ho passo a majúscules
                        s = Normalizer.normalize(s, Normalizer.Form.NFD);
                        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
                        System.out.print(s.charAt(0));              //Una vegada trets els accents i passat a majúscula mostrem
                        //mostrem la primera lletra de la cadena
                    }*/
            }
            System.out.println();
        }
    }
}
