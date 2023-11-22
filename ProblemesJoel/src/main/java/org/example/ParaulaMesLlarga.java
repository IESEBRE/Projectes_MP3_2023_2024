package org.example;

import java.util.Scanner;

public class ParaulaMesLlarga {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.skip("[\r\n]*").nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            String frase=ent.skip("[\r\n]*").nextLine().trim();     //llegim la frase llevant-li els espais en blanc per dreta i esquerra

            //Bucle que mostra les posicions on apareix 'a'
            int i=0;
            int inici=0;
            int max=-1;
            while(true){
                int j=frase.indexOf(" ",i);
                if(j==-1) {        //surto del bucle per què no es troba la lletra dins la cadena
                    if(frase.length()-inici>max) max=frase.length()-inici;
                    break;
                }else{
                    if(j-inici>max) max=j-inici;
                    inici=j+1;
                }
                i=j+2;
            }
            System.out.println(max);


        }
    }

}
