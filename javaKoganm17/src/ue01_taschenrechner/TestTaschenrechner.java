/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01_taschenrechner;

import java.util.Scanner;

/**
 *
 * @author andi0
 */
public class TestTaschenrechner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Wert a: ");
        final double a = s.nextDouble();
        System.out.print("Wert b: ");
        final double b = s.nextDouble();
        
        Taschenrechner test = new Taschenrechner(a, b);
        
        System.out.format("Addition:        %.3f",test.getAdditionResult());
        System.out.format("\nSubtraction:    %.3f",test.getSubtractionResult());
        System.out.format("\nMultiplication: %.3f",test.getMultiplicationResult());
        System.out.format("\nDivision:       %.3f",test.getDivisionResult());
    }
}