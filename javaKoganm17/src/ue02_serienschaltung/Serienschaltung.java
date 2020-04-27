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
        if(widerstandsFeld == null) {
            spannung = 0;
        } else {
            for(int i = 0; i < widerstandsFeld.length; ++i) {
            spannung += strom*widerstandsFeld[i];
            }
        }
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
            tmp = new double[widerstandsFeld.length];
            System.arraycopy(widerstandsFeld, 0, tmp, 0, widerstandsFeld.length);
            widerstandsFeld = new double[widerstandsFeld.length + 1];
            System.arraycopy(tmp, 0, widerstandsFeld, 0, widerstandsFeld.length);
            widerstandsFeld[widerstandsFeld.length] = widerstandInOhm;
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
