package org.example;

//Pojo --> Plain Old Java Object
public class Cotxe {

    //Propietats de la classe  --> definixen l'estat dels objectes
    String matricula="T-0000-A";      //les propietats de tipo referencia s'inicialitzen a null
    String marca;
    String model;
    float cilindrada;       //les propietats de tipo primitiu s'inicialitzen a 0
    boolean hibrid;         //els booleans s'inicialitzen a false
    boolean electric;
    boolean gasolina;
    boolean diesel;
    char categoria;         //s'inicialitza en el caracter que té valor ASCII 0

    //Mètodes de la classe --> definixen el comportament dels objectes

    //Mètode constructor meu
    public Cotxe(){     //constructor buit, per què NO porta paràmetres
    }

    public Cotxe(String matricula, String marca, String model){ //constructor no buit, per què SÍ porta paràmetres
        this();         //crido al constructor buit de la classe
        this.matricula=matricula;
        this.marca=marca;
        this.model=model;
    }

    public Cotxe(String matricula, String marca, String model, float cilindrada, boolean hibrid, boolean electric, boolean gasolina, boolean diesel, char categoria) {

        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.cilindrada = cilindrada;
        this.hibrid = hibrid;
        this.electric = electric;
        this.gasolina = gasolina;
        this.diesel = diesel;
        this.categoria = categoria;
    }

    public float mostraCilindrada(){
        return cilindrada;
    }

    public void modificarCilindrada(float variacio){

        cilindrada=cilindrada+variacio;
    }

    public void modificarCilindrada(){

        cilindrada=cilindrada+1000;
    }

    @Override
    public String toString() {
        return "Cotxe{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", cilindrada=" + cilindrada +
                ", hibrid=" + hibrid +
                (electric?"electric":"no electric") +
                ", gasolina=" + gasolina +
                ", diesel=" + diesel +
                ", categoria=" + categoria +
                '}';
    }
}
