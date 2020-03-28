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
public class Testauto {
    static private int objcnt = 0;

    public Testauto() {
        ++objcnt;
   }
 
   public void finalize() {
        --objcnt;
   }
 
   public static void main(String[] args)
   {
        Testauto auto1;
        Testauto auto2 = new Testauto();
        System.out.println(
        "Anzahl Testauto-Objekte: " + Testauto.objcnt
        );
      }
}
