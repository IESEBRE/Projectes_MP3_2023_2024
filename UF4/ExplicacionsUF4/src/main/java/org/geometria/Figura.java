package org.geometria;

public abstract class Figura {      //Agrupem tot el que tenen en comú les figures geomètriques

    public static final double PI=3.1415927678686;

    //Mètode abstracte --> no està implementat
    public abstract double calcularArea();

    public abstract double calcularPerimetre();

    public final void metodeUnicPerTotsElsFills(){
        System.out.println("Tots sou figures geomètriques!!");
    }

}


class Triangle extends Figura{

    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        return base*altura/2;
    }

    @Override
    public double calcularPerimetre() {
        return 0;
    }
}

class Quadrat extends Figura{

    private double costat;

    public double getCostat() {
        return costat;
    }

    public void setCostat(double costat) {
        this.costat = costat;
    }

    @Override
    public double calcularArea() {
        return costat*costat;
    }

    @Override
    public double calcularPerimetre() {
        return 0;
    }
}

class Cercle extends Figura{

    private double radi;



    @Override
    public double calcularArea() {
        return radi*radi*PI;
    }

    @Override
    public double calcularPerimetre() {
        return 0;
    }
}

