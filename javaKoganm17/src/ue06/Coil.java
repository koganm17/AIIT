package ue06;

/**
 *
 * @author harthm17
 */
public class Coil extends Component {

    public Coil (double value) {
        super("L?", value);
    }
    
    public Coil(String id, double value) {
        super(id, value);
    }
    
    void Coil (String l1, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String unit() {
       return "H";
    }

    @Override
    public double energy() {
        return super.getValue() * Math.pow(super.getCurrent(), 2) /2;
    }
    
}
