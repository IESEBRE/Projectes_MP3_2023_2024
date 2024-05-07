package coleccions;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Persona {

    private int codi;

    Set<Persona> parents = new TreeSet<>();

    public Persona(int codi) {
        this.codi = codi;
    }

    public void afegirParent(Collection<Persona> parent) {
        parents.addAll(parent);
    }

    public void afegirParent(Persona parent) {
        parents.add(parent);
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "codi=" + codi +
                '}';
    }

    public int mostrar(){
        return codi;

    }
}
