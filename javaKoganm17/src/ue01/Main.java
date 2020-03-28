/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01;


/**
 *
 * @author Niklas Fuchshofer
 */
public class Main {
    
    private static int counter; //Zählereigenschaft
    
    public static void main (String[] args) { //psvm \t
        for (int i = 0; i < 10; i++) {
            counter += i;
            System.out.println(counter); //sout \t
        }
    }
}
