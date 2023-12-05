package org.example;

import java.util.Scanner;

public class CaracolesAlPozo {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int profPou = ent.nextInt();
            int avant = ent.nextInt();
            int darrere = ent.nextInt();
            int pos;
            pos=0;
            int comptDies=0;


            if(avant<=darrere && avant<profPou) {
                System.out.println("NO");
            }else {
                while (true) {
                    comptDies++;
                    //Tractament de cada pas
                    //Tractem el moviment d'N
                        pos+=avant;                     //avancem
                        if (pos >= profPou) break;      //mirem si ja hem sortit del pou
                        pos-=darrere;                   //reculem
                }
                System.out.println(comptDies);
            }
        }

  }
}
