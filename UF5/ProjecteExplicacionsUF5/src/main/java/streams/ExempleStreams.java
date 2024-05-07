package streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class ExempleStreams {

    public static void main(String[] args) {
        ArrayList<Object> dades = new ArrayList<>();
        Stream<Object> stream = dades.stream();
        System.out.println(stream.count());

        Optional resultat;// = dades.stream().max();

        resultat.orElse("No hi ha res");

        stream.forEach(System.out::println);


        Stream<String>  textos= Stream.of("hola", "adeu", "bon dia", "buenas noches");

        if(textos.distinct().filter(s -> s.startsWith("b")).allMatch(s -> s.contains("a")))
            System.out.println("Tots els textos comencen per b i contenen a");

        textos.forEach(System.out::println);

//        for(String s:textos){
//            System.out.println(s);
//        }
//
//        //Stream infinit
//        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2);
//        System.out.println("Quants elements vosl tractar?:");
//        int numElem=45;
//        long quants=streamIterated.limit(numElem).count();

    }

}
