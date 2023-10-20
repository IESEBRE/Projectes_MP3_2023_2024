package org.example;

import java.util.Locale;

public class Formateig {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        char letra='t';
        int numero=64000;
        System.out.printf("%C %n", 'a');
        System.out.format("%C %n", letra);
        System.out.format("%s %s %s %-8s %S", letra, 'o', 23676, "Hola", "Adeu");
        System.out.println();
        System.out.format("%c %<C %2$d %3$s %<S", letra, 23676, "Hola");
        System.out.println();
        System.out.printf("%b", numero>0);
        System.out.println();

        System.out.printf("Decimal: %d Octal: %o Hexadecimal: %x %X", numero, numero, numero, numero);
        System.out.println();

        System.out.printf("%f %1$e %1$E %1$g %1$G", Math.PI);
        System.out.println();
        System.out.printf("%+010.2f", Math.PI);
        System.out.println();
        System.out.printf("%f %<e %<E %<g %<G", Math.PI);

    }



}
