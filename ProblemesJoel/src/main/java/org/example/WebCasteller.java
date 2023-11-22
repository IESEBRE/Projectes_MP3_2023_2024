package org.example;

import java.util.Scanner;

public class WebCasteller {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            String par1=ent.next();
            String par2=ent.next();

            //Mirem quin String és més llarg per guardar la seua llargada
            int mesLlarg = par1.length()>= par2.length() ? par1.length() : par2.length();

            int comptRep=0;

            //Bucle per comptar repeticions
            for (int i = 0; i < par1.length() && i<par2.length() && comptRep < (double)mesLlarg/2; i++) {
                //Comparem cada caracter dels 2 strings i si són iguals incrementem el comptador de repeticions
                if(par1.charAt(i) == par2.charAt(i)) comptRep++;
            }

            //Mostro la sortida
            if (comptRep>= (double) mesLlarg/2) System.out.println("GRACIES WEBCASTELLER");
            else System.out.println("WEBCASTELLER ESTA TRAVIESO HOY");

        }
    }
}
