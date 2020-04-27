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
public class InvalidResistorValueException extends Exception{
    private final double invalidValue;
    
    public InvalidResistorValueException(double invalidValue) {
        super("Invalid resistor " +invalidValue + ". It should be between 0 and 10 M");
        this.invalidValue = invalidValue;
    }
    
    public double getInvalidValue() {
        return invalidValue;
    }
    
}
