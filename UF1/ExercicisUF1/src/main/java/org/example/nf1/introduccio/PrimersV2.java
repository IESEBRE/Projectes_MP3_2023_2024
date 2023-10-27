package org.example.nf1.introduccio;

import java.util.Scanner;

public class PrimersV2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduix un enter > 0:");
        int num=ent.nextInt();
        int tractat=1;
        while(tractat<=num){
            //Tractament de cada cas
            int divisor=1;
            int comptador=0;
            while( divisor <= tractat ){
                if( tractat % divisor == 0 ){
                    comptador++;
                }
                if(comptador>2) {
                    break;
                }
                divisor++;
            }
            System.out.println( tractat + (comptador==2 ? " SI" : " NO"));

            tractat++;
        }

    }

}
