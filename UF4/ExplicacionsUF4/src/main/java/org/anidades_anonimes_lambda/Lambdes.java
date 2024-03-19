package org.anidades_anonimes_lambda;

public class Lambdes {
}

//Anem a declarar una interficie FUNCIONAL --> han de tindre un i només un mètodes abstractes
interface Funcional{

    //Només un mètode abstracte
    Object tractaCadenes(String a, String b);

}


class UsaExpressionsLambda{

    //Propietats de la classe
    public static Funcional cadenes=new Funcional() {
        @Override
        public Object tractaCadenes(String a, String b) {
            //Mirem si la cadena b està continguda dins la cadena a

            return a.contains(b);
        }
    };

    public static Funcional cadenes2= //aquí anem a posar una expressió lambda

            ( a,  b) ->  {
            return a.indexOf(b);
    };



}


class UsaExpressionsLambda2{


    public static void main(String[] args) {

       Funcional variable=(a,b)->{
           return a.length()+b.length();
       };
       System.out.println(variable.tractaCadenes("fds","kfdk"));

        System.out.println(UsaExpressionsLambda.cadenes.tractaCadenes("fsddslkkdlsf","kk"));
        System.out.println(UsaExpressionsLambda.cadenes2.tractaCadenes("fsddslkkdlsf","kk"));

    }

}


