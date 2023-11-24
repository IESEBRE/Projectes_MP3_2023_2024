package org.example;

import java.util.Scanner;

//Versió 3 utilitzant el charAt --> algo més difícil
public class ParaulaMesLlargaV3 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.skip("[\r\n]*").nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            String frase=ent.skip("[\r\n]*").nextLine().trim();     //llegim la frase llevant-li els espais en blanc per dreta i esquerra

            //Bucle que mostra les posicions on apareix 'a'
            int inici=0;
            int max=-1;
            for (int j = 0; j < frase.length(); j++) {
                if(frase.charAt(j)==' ') {        //surto del bucle per què no es troba la lletra dins la cadena
                    if(j-inici>max) max=j-inici;
                    inici=j+1;

                }
            }
            if(frase.length()-inici>max) max=frase.length()-inici;
            System.out.println(max);


        }
    }

}
