package org.example;

import java.util.Scanner;

public class Pr2SimulPauCangas {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = ent.nextInt();
        while (numCasos-->0){
            int n = ent.nextInt();
            int[] nums = new int[n];
            int apareix=0;
            for (int i = 0; i < nums.length; i++) {
                nums[i]= ent.nextInt();
            }
            int b = ent.nextInt();

            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==b){
                    apareix++;
                }
            }
            if (apareix>=1){
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i]!=b){
                        System.out.print(i+1 + " ");
                    }
                }
                System.out.println("SI APAREIX");
            }else {for (int i = 0; i < nums.length; i++) {
                System.out.print((i+1) + " ");
            }
                System.out.println("NO APAREIX");
            }
        }
    }
}
