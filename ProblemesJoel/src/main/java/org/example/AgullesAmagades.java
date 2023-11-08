package org.example;

import java.util.Scanner;

public class AgullesAmagades {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.skip("[\r\n]*").nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            String[] temps=ent.skip("[\r\n]*").nextLine().split(":");
            int hores=Integer.parseInt(temps[0]);
            int minuts=Integer.parseInt(temps[1]);

            if(minuts == (hores*5 + minuts/12)%60) System.out.println("SI");
            else System.out.println("NO");
        }
    }
}
