package org.example;

import java.util.Scanner;


public class RimadorOriol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCasos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCasos; i++) {
            String[] frases = scanner.nextLine().split(", ");

            String primera = frases[0];
            String segona = frases[1];

            int index= 0;


            for (int j = 1; j <= primera.length() && j <= segona.length(); j++) {
                if (primera.endsWith(segona.substring(segona.length() - j))) {
                    index = j;
                }
            }


            System.out.println((index > 0) ? primera.substring(primera.length() - index) : "#");
        }

    }
}