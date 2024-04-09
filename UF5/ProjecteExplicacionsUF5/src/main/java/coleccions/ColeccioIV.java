package coleccions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ColeccioIV {


    public static void main(String[] args) {

        List<Elemento> l = new ArrayList<>();

        l.add(new Elemento(2, "Sabate"));
        l.add(new Elemento(1, "Sabate"));


        Collections.sort(l, new Comparator<Elemento>(){


            @Override
            public int compare(Elemento o1, Elemento o2) {
                return o1.getText().compareTo(o2.getText());
            }
        });

        for (Elemento e : l) {
            System.out.println(e);
        }



    }
}
