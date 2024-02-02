package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);





        Cotxe cotxe = new Cotxe();  //--> construïm un nou objecte de la classe Cotxe
        cotxe = new Cotxe("B-1234-BB", "Seat", "Toledo");
        cotxe = new Cotxe("B-1234-BB", "Seat", "Toledo", 2000F, false, false, true, false, 'S');

        cotxe.matricula="B-1234-BB";
        cotxe.marca="Seat";

        System.out.println(cotxe);


    }
}