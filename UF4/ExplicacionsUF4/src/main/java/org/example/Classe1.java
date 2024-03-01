package org.example;

public class Classe1 {

    //Propietats estàtiques
    public static int numeroEstatic;


    //Propietas dels membres de la classe
    public int numero;
    protected String cadena;
    double decimal;
    private boolean pregunta;


    public static void main(String[] args) {

        Object objecte=new Object();

        System.out.println(objecte.toString());
        System.out.println(new double[]{});

        Classe1 objecte1=new Classe1();

        System.out.println(objecte1);
        //objecte1.


        Classe1 objecte2=objecte1;
        Classe1 objecte3=new Classe1();
        objecte1=objecte3;
        objecte2=objecte3;

        //System.out.println(objecte1.cadena);

    }

    @Override
    public String toString() {
        return "Classe1{" +
                "numero=" + numero +
                ", cadena='" + cadena + '\'' +
                ", decimal=" + decimal +
                ", pregunta=" + pregunta +
                '}';
    }
}
