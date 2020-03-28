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
public class assertions {
    public static void main(String[] args) {
        //assert args.length >= 2; 
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        assert j != 0 : "Teilen durch 0 nicht moeglich"; 
        System.out.println(i + "/" + j + "=" + (i/j));
    }
}
