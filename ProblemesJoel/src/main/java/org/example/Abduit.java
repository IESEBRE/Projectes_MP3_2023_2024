package org.example;

import java.util.Scanner;

public class Abduit {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.skip("[\r\n]*").nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int salts=ent.skip("[\r\n]*").nextInt();
            String frase=ent.skip("[\r\n]*").nextLine();
            String extret="", resto="";
            for (int i = 0; i < frase.length(); i++) {
                if( (i+1) % (salts+1)==0) extret+=frase.charAt(i);
                else resto+=frase.charAt(i);
            }
            System.out.printf("%s%n%s%n", extret, resto);
        }
    }
}
