package org.example;

import java.util.Scanner;

public class ArribaAbajo {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int avantN = ent.nextInt();
        int darrereN = ent.nextInt();
        int avantB = ent.nextInt();
        int darrereB = ent.nextInt();
        int posN, posB, comptParcPassosN, comptParcPassosB;
        posN=posB=comptParcPassosN=comptParcPassosB=0;

        //Variables que controlen cap on caminen els personatges
        boolean caminaAvantN=true, caminaAvantB=true;

        int numPassos = ent.nextInt();
        while (numPassos-- > 0) {
            //Tractament de cada pas
            //Tractem el moviment d'N
            if(caminaAvantN){
                posN++;                     //avancem una posició
                comptParcPassosN++;         //acumulewm un pas cap avant
                if(comptParcPassosN==avantN) {
                    caminaAvantN = false;   //si N ha avançat els passos permesos canviem la direcció
                    comptParcPassosN = 0;   //poso a 0 el comptador de passos, perquè hem canviat de direcció
                }
            }else{
                posN--;                     //reculem una posició
                comptParcPassosN++;         //acumulewm un pas cap darrera
                if(comptParcPassosN==darrereN) {
                    caminaAvantN = true;   //si N ha avançat els passos permesos canviem la direcció
                    comptParcPassosN = 0;  //poso a 0 el comptador de passos, perquè hem canviat de direcció
                }
            }

            //Tractem el moviment de B
            if(caminaAvantB){
                posB++;                     //avancem una posició
                comptParcPassosB++;         //acumulewm un pas cap avant
                if(comptParcPassosB==avantB) {
                    caminaAvantB = false;   //si N ha avançat els passos permesos canviem la direcció
                    comptParcPassosB = 0;   //poso a 0 el comptador de passos, perquè hem canviat de direcció
                }
            }else{
                posB--;                     //reculem una posició
                comptParcPassosB++;         //acumulewm un pas cap darrera
                if(comptParcPassosB==darrereB) {
                    caminaAvantB = true;   //si N ha avançat els passos permesos canviem la direcció
                    comptParcPassosB = 0;  //poso a 0 el comptador de passos, perquè hem canviat de direcció
                }
            }




        }
        if(posN>posB) System.out.println("Nikky");
        else if(posN<posB) System.out.println("Byron");
        else System.out.println("Tied");
    }
}
