package org.example.nf2.cadenes;

public class CadenesVII {
    public static void main(String[] args) {

        /*System.out.println("0123456789".substring(2));

        //Bucle que mostra les posicions on apareix 'a'
        int i=0;
        while(true){
            int j="0123456789".indexOf("5",i);
            if(j==-1) break;        //surto del bucle per què no es troba la lletra dins la cadena
            System.out.println("0123456789".substring(j));
            i=j+1;
        }*/

        System.out.println("abracadabra".substring(2, 5));
        //System.out.println("abracadabra".substring(-2, 5));
        //System.out.println("abracadabra".substring(20, 5));
        System.out.println("abracadabra".substring(2, "abracadabra".length()));
        //System.out.println("abracadabra".substring(2, "abracadabra".length()+1));

    }

}
