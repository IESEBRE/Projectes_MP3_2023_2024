package org.example;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos=ent.nextInt();
        while(numCasos-->0){
            //Tractament de cada cas
            int num=ent.nextInt();
            int divisor=1;
            while(divisor<=num){
                if( num % divisor == 0 ) System.out.format("%d ", divisor);
                divisor++;
            }
            System.out.println();
        }

    }

}
