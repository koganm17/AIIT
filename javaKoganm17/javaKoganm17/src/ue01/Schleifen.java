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
public class Schleifen {
    public static void main(String[] args) {
        int[][] data = new int[10][10];
 
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 10; ++j) {
                data[i - 1][j - 1] = i * j;
            }
        }
        
      loop1:
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 10; ++j) {
                if (data[i - 1][j - 1] > 43) {
                System.out.println(i + "*" + j + "=" + (i*j));
                break loop1;
                }
            } 
        } 
    }
}
