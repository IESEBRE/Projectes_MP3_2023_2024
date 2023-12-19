package org.example;

public class MetodesIV {

    public static void main(String[] args) {
        //noRecursiu(25);
        System.out.println(factorial(Integer.MAX_VALUE));
    }

    public static void recursiu(int a){
        System.out.println(a);
        recursiu(a-1);
    }

    public static void noRecursiu(int a){
        while(true){
            System.out.println(a);
            a=a-1;
        }
    }

    public static int factorial(int n){
        if(n==0) return 1;

        return n* factorial(n-1);

    }



}
