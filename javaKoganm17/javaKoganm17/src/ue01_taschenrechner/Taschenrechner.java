/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01_taschenrechner;

/**
 *
 * @author andi0
 */


public class Taschenrechner {
    public double a;
    public double b;
    
    public Taschenrechner(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    double getAdditionResult(){
        return a + b;
    }
    
    double getSubtractionResult(){
        return a - b;
    }
    
    double getMultiplicationResult(){
        return a * b;
    }
    
    double getDivisionResult(){
        return a / b;
    }
}
