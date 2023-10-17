package org.example;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Ascensor {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int pisInf=ent.nextInt();
        int pisSup=ent.nextInt();
        int pisIni=ent.nextInt();
        int numMovs=0, numPis=0, pisFin=pisIni;
        boolean erroni=false;
        while(true){
            String pis=ent.next();
            if(pis.equals("X")) break;
            int piso=Integer.parseInt(pis);
            if(piso<pisInf || piso>pisSup) {
                erroni=true;
                continue;
            }
            numMovs=numMovs+(piso!=pisFin? 1: 0);
            numPis+=abs(piso-pisFin);
            pisFin=piso;
        }
        System.out.printf("%d %d %d %s%n", numMovs, numPis, pisFin, erroni ? "E": "");

    }
}
