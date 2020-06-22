package ue06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class SerialCiruit {

    private final List<Component> liste = new ArrayList();
    private final double current;

    public SerialCiruit (Collection<Component> liste, double current) {
        this.liste.addAll(liste);
        this.current = current;
        for (Component c : this.liste) {
            c.setCurrent(current);
        }
    }

    public int size() {
        return liste.size();
    }

    public boolean contains(Object o) {
        return liste.contains(o);
    }

    public Object[] toArray() {
        return liste.toArray();
    }

    public boolean add(Component e) {
        return liste.add(e);
    }

    public boolean remove(Object o) {
        return liste.remove(o);
    }


}