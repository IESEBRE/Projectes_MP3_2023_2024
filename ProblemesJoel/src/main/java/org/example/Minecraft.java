package org.example;

import java.util.Scanner;

public class Minecraft {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.skip("[\r\n]*").nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int numLinies = ent.skip("[\r\n]*").nextInt();
            int comptadorDiamants = 0;

            while (numLinies-- > 0) {
                //Llegim cada linia i la tractem
                String linia=ent.skip("[\r\n]*").nextLine();

                //Bucle que compta les aparicions del text "{}"
                int i=0;
                while(true){
                    int j=linia.indexOf("{}",i);
                    if(j==-1) break;        //surto del bucle per què no es troba el diamant dins la cadena
                    comptadorDiamants++;
                    i=j+2;                  //continuem buscant a continuació de l'actual diamant
                }
            }

            System.out.println(comptadorDiamants);
        }
    }


}
