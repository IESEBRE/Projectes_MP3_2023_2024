package org.example.nf1.introduccio;

public class Conversions {


    public static void main(String[] args) {

        double valorReal = 2.34 ;
        int valorEnter = (int)valorReal;  //casting --> convertix el valor al tipo indicat
        //String text= (String)56; //no es pot fer casting ja que String no és un número
        String text= "" + 56; //genera l'String "56"
        text = Integer.toString(56);//genera l'String "56"

        //text="nm,mnmm";  --> si posem un valor no enter el parseInt retorna una excepció NumberFormatException
        valorEnter = Integer.parseInt(text);  //valorEnter contindrà un 56

        System.out.println(valorEnter);
    }
}
