package org.example.nf2.cadenes;

public class CadenesVI {

    public static void main(String[] args) {

        System.out.println("Abracadabra".indexOf('a'));
        System.out.println("Abracadabra".indexOf('a',4));
        System.out.println("Abracadabra".indexOf('a',6));
        System.out.println("Abracadabra".indexOf('a',8));
        System.out.println("Abracadabra".indexOf('a',12));

        //Bucle que mostra les posicions on apareix 'a'
        int i=0;
        while(true){
            int j="Abracadabra".indexOf("br",i);
            if(j==-1) break;        //surto del bucle per què no es troba la lletra dins la cadena
            System.out.println("La lletra se troba a la posició "+j);
            i=j+1;
        }

        i="Abracadabra".length();
        while(true){
            int j="Abracadabra".lastIndexOf("br",i);
            if(j==-1) break;        //surto del bucle per què no es troba la lletra dins la cadena
            System.out.println("La cadena se troba a la posició "+j);
            i=j-1;      //restem enlloc de sumar per que busca cap a l'esquerra
        }
    }

}
