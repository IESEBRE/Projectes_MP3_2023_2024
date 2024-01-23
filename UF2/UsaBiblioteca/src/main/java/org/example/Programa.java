package org.example;

import java.util.Arrays;

import static com.iesebre.mp3.uf2.library.Data.diaSeguent;
import static com.iesebre.mp3.uf2.library.Data.diferenciaDies;

public class Programa {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(diaSeguent(29,2,2024)));
        System.out.println(diaSeguent(29,2,2023));
        System.out.println(Arrays.toString(diaSeguent(31,5,2023)));
        System.out.println(Arrays.toString(diaSeguent(31,12,2023)));
        System.out.println(Arrays.toString(diaSeguent(19,1,2024)));

        System.out.println(diferenciaDies(8,12,2005,23,1,2024));

    }


}
