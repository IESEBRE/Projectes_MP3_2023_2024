package org.interficies;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public interface Ordenacio {

    //Mètodes abstractes de la interficie --> són tots "public abstract"
    //

    /**
     * Mètode utilitzat per comparar els objectes
     * @param obj el que comprem respecte l'objecte actual
     * @return 0 si són iguals, -1 o 1
     */
    int majorQue(Ordenacio obj);

}
//
//abstract class OrdenacioAbs {
//
//
//    //Mètodes abstractes de la interficie
//    abstract void nomMetode(int i);
//}

class Cotxe implements Ordenacio, Serializable,java.lang.Comparable {

    private int potencia;

    public Cotxe(int potencia) {
        this.potencia=potencia;
    }
    //altres props

    @Override
    public int majorQue(Ordenacio obj) {
        //this serà l'objecte a comparar en el paràmetre
        return this.potencia-((Cotxe)obj).potencia;
    }

    @Override
    public String toString() {
        return "Cotxe{" +
                "potencia=" + potencia +
                '}';
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure {@link Integer#signum
     * signum}{@code (x.compareTo(y)) == -signum(y.compareTo(x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * x.compareTo(y)} must throw an exception if and only if {@code
     * y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code
     * x.compareTo(y)==0} implies that {@code signum(x.compareTo(z))
     * == signum(y.compareTo(z))}, for all {@code z}.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     * @apiNote It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     */
    @Override
    public int compareTo(Object o) {

        return ((Cotxe)o).potencia-this.potencia;
    }
}

//class Verdura implements Ordenacio{
//
//
//    @Override
//    public void majorQue(Ordenacio objecte) {
//
//    }
//}

class Main{

    public static void main(String[] args) {

        Cotxe[] v=new Cotxe[]{new Cotxe(5), new Cotxe(2), new Cotxe(15)};

        Arrays.sort(v);
        System.out.println(Arrays.toString(v));

        try {
            System.out.println(new Cotxe(50).compareTo(new String("kfdlkg")));
        }catch(ClassCastException e){
            System.out.println("Els objectes no es poden comparar!!");
        }


    }


}