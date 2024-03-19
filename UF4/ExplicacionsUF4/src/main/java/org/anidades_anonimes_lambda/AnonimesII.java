package org.anidades_anonimes_lambda;

public interface AnonimesII {

    void fesAlgo();

    void fesAlgoMes();



}

class Implementa implements AnonimesII{
    @Override
    public void fesAlgo() {

    }

    @Override
    public void fesAlgoMes() {

    }
}


class Proves2{

    public static void main(String[] args) {

        AnonimesII objecteEnClasseEnNom=new Implementa() {  //la classe de l'objecte és Implementa, per tant té nom


        };

        AnonimesII objecte=new AnonimesII() {              //la classe de l'objecte no la sabem, per tant NO té nom
            @Override
            public void fesAlgo() {
                //Pots posar el codi que et done la gana!!
                System.out.println("Hola idfsidufdisufso" );
            }

            @Override
            public void fesAlgoMes() {

            }
        };

        AnonimesII objecte2=new AnonimesII() {              //la classe de l'objecte no la sabem, per tant NO té nom
            @Override
            public void fesAlgo() {
                //Pots posar el codi que et done la gana!!
                System.out.println(2+2 );
            }

            @Override
            public void fesAlgoMes() {

            }
        };

        objecte.fesAlgo();
        objecte2.fesAlgo();

    }




}
