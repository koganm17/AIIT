/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01;

/**
 *
 * @author andi0
 */
public class Referenzgleichheit {
    public static void main(String[] args) {
        String a = new String("hallo");
        String b = new String("hallo");
         System.out.println("a == b liefert " + (a == b));
         System.out.println("a != b liefert " + (a != b));
    }
}
