package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercici2DoWhile {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, fi, temp;

        System.out.println("Introduix 2 números enters qualsevol:");
        num=ent.nextInt();
        fi=ent.nextInt();

        //Comprovem si el valor inicial és manor o igual que el final i en cas necessari
        //intercanviem els seus valors
        if(num>fi){
            temp=num;
            num=fi;
            fi=temp;
        }

        do{
            System.out.println(num % 2 == 0 ? num+" és parell" : num+" és imparell");
            num++;
        }while(num<=fi);
    }
}