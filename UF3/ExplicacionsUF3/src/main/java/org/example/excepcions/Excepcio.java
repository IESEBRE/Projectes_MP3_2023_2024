package org.example.excepcions;

import org.example.fitxers.Fitxers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcio {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int index;

        System.out.println("Quin número de lletra vols vore?:");
        //try{} catch(){} finally{} --> tractament d'excepcions
//        try{
//            index= ent.nextInt();
//            "Pepito".charAt(index);
//            System.out.println("He continuat");
//
//        }catch(StringIndexOutOfBoundsException ex){
//            System.out.println("La lletra que demanes no existix!!");
//        }catch(InputMismatchException ex){
//            System.out.println("No has introduit un número correcte!!");
//        }finally{
//            System.out.println("Hem acabat d'executar el codi en o sense errors");
//        }

        try{

            index= ent.nextInt();
            "Pepito".charAt(index);
            System.out.println("He continuat");
            throw new NullPointerException();
        }catch(NullPointerException ex){
            System.out.println("He arribat a l'última línia del codi!!");
        }catch(Exception ex){
            System.out.println(ex.getMessage());

        }

    }






}
