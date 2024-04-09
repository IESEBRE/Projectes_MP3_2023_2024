package coleccions;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ColeccioIII {

    public static void main(String[] args) {

        Set<Elemento> c=new TreeSet<Elemento>(

                new Comparator<Elemento>(){

                    @Override
                    public int compare(Elemento o1, Elemento o2) {
                        return o1.getText().compareTo(o2.getText());
                    }
                }


        );

        c.add(new Elemento(2,"Melich"));
        c.add(new Elemento(1,"Melich"));
        c.add(new Elemento(11,"Bayarri"));
        c.add(new Elemento(7,"Goncear"));

        for(Elemento e:c){
            System.out.println(e);

        }

    }
}

class Elemento implements Comparable<Elemento>{

    private int codi;
    private String text;

    public Elemento(int codi, String text) {
        this.codi = codi;
        this.text = text;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "codi=" + codi +
                ", text='" + text + '\'' +
                '}';
    }

    //Anem a ordenar per codi en l'ordre natural dels enters --> este ordre serà a la vegada el natural dels objectes de
    //la classe
    @Override
    public int compareTo(Elemento o) {
        return this.codi-o.codi;
    }
}
