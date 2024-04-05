package coleccions;

import java.util.ArrayList;
import java.util.List;

public class ColeccioII {

    public static void main(String[] args) {

        List<Element> col=new ArrayList<>();   //necessito una col·lecció d'Element


        col.add(new Element(1));
        col.add(new Element(12));
        col.add(new Element(21));
        //col.add(new String("dshsdjfh"));

        for(Element e:col){

            System.out.println(e.mostrar());

        }

    }

}

class Element{

    public int codi;

    public Element(int codi) {
        this.codi = codi;
    }

    @Override
    public String toString() {
        return "Element{" +
                "codi=" + codi +
                '}';
    }

    public int mostrar(){
        return codi;

    }
}