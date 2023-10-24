package org.example.nf1.introduccio;

import java.security.spec.RSAOtherPrimeInfo;

public class RepetitusV {

    public static void main(String[] args) {
        {
            int i=0;            //inicialització

            while(i<100){       //condició
                System.out.println("Valor de la variable: "+i); //instruccions
                i++;            //actualització
            }
        }
        System.out.println("Valor de la variable al sortir del bucle: ");
        /*
        for(inicialitzacions; condició; actualitzacions){
            instruccions;
        }
        */
        int j;
        for(j=0; j<100 ; j++){
            System.out.println("Valor de la variable: "+j);
        }
        System.out.println("Valor de la variable al sortir del bucle: "+j);

//        for(int i=0, j=8, k=78; i<j*k; i++, j--, k*=25)
//        {
//            System.out.printf("%d %d %d%n", i, j, k);
//
//        }

    }

}
