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
public class merhdimensionaleArrays {
    public static void main(String[] args) {
        int[][] a = new int [2][3];
          
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        
        System.out.println(""+a[0][0]+a[0][1]+a[0][2]);
        System.out.println(""+a[1][0]+a[1][1]+a[1][2]);   
    }
}
