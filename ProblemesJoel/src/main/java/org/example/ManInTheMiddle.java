package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ManInTheMiddle {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int alumnes=ent.nextInt();          //número d'alumnes a repartir
            int fA=0, fB=0;                     //guardem la força acumulada de cada equip
            int[] forces=new int[alumnes];
            for (int i = 0; i < forces.length; i++) {
                forces[i]=ent.nextInt();        //lectura de les forces dels alumnes
            }
            Arrays.sort(forces);                //ordenem les forces ascendentment

            //Distribuïm les forces, començant per la situada a la darrera casella, que és la de més valor, i acabant
            //a la segona casella
            for (int i = forces.length-1; i >= 1 ; i--) {
                //Mirem quin equip té menys força i li sumen la força de la casella actual
                if(fA <= fB ) fA+=forces[i];
                else fB+=forces[i];
            }

            //Ara ja podem mirar si el "Man in The Middle" (la força de forces[0]) és o no rellevant
            if(fA>fB) {           //Cas en que l'equip A està guanyant
                if(fB+forces[0] > fA) System.out.println("SI");     //En este cas guanyaria B, per tant és rellevant
                else System.out.println("NO");
            }else{              //Cas en que l'equip B està guanyant, o estan empatats
                if(fA+forces[0] > fB) System.out.println("SI");     //En este cas gunayaria A, per tant és rellevant
                else System.out.println("NO");
            }
        }
    }
}
