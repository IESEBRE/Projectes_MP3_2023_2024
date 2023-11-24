package org.example;

import java.util.Scanner;

//Versió 1 utilitzant l'split --> més fàcil
public class ParaulaMesLlargaV1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.skip("[\r\n]*").nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            String frase=ent.skip("[\r\n]*").nextLine().trim();     //llegim la frase llevant-li els espais en blanc per dreta i esquerra
            String[] paraules=frase.split(" ");

            //Bucle que recorre el vector de parules i registra la de longitud màxima
            int max=-1;
            for (int i = 0; i < paraules.length; i++) {
                if(paraules[i].length()>max) max=paraules[i].length();
            }
            System.out.println(max);
        }
    }

}
