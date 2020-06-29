package ue06;

/**
 *
 * @author harthm17
 */
public class Capacitor extends Component {
    
    public Capacitor (double value) {
        super("C?", value);
    }
    
    public Capacitor(String id, double value) {
        super(id, value);
    }

    void Capacitor (String c1, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String unit() {
        return "F";
    }

    @Override
    public double energy() {
        return super.getValue() * Math.pow(super.getVoltage(), 2) /2;
    }


    
}
