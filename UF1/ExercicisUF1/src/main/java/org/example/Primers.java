package org.example;

import java.util.Scanner;

public class Primers {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos=ent.nextInt();
        while(numCasos-->0){
            //Tractament de cada cas
            int num=ent.nextInt();
            int divisor=num;
            int comptador=0;
            while(divisor>=1){
                if( num % divisor == 0 ){
                    comptador++;
                }
                if(comptador>2) {
                    break;
                }
                divisor--;
            }
            System.out.println( comptador==2 ? "SI" : "NO");
        }

    }

}
