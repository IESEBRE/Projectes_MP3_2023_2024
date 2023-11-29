package org.example;

import java.util.Scanner;

public class BloodBorne {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            String nom=ent.next();
            boolean trobat=false;
            for (int i = 0; !trobat && i < nom.length()-1; i++) {
                trobat = nom.charAt(i)==nom.charAt(i+1);
            }
            if(trobat) System.out.println("SI");
            else System.out.println("NO");
        }
    }
}
