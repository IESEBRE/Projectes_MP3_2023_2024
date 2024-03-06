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
        f.diguesAlgo();

        System.out.println(objecte);
        System.out.println(f);

    }

    //Sobreescriptura de mètodes heredats --> polimorfisme
    @Override
    public void diguesAlgo() {
        return;
    }


    //Sobrecàrrega de mètodes (no cal que siguen heredats) --> polimorfisme
    public void metodeSobrecarregat(){
        System.out.println("Metode sobrecarregat 1");
    }

    public int metodeSobrecarregat(String cadena){
        System.out.println("Metode sobrecarregat 2");
        return 0;
    }

}
