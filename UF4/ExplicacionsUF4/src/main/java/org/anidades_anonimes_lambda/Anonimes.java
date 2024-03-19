package org.anidades_anonimes_lambda;

public class Anonimes {

    public void fesAlgo(){

        System.out.println("Estic a una classe anmomeada Anonimes!!");

    }


}

class Proves{

    public static void main(String[] args) {

        Anonimes objecteEnClasseEnNom=new Anonimes();

        Anonimes objecteEnClasseSenseNom=new Anonimes(){    //La classe de l'objecte és anònima (no té nom)

            @Override
            public void fesAlgo() {
                System.out.println("Estic a una classe anònima!!");
            }
        };


    }



}