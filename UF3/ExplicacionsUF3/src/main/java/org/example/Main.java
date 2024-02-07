package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);





        Cotxe objecte = new Cotxe();  //--> construïm un nou objecte de la classe Cotxe
        objecte = new Cotxe("B-1234-BB", "Seat", "Toledo");
        objecte = new Cotxe("B-1234-BB", "Seat", "Toledo", 2000F, false, false, true, false, 'S');
        objecte =new Cotxe("jfdfj", true, ' ');

        objecte.setMatricula("B-1234-BB");
        objecte.setMarca("Seat");

        System.out.println(objecte.getMatricula());
        //System.out.println(Cotxe.getMatricula()); --> les propietats no estàtiques no es poden accedir directament des de la classe

        System.out.println(objecte.getIndexFregament());
        System.out.println(Cotxe.getIndexFregament()); //--> les propietats estàtiques SÍ es poden accedir directament des de la classe



    }
}