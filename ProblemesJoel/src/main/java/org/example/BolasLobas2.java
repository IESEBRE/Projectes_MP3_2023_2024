package org.example;

import java.util.Scanner;

public class BolasLobas2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numcasos = ent.nextInt();

        while (numcasos-- > 0) {
            String s1 = ent.next();
            String s2 = ent.next();
            boolean trobat=false;

            for (int i = 0; !trobat && i < s1.length(); i++) {
                for (int j = 0; !trobat && j < s2.length(); j++) {
                    if( i!=j && s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)){
                        System.out.println(i+" "+j);
                        trobat=true;
                    }
                }
            }
        }

    }

}
