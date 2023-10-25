package org.example;

import java.util.Scanner;

public class AnimalsJordina {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while(numCasos-->0){
            //Declaració de variables
            int numValors; // = ent.nextInt();
            String[] valors; //= new int[numValors];
            String valorBuscat;
            boolean trobat = false;

            //Instanciació de les variables
            numValors = ent.skip("[\r\n]*").nextInt();
            valors = new String[numValors];

            //LLegim els valors a guardar dins del vector
            for (int i = 0; i < valors.length; i++) {
                valors[i] = ent.skip("[\r\n]*").nextLine();
            }

            valorBuscat = valors[valors.length-1]; //recupero el valor buscat de l'última casella del vector
            //Fi de lectura de l'entrada

            //Busquem els animals
            for (int i = 0; !trobat && i < valors.length-1; i++) {
                if( valors[i].equals(valorBuscat)  ) trobat=true;
            }
            if(trobat) System.out.println("SI");
            else System.out.println("NO");
        }
    }

}
