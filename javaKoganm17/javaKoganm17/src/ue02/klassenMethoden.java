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
public class klassenMethoden {
    public static void main(String[] args) {
        double x, y;
        for (x = 0.0; x <= 10.0; x = x + 1.0) {
            y = Math.sqrt(x);
            System.out.println("sqrt("+x+") = "+y);
        }
    }
}
