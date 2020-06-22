package ue06;


public class Resistor extends Component {
    
    public Resistor(String id, double value) {
        super(id, value);
    }
    
    public Resistor(double value) {
        super("R1", value);
    }

    @Override
    public String unit() {
        return "Ω";
    }

    @Override
    public double energy() {
        return 0;
    }
    
}
