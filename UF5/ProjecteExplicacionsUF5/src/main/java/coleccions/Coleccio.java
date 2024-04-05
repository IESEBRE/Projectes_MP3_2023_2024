package coleccions;

import java.util.ArrayList;
import java.util.Iterator;

public class Coleccio {

    public static void main(String[] args) {

        ArrayList col=new ArrayList();
        int[] array;

        col.add(45);
        col.add(new Object());
        col.add(2, 65);
        System.out.println(col.get(2));

        //Iterem utilitzant un iterador
        Iterator i=col.iterator();

        while(i.hasNext()){
            System.out.println(i.next());

        }

        //Podem usar un bucle foreach
        for(Object o:col ){
            System.out.println(o);
        }

        //Podem recorre un ArrayList de m ode semblant a com recorriem els arrays
        for (int j = 0; j < col.size(); j++) {
            System.out.println(col.get(j));
        }




    }







}
