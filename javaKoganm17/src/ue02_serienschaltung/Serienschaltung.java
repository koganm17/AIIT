/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

/**
 *
 * @author andi0
 */
public class Serienschaltung {
    private double strom;
    private double [] widerstandsFeld;
    private double spannung;

    private void updateSpannung() {
        double rges = 0.0;
        
        for(double r : widerstandsFeld) {
            rges +=r;
        }
        
        spannung = strom * rges;
        
        /*(widerstandsFeld == null) {
            spannung = 0;
        } else {
            for(int i = 0; i < widerstandsFeld.length; ++i) {
            spannung += strom*widerstandsFeld[i];
            }
        } */
    }
    
    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException {
        if( widerstandInOhm > 10000000 || widerstandInOhm < 0) {
            throw new InvalidResistorValueException(widerstandInOhm);
        }
        if (widerstandsFeld == null) {
            widerstandsFeld = new double[1];
            widerstandsFeld[0] = widerstandInOhm;
        } else {
            double tmp[];
            tmp = new double[widerstandsFeld.length + 1];
            /*System.arraycopy(widerstandsFeld, 0, tmp, 0, widerstandsFeld.length);*/
            for(int i = 0; i < widerstandsFeld.length; i++) {
                tmp[i] = widerstandsFeld[i];
            }
            tmp[tmp.length - 1] = widerstandInOhm;
            widerstandsFeld = tmp;
        }
        
        updateSpannung();
    }
    
    public double getStrom() {
        return strom;
    }
    
    public void setStrom(double strom) {
        this.strom =  strom;
        updateSpannung();
    }
    
    public double getSpannung() {
        return spannung;
    }

    @Override
    public String toString() {
        return "Serienschaltung{" + "strom=" + strom + ", widerstandsFeld=" + widerstandsFeld + ", spannung=" + spannung + '}';
    }
    
   
}
