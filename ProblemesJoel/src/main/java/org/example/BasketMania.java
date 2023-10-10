package org.example;

import java.util.Scanner;

public class BasketMania {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //Primero leemos el número de casos
        int numCasos = ent.nextInt();

        while(numCasos-->0){
            //Tratamiento de cada caso
            int numJugades = ent.nextInt(), puntosL = 0, puntosV = 0;
            while(numJugades-->0){
                //Tratamiento de cada jugada
                String equipo = ent.next(); //guardamos la cadena V o L
                int puntuacion = Integer.parseInt(ent.next());    //transforma el texto que devuelve next() a número entero

                /*String jugada = ent.nextLine();
                switch(jugada){
                    case "V 1":
                        puntosV+=1;
                        break;
                    case "V 2":
                        puntosV+=2;
                        break;
                    case "V 3":
                        puntosV+=3;
                        break;
                    case "L 1":
                        puntosL+=1;
                        break;
                    case "L 2":
                        puntosL+=2;
                        break;
                    case "L 3":
                        puntosL+=3;
                        break;
                }
                */
                //Asignamos los puntos al equipo que ha hecho cada jugada
                if(equipo.equals("V")) puntosV=puntosV+puntuacion;
                else puntosL=puntosL+puntuacion;
            }
            //Mostramos el resultado de la jugada
            if(puntosV==puntosL) System.out.print("E ");
            else if(puntosV>puntosL) System.out.print("V ");
            else System.out.print("L ");
            System.out.printf("%d %d%n", puntosL, puntosV);
        }
    }
}
