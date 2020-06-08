/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue5_koerpergruppe;


/**
 *
 * @author schueler
 */
public abstract class Koerper {
    public static final double DICHTE_EICHE = 670;
    public static final double DICHTE_EICHE = 690;
    
    double dichte; 


    public Koerper (double dichte) throws IllegalArgumentException{
        if(dichte < 0) {
            throw new IllegalArgumentException("Invalid Parameter dichte");
        }
        
        this.dichte = dichte;
    }


    public double getDichte () {
        return dichte;
    }


    public void setDichte (double dichte) {
        this.dichte = dichte;
    }
    
    public abstract double oberflaeche ();
    
    public abstract double volumen ();
    
    pubic double masse () {
        return volumen() * dichte;
    }
    
}
