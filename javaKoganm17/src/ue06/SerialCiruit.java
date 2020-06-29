package ue06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author harthm17
 */
public class SerialCiruit {
    
    private final List<Component> liste = new ArrayList();
    private double current;
    
    public SerialCiruit () {
        
    }
     
    public SerialCiruit (Collection<Component> liste, double current) {
        this.liste.addAll(liste);
        this.current = current;
        for (Component c : this.liste) {
            c.setCurrent(current);
        }
    }   

    public double getCurrent() {
        return current;
    }
    
    public void add (Component c) {
        liste.add(c);
        c.setCurrent(current);
    }
    
    public void setCurrent(double current) {
        this.current = current;
        for (Component component : liste) {
            component.setCurrent(current);
        }
    }
    
    public double totalVoltage() {
        double rv = 0.0;
        for (Component component : liste) {
            rv += component.getVoltage();
        }
        return rv;
    }
    
    public double totalPower() {
        double rv = 0.0;
        for (Component component : liste) {
            rv += component.power();
        }
        return rv;
    }
    
    public double totalEnergy() {
        double rv = 0.0;
        for (Component component : liste) {
            rv += component.energy();
        }
        return rv;
    }
    
    public Component component (String id) {
        for (Component component : liste) {
            if (component.getId().equals(id)) {
                return component;
            }
        }
        return null;
    }
    
    public Collection<Component> getComponents () {
        return liste;
    }

    public Component[] toArray() {
        final Component [] rv = new Component[liste.size()];
        return liste.toArray(rv);
    }  

    @Override
    public String toString() {
        final StringBuilder sb = new  StringBuilder();
        sb.append("SerialCircuit (").append(liste.size()).append(" Components): { ");
        boolean first = true;
        for (Component c : liste) {
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(c.getId()).append("=").append(c.formattedValue(Locale.ENGLISH));
        }
        sb.append(" }");
        return sb.toString();
    }
}
    
