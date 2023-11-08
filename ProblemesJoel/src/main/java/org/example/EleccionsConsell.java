package org.example;

import java.util.Scanner;

public class EleccionsConsell {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n = ent.nextInt();
        char[][] matriu=new char[n][n];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if(i==0 || i==matriu.length-1 || j==0 || j==matriu[i].length-1 || i==j || i+j == matriu.length-1) matriu[i][j]='X';
                else matriu[i][j]='.';
                System.out.print(matriu[i][j]);
            }
            System.out.println();
        }

    }

}
