/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02;

/**
 *
 * @author andi0
 */

import java.util.Date;

abstract class Mitarbeiter {
    int persnr;
    String name;
    Date eintritt;

    public Mitarbeiter()
    {
    }
 
    public abstract double monatsBrutto();
}
 
class Arbeiter
extends Mitarbeiter{
    double stundenlohn;
    double anzahlstunden;
    double ueberstundenzuschlag;
    double anzahlueberstunden;
    double schichtzulage;
 
    public double monatsBrutto() {
        return stundenlohn*anzahlstunden+
        ueberstundenzuschlag*anzahlueberstunden+
        schichtzulage;
   }
 } 
 class Angestellter
 extends Mitarbeiter
 {
    double grundgehalt;
    double ortszuschlag;
    double zulage;

    public double monatsBrutto() {
        return grundgehalt+
        ortszuschlag+
        zulage;
    }
}
 
class Manager
extends Mitarbeiter
 {
    double fixgehalt;
    double provision1;
    double provision2;
    double umsatz1;
    double umsatz2;
 
    public double monatsBrutto() {
    return fixgehalt+
        umsatz1*provision1/100+
        umsatz2*provision2/100;
   }
}

class Gfmanager
extends Manager {
    double GfZulage;
    
    public double monatsBrutto() {
        return super.monatsBrutto()+gfzulage;
    }
}



public class Gehaltsberechnung {
    private static final int ANZ_MA = 100;
    private static Mitarbeiter[] ma;
    private static double bruttosumme;
    
    public static void main(String[] args) {
        ma = new Mitarbeiter[ANZ_MA];
 
        bruttosumme = 0.0;
        for (int i=0; i<ma.length; ++i) {
             bruttosumme += ma[i].monatsBrutto();
        }
        System.out.println("Bruttosumme = "+bruttosumme);
    }
}
