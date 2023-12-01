package org.example;

import java.util.Scanner;

public class MagicReloaded {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            //Tractament de cada cas
            int dim=ent.nextInt();
            int[][] m=new int[dim][dim];    //matriu resultat, inicialment plena de 0s
            int valor=1;

            //L'1 va al mig de la primera fila de la matriu
            int i=0, j=dim/2;

            m[i][j]=valor++;

            while(valor<=dim*dim){
                //Calculem la nova posició, però abans mos guardem l'actual
                int aI=i, aJ=j;
                i--;
                if(i==-1) i=dim-1;
                j--;
                if(j==-1) j=dim-1;

                //Posem el valor a la nova casella calculada, si no està ja plena
                if(m[i][j]!=0) {       //La casella ja estava plena, per tant hem de calcular una nova posició
                    i=aI+1;
                    j=aJ;
                }
                m[i][j]=valor++;
            }

            for (int k = 0; k < m.length; k++) {
                for (int l = 0; l < m[k].length; l++) {
                    System.out.printf("%d ", m[k][l]);
                }
                System.out.println();
            }

            //Fiquem un salt de linia per separar les matrius resultat
            System.out.println();
        }
    }
}
