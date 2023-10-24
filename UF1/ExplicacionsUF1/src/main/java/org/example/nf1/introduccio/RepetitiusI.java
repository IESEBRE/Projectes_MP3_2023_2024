package org.example.nf1.introduccio;

public class RepetitiusI {

    public static void main(String[] args) {

        //Sintaxi del while
        /*
        while(condició){
            instruccions
        }
        */

        int num=1;  //valor inicial de la variable de control del bucle

        //Mostrem de l'1 al 2 --> no cal bucle
        System.out.println(1);
        System.out.println(2);

        //Mostrem de l'1 al 1000 --> podem posar 1000 souts, o utilitzar un bucle
        while( num<=1000 ){     //condició que ha de ser true inicialment i false en el futur
            System.out.println(num);
            num=num+1;          //actualització de la variable de control
        }


    }


}
