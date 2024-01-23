package org.example;

import java.util.Arrays;

import static com.iesebre.prova.library.Cadena.buscaCadena;

public class Exercicis {

    public static void main(String[] args) {


//        System.out.println(Arrays.toString(vectorDigitsV2(0)));
//        System.out.println(Arrays.toString(vectorDigitsV2(1000000245)));
//        System.out.println(Arrays.toString(vectorDigitsV2(-145)));

        ;
//        tractaParametres(null);
//        tractaParametres(12,232,3453,56);
//        tractaParametres(12,232,3453,56);
//        tractaParametres(new int[]{1,2,3,4,5,6});
//
//        System.out.println(tractaParametres(1,1,1,1,1,1,1,1));
//        System.out.println(Arrays.toString(tractaParametres(1,1,1,1,1,1,1,1)));
//        System.out.println(Arrays.toString(tractaParametres()));
//        System.out.println(Arrays.toString(tractaParametres(12,232,3453,56)));
//        System.out.println(Arrays.toString(tractaParametres(1,1,1,1,1,1,1,1)));
//        System.out.println(Arrays.toString(tractaParametres(new int[0])));
//        System.out.println(Arrays.toString(tractaParametres(new int[]{1,2,3,4,5,6})));

//        System.out.println(mcdRecursiu(35,7));

//        System.out.println(sumaNaturals(0));
//        System.out.println(sumaNaturals(-20));
//        System.out.println(sumaNaturals(5));

//        System.out.println(potenciaRec(2,3));
//        System.out.println(potenciaRec(2,-3));
//        System.out.println(potenciaRec(2,0));
//        System.out.println(potenciaRec(0,0));

//        System.out.println(nombreCombinatori(3,2));
//        System.out.println(nombreCombinatoriRec(3,2));
//        //System.out.println(nombreCombinatori(100,50));
//        System.out.println(nombreCombinatoriRec(100,50));

//        System.out.println(fibonacci(250000000));

//        for (int i = 0; i < 1000; i++) {
//            System.out.printf("Terme %d-èssim de la successió de Fibonacci: %d%n", i, fibonacciIteratiu(i));
//        }

//        System.out.println(potenciaE(1));
//        System.out.println(potenciaRec(Math.E, 1));

//        System.out.println(seguentPrimer(2));
//        System.out.println(seguentPrimer(8));
//        System.out.println(seguentPrimer(2345642));

    }

    //Exercici 4
    public static String insertaCadena(String primer, String segon, int numero) {
        //Tractament dels casos especials
        if (primer == null) return segon;
        if (segon == null) return primer;
        if (numero < 0) numero = 0;
        if (numero > primer.length()) numero = primer.length();

        String trosDavant = primer.substring(0, numero);
        String trosDarrera = primer.substring(numero);

        return trosDavant + segon + trosDarrera;
    }

    //Exercici 7
    public static String subcadena(String cadena, int ini, int fi) {
        //Tractament dels casos especials
        if (cadena == null) return null;
        if (ini < 0) ini = 0;
        if (fi <= 0 || ini >= cadena.length() || ini >= fi) return "";
        if (fi > cadena.length()) fi = cadena.length();

        return cadena.substring(ini, fi);
    }


    //Exercici 13
    public static int numVector(int[] numero) {
        //Tractament de casos especials
        if (numero == null || numero.length == 0) return 0; //atenció en l'ordre de les comparacions,
        //primer sempre hem de mirar si és null!!

        boolean negatiu = (numero[0] < 0);      //anoto si el número és negatiu

        if (negatiu) numero[0] = numero[0] * -1; //si el número és negatiu li canvio el signe
        int resultat = 0, pot10 = 1;
        for (int i = numero.length - 1; i >= 0; i--) {
            resultat += numero[i] * pot10;
            pot10 = pot10 * 10;
        }
        if (negatiu) {
            numero[0] = numero[0] * -1; //si el número és negatiu li canvio el signe
            resultat = resultat * -1;   //si el número és negatiu li canvio el signe al resultat
        }

        return resultat;
    }

    public static int numVectorV2(int[] numero) {
        //Tractament de casos especials
        if (numero == null || numero.length == 0) return 0;

        int resultat = 0,
                pot10 = (int) Math.pow(10.0, numero.length - 1);
        for (int i = 0; i < numero.length; i++) {
            if (i == 0 && numero[0] < 0)         //si el número és negatiu el sumem en positiu
                resultat += numero[i] * pot10 * -1;
            else resultat += numero[i] * pot10;
            pot10 = pot10 / 10;
        }
        if (numero[0] < 0) resultat *= -1;       //si el número és negatiu canviem el sigen al resultat
        return resultat;
    }


