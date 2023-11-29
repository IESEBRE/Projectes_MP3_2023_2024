package org.example;

import java.util.Scanner;

public class Pr3SimulVictor {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numcasos = ent.nextInt();
        for (int i = 0; i < numcasos; i++) {
            String frase = ent.skip("[\r\n]*").nextLine();
            String caracter = ent.skip("[\r\n]*").nextLine();
            int num1 = ent.skip("[\r\n]*").nextInt();
            int correcte = 0;
            int cambis = 0;
            String[] frasecambi = new String[frase.length()];
            for (int j = 0; j < frase.length(); j++) {
                frasecambi[j] = String.valueOf(frase.charAt(j));
            }
            while (num1 != -1) {
                cambis++;
                if (frasecambi[num1].equals(caracter))
                    correcte++;
                frasecambi[num1] = caracter;
                num1 = ent.nextInt();
            }
            if (correcte == cambis || cambis == 0)
                System.out.println("NO HA CANVIAT");
            else {
                for (int j = 0; j < frasecambi.length; j++) {
                    System.out.print(frasecambi[j].trim());

                }
                System.out.println();
            }
        }

    }
}