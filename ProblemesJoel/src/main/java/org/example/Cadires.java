package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Cadires {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos=ent.skip("[\r\n]*").nextInt();

        while(numCasos-->0){
            //Tractament de cada cas
            String[] xiquets, torns;

            //Omplim el vector en el nom dels xiquets
            String noms=ent.skip("[\r\n]*").nextLine();
            xiquets=noms.split(" ");        //crea un vector d'Strings que conté les subcadenes de la cadena
                                                  // inicial separades pel text que passem com a paràmetre
            torns=ent.skip("[\r\n]*").nextLine().split(" ");

            //Miro si hi ha igual o més torns que xiquets i en este cas direm que no hi ha guanyador
            if(xiquets.length<=torns.length){
                System.out.println("CAP GUANYADOR");
                continue;                   //Tornem a l'inici del bucle i passem al següent cas
            }

            int inici=0;        //indica per on comença cada torn

            //Recorrem el vector de torns, per tractar cada torn
            for (int i = 0; i < torns.length; i++) {
                int voltes = Integer.parseInt(torns[i])-1;      //número de voltes que donem al torn actual

                //Pegar voltes a les cadires
                while(voltes>0){
                    //Busquem el següent xiquet no null
                    do {
                        inici++;
                        inici = inici % xiquets.length;     //esta operació fa que l'incremnet sigue circular de 0 a xiquets.length-1
                        if(xiquets[inici]!=null) break;
                    }while(true);

                    voltes--;                             //decrementem el torn ja que hem fet una volta
                }

                xiquets[inici]=null;                    //el xiquet que indica inici ha perdut la cadira
                //Busquem el següent xiquet no null
                do {
                    inici++;
                    inici = inici % xiquets.length;     //esta operació fa que l'incremnet sigue circular de 0 a xiquets.length-1
                    if(xiquets[inici]!=null) break;
                }while(true);
            }
            //System.out.println(Arrays.toString(xiquets));       //mostra el contingut del vector

            //Mostrem els noms dels xiquets que han quedat
            for (int i = 0; i < xiquets.length; i++) {
                if(xiquets[i]!=null) System.out.print(xiquets[i]+ " ");
            }
            System.out.println();
        }





    }

}
