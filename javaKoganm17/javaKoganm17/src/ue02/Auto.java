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
public class Auto {
    public String name;
    public int erstzulassung;
    public int leistung;
    
    public int alter() {
        return 2020 - erstzulassung;
    }
}
