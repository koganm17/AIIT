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
public class vorrangRegeln {
    public static void main(String[] args) {
        int i = 55;
        int j = 97;
        if ((i & 15) < (j & 15)) { 
           System.out.println("LowByte(55) < LowByte(97)");
        } else {
           System.out.println("LowByte(55) >= LowByte(97)");
        }
    }
}
