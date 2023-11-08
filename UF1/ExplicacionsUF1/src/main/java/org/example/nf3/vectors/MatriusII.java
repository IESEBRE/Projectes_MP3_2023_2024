package org.example.nf3.vectors;

public class MatriusII {

    public static void main(String[] args) {
        //declarem un superarray
        char[][][][][] superarray;

        //instanciem el superarray
        superarray=new char[10][][][][];
        superarray=new char[10][40][][][];
        superarray=new char[10][40][30][][];
        //superarray=new char[10][40][][45][]; --> s'han de declarar les dimensions d'esquerra a dreta sense dixar cap
        //                                         d'intermitja sense especificar
        superarray=new char[10][20][30][40][50];

        for (int i = 0; i < superarray.length; i++) {
            for (int j = 0; j < superarray[i].length; j++) {
                for (int k = 0; k < superarray[i][j].length; k++) {
                    for (int l = 0; l < superarray[i][j][k].length; l++) {
                        for (int m = 0; m < superarray[i][j][k][l].length; m++) {
                            superarray[i][j][k][l][m]=(char)(i+j*k/(l+1)+m);
                            System.out.printf("%c ",superarray[i][j][k][l][m]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

    }



}
