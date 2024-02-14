package org.example.pojo;

//Pojo --> Plain Old Java Object
public class Cotxe {

    //Propietats estàtiques de la classe
    private static double indexFregament=3.4;

    //Propietats de la classe (no estàtiques) --> definixen l'estat dels objectes
    private String matricula="T-0000-A";      //les propietats de tipo referencia s'inicialitzen a null
    private String marca;
    private String model;
    private float cilindrada;       //les propietats de tipo primitiu s'inicialitzen a 0
    private boolean hibrid;         //els booleans s'inicialitzen a false
    private boolean electric;
    private boolean gasolina;
    private boolean diesel;
    private char categoria;         //s'inicialitza en el caracter que té valor ASCII 0

    //Mètodes de la classe --> definixen el comportament dels objectes

    //Mètode constructor meu
    public Cotxe(){     //constructor buit, per què NO porta paràmetres
    }

    public Cotxe(String matricula, boolean hibrid, char categoria) {
        this.matricula = matricula;
        this.hibrid = hibrid;
        this.categoria = categoria;
    }

    public Cotxe(boolean hibrid,  String model,  char categoria) {
        this.model = model;
        this.hibrid = hibrid;
        this.categoria = categoria;
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

//    //public float mostraCilindrada(){
//        return cilindrada;
//    }

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


    //Mètodes accessors


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        if(cilindrada<=0) return;
        this.cilindrada = cilindrada;
    }

    public boolean isHibrid() {
        return hibrid;
    }

    public void setHibrid(boolean hibrid) {
        this.hibrid = hibrid;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public boolean isGasolina() {
        return gasolina;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public static double getIndexFregament() {
        return indexFregament;
    }



    //Mètodes d'utilitat
    public double calculaFregament(){
        return cilindrada* indexFregament;
    }

}