    //Exercici 8
    public static int[] vectorDigits(int numero) {

        boolean negatiu = numero < 0;       //anotem si el número és negatiu
        if (negatiu) numero *= -1;         //si el número és negatiu el passem a positiu

        int[] resultat = new int[Integer.toString(numero).length()];  //creo el vector en el número de caselles necessari
        //resultat=new int[(numero+"").length()];  //creo el vector en el número de caselles necessari

        for (int i = resultat.length - 1; i >= 0; i--) {
            resultat[i] = numero % 10;
            numero = numero / 10;
        }

        if (negatiu)
            resultat[0] = resultat[0] * -1; //si el número era negatiu passem a negatiu la primera casella del vector resultat

        return resultat;
    }

    //Fer el mètode però només usant propietats i mètodes de la classe String i Integer.toString(numero)
    public static int[] vectorDigitsV2(int numero) {
        //Mirem si el número és negatiu i el passem a positiu
        boolean negatiu = numero<0;
        if(negatiu) numero*=-1;

        //Passem el paràmetre enter a String
        String text=Integer.toString(numero);
        int[] resultat = new int[text.length()];

        for (int i = 0; i < text.length() ; i++) {
            resultat[i]=text.charAt(i)-'0';
            //resultat[i]=Integer.parseInt(text.charAt(i)+"");
        }

        //Si el número era negatiu passem a negatiu la primera casella del vector
        if(negatiu) resultat[0]*=-1;

        return resultat;
    }


    // Exercici 17
    public static int[] tractaParametres(int... numeros){
        //Tractament de casos especials
        if(numeros==null || numeros.length==0) return null;

        int suma, max, min;
        suma=max=min=numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            suma+=numeros[i];
            if(numeros[i]>max) max=numeros[i];
            if(numeros[i]<min) min=numeros[i];
        }
        return new int[]{suma, numeros.length, max, min};
    }

    // Exercici 29
    public static int mcdRecursiu(int a, int b){
        if(a==b) return a;
        if(a>b) return mcdRecursiu(a-b, b);
        // Segur que a<b
        return mcdRecursiu(a, b-a);
    }

    //Exercici 30
    public static int sumaNaturals(int n){
        //Casos de parada (no recursius)
        if(n==0) return 0;
        if(n<0) return -1;

        //Cas recursiu
        return n+sumaNaturals(n-1);
    }

    //Exercici 31
    public static double potenciaRec(double base, int exponent){
        //Casos de parada
        if(base==0 &&  exponent==0 ) return Double.NaN;
        if(exponent==0) return 1;

        //Casos recursius
        if(exponent>0) return base*potenciaRec(base, exponent-1);
        return 1 / potenciaRec(base, -exponent);
    }

    //Exercici 33
    public static int nombreCombinatoriRec(int n, int m){
        //Casos de parada
        if(n<m) return -1;
        if(n==m || m==0) return 1;

        //Cas recursiu
        return nombreCombinatoriRec(n-1, m-1)+nombreCombinatoriRec(n-1,m);
    }

    //Exercici 23
    public static int factorial(int n){
        if(n==0) return 1;
        if(n<0) return -1;

        return n* factorial(n-1);
    }

    //Exercici 24
    public static int nombreCombinatori(int n, int m){
        if(n<m) return -1;

        return factorial(n)/(factorial(m)*factorial(n-m));
    }

    //Exercici 32
    public static int fibonacci(int n){
        //Casos de parada
        if(n<0) return -1;
        if(n==0 || n==1) return n;

        //Cas recursiunoSeQUeFaig(int n){
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static long fibonacciIteratiu(int n){
        if(n<0) return -1;
        if(n==0 || n==1) return n;

        long primer=0, segon=1;
        while(n>2){
            //Calcular los nous primer i segon
            long temp=primer;
            primer=segon;
            segon=segon+temp;

            //Decrementem la n per evitar bucle infinit
            n--;
        }

        return primer+segon;

    }

    //Exercici 34
    public static double potenciaE(int x){
        double resultat=1;
        if(x==0) return resultat;

        for (int i = 1; i < 34; i++) {
            resultat+= potenciaRec(x,i)/factorial(i);
        }
        return resultat;
    }

    //Exercici 6
    public static boolean primer(int n){
        if(n<=1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Exercici 36
    /**
     * Retorna el següent nombre primer a partir de n
     * @param n
     * @return
     */
    public static int seguentPrimer(int n){
        if(n<2) return 2;
        while(true){
            n++;
            if(primer(n)) break;
        }
        return n;
    }




}