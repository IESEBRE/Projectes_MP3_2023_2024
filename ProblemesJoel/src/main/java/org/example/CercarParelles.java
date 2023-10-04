package org.example;

import java.util.Scanner;

public class CercarParelles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int c1, c2, c3;
        c1=ent.nextInt();
        c2=ent.nextInt();
        c3=ent.nextInt();

        //if( c1==c2 || c2==c3 || c1==c3  ) System.out.println("SI");
        //else System.out.println("NO");

        System.out.println( c1==c2 || c2==c3 || c1==c3 ? "SI" : "NO");
    }
}
