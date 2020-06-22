package ue06;


public class Coil extends Component {

    public Coil(String id, double value) {
        super(id, value);
    }
    
    public Coil(double value) {
        super("L1", value);
    }

    @Override
    public String unit() {
        return "H";
    }

    @Override
    public double energy() {
        return super.getValue() * Math.pow(super.getCurrent(),2)/2;
    }
    
}
