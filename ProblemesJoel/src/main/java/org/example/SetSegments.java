package org.example;

import java.util.Scanner;

public class SetSegments {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        //              0 1 2 3 4 5 6 7 8 9
        int[] segments={6,2,5,5,4,5,6,3,7,6};
        final int COST_SEGMENT = 15;
        final int COST_COLON = 10;

        while(true){
            //Tractem cada cas de prova
            String linia=ent.nextLine().trim();
            if(linia.equals("99:99 0")) break;

            String[] dades=linia.split(" ");
            String temps= dades[0];

            int minuts = Integer.parseInt(dades[1]);

            int cost=0;

            for (int i = 0; i < temps.length(); i++) {
                if(temps.charAt(i)==':') cost+=COST_COLON;
                else cost+=segments[ Integer.parseInt(temps.charAt(i)+"")  ]*COST_SEGMENT;
            }

            //Iterar els minuts indicats
            while(minuts-->0){
                //Calculem el nou temps, sumant un minut
                String[] parts=temps.split(":");
                int hora=Integer.parseInt(parts[0]);
                int minut=Integer.parseInt(parts[1]);
                if(minut!=59) minut++;
                else{
                    minut=0;
                    if(hora!=23) hora++;
                    else{
                        hora=0;
                    }
                }
                temps=(hora<=9?"0":"")+hora+":"+(minut<=9?"0":"")+minut;

                //Sumem el cost del nou temps
                for (int i = 0; i < temps.length(); i++) {
                    if(temps.charAt(i)==':') cost+=COST_COLON;
                    else cost+=segments[ Integer.parseInt(temps.charAt(i)+"")  ]*COST_SEGMENT;
                }
            }
            //Mostrar el resultat
            System.out.println(cost);
        }


    }

}
