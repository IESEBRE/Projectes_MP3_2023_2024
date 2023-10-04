package org.example;

import java.util.Scanner;

public class CompteEnrere {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num=ent.nextInt();  //valor inicial de la variable de control del bucle

        //Mostrem de num a l'0 --> podem posar num souts, o utilitzar un bucle
        while( num>=0 ){     //condició que ha de ser true inicialment i false en el futur
            System.out.println(num--); //--> va bé ja que primer mostra i després decrementa
            //System.out.println(--num); --> no va bé ja que primer decrementa i després mostra
            //num=num-1;          //actualització de la variable de control
        }

    }
}
