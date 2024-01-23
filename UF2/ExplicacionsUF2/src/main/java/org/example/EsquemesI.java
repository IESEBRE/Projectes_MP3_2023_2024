package org.example;

public class EsquemesI {

    //Declaració de variables (propietats)
    static int[] edats;        //Edats dels alumnes
    static int index;          //Index a l'actual alumne
    static int comptMaj18;     //Comptador de alumnes majors d'edat


    public static void main(String[] args) {

        inicialitzarvariables();
        do{
            tractarElement();
        }while(noElementFinal());
        tractamentFinal();
    }

    private static void tractamentFinal() {
        System.out.printf("Hi ha %d alumnes majors d'edat d'un total de %d%n", comptMaj18, edats.length);
        System.out.println("Hi ha "+comptMaj18+" alumnes majors d'edat d'un total de "+edats.length+"\n");
    }

    private static void tractarElement() {

        //Mirar si l'edat de l'alumne actual és superuor mo igual a 18
        if(edats[index]>=18) comptMaj18++;

        //Passem al següent alumne
        index++;
    }

    private static boolean noElementFinal() {
        return index<edats.length;
    }



    private static void inicialitzarvariables() {

        edats=new int[]{18,20,16,14};
        index=0;
        comptMaj18 = 0;
    }
}
