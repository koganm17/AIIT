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
public class Quader extends Koerper{
    private double a;
    private double b;
    private double h;


    public Quader (double a, double b, double h) {
        super(0.0);
        this.a = a;
        this.b = b;
        this.h = h;
    }
    
    public Quader (double a, double b, double h, double dichte) {
        super (dichte);
        this.a = a;
        this.b = b;
        this.h = h;
    }


    public double getA () {
        return a;
    }


    public void setA (double a) {
        this.a = a;
    }


    public double getB () {
        return b;
    }


    public void setB (double b) {
        this.b = b;
    }


    public double getH () {
        return h;
    }


    public void setH (double h) {
        this.h = h;
    }


    public double getDichte () {
        return dichte;
    }


    public void setDichte (double dichte) {
        this.dichte = dichte;
    }

    

    @Override
    public double oberflaeche () {
        return 2 * (a*b + b*h + a*h);
    }


    @Override
    public double volumen () {
        return a * b * h;
    }
    
    @Override
    public String toString () {
        return String.format(Locale.ENGLISH, "{\"a\":%e,\"b\":%e,\"h\":%e,\"dichte\":%e}", a, b, h, dichte);
        
    }
    
}
