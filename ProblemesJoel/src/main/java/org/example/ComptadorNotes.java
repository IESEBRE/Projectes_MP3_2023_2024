package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ComptadorNotes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);      //forcem a mmostrar la sortida del format en la notació anglosaxona
        int num=0;  //puc inicialitzar num a qualsevol valor excepte -1, per forçar l'entrada al bucle
        int comptador = 0;     // si inicialitzo comptador=0
        int suma = 0;
        int cE, cN, cB, cS, cI, cM;
        cE=cN=cB=cS=cI=cM=0;    //inicialitzo els 6 comptadors a 0

        while(num!=-1){
            num=ent.nextInt();
            if(num>=0 && num<=10){      //només sumo i compto els valors entre 0 i 10
                suma = suma + num;
                comptador++;
                switch(num){
                    case 10:
                    case 9:
                        cE++;
                        break;
                    case 8:
                    case 7:
                        cN++;
                        break;
                    case 6:
                        cB++;
                        break;
                    case 5:
                        cS++;
                        break;
                    case 4:
                        cI++;
                        break;
                    case 3:
                    case 2:
                    case 1:
                    case 0:
                        cM++;
                }
            }
        }

        System.out.println("NOTES: "+ comptador +" MITJANA: "+ ((float)suma/comptador) +" E: "+cE+" N: "+cN+" B: "+cB+" S: "+cS+" I: "+cI+" MD: "+cM);
        System.out.format("NOTES: %d MITJANA: %.7f E: %d N: %d B: %d S: %d I: %d MD: %d", comptador, (float)suma/comptador, cE, cN, cB, cS, cI, cM);
    }
}


























