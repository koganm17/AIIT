/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue5_koerpergruppe;

import java.util.Locale;


/**
 *
 * @author schueler
 */
public class Kugel extends Koerper{
    private double r;


    public Kugel (double r) {
        super(0.0);
        this.r = r;
    }
    
    public Kugel (double r, double dichte) {
        super (dichte);
        this.r = r;
    }


    public double getR () {
        return r;
    }


    public void setR (double r) {
        this.r = r;
    }


    public double getDichte () {
        return dichte;
    }


    public void setDichte (double dichte) {
        this.dichte = dichte;
    }

    
    @Override
    public double oberflaeche () {
        return 4 * r * r * Math.PI;
    }


    @Override
    public double volumen () {
        return 4/3 * Math.PI * Math.pow(r, 3);
    }
    
    @Override
    public String toString () {
        return String.format(Locale.ENGLISH, "{\"r\":%e,\"dichte\":%e}", r, dichte);
        
    }
}
