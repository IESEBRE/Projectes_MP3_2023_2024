package org.example;

public class MetodesIII {

    public static void main(String[] args) {
        metode();
        metode(null);
        //metode(12);
        //metode(23,45,656,76,6,787,87,787,87,778,98,989,8,98,9);

        //metode2(2);
        //metode2(4343,5454,546546546);
    }

    public static void metode(int... param){
        if(param==null){
            System.out.println("Has passat un null");
            return;
        }

        System.out.println("M'has passat "+param.length+" paràmetres");
        for (int i = 0; i < param.length; i++) {
            System.out.println(param[i]);
        }
    }

    public static void metode2(float i, int f, char c, double d, String s, int[] v, int... j){


    }

}
