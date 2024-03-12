package org.interficies;

import java.io.Serializable;

public interface NovaInterficie {

    //Declaració de constants (public static final, per defecte)  --> no s'hereden
    int CONSTANT=23;


    //Mètodes estàtics --> implementats   --> no s'hereden
    static void metodeEstatic(){
        System.out.println("Hola, sóc un mètode estàtic!");
    }

    //Mètode per defecte --> ha d'estar implementat --> SÍ s'hereden
    default void fesAlgo(){
        System.out.println("Hola món!");
    }

    //Mètodes abstractes
    void abstracte();

}

//La herència d'interficies és multiple, a diferencia de la de les classes
interface Filla extends NovaInterficie, Comparable, Serializable {

}