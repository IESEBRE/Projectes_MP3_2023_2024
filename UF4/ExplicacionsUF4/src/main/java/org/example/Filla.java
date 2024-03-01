package org.example;

import java.util.Scanner;

public class Filla extends Classe1{

    @Override
    public String toString() {
        return "Filla{" +
                "numero=" + numero +
                ", cadena='" + cadena + '\'' +
                ", decimal=" + decimal +
                '}';
    }


    public static void main(String[] args) {

        Classe1 objecte=new Classe1();
        Classe1 objecte2=new Filla();
        //Filla objecte3=new Classe1();
        Object objecte4=new Scanner(System.in);


        Filla f = new Filla();

        System.out.println(objecte);
        System.out.println(f);


    }
}
