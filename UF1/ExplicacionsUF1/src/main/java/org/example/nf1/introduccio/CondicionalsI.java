package org.example.nf1.introduccio;

public class CondicionalsI {


    public static void main(String[] args) {

        //Sentència if
        /*
        if(condició){
            //instruccions que s'executen si la condició és certa....

        }
        */

        int age = 1;

        //Mostraré un missatge si l'edat és superior a 15
        if( age > 15  ) {
            System.out.println("L'edat és superior a 15");
            if( age == 20){
                System.out.println("Tens 20 anys");
            }
            if(age > 30){
                System.out.println("Comences a fer-te gran...");
                System.out.println("Jubilat!!");
            }
        }
    }


}
