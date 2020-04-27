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
public class printAuto {
    public static void main(String[] args) {
        
        Auto Auto1 = new Auto();
        Auto1.name = ("Passat");
        Auto1.leistung = 131;
        Auto1.erstzulassung = 2002;

        System.out.println("Name........."+Auto1.name);
        System.out.println("Zugelassen..."+Auto1.erstzulassung);
        System.out.println("Alter........"+Auto1.alter());
        System.out.println("Leistung....."+Auto1.leistung);
          
    }    
}
