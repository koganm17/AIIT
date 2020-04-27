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
public class privateClass {
    public static void main(String[] args) {
        ClassWithPrivateA a1 = new ClassWithPrivateA(7);
        ClassWithPrivateA a2 = new ClassWithPrivateA(11);
        a2.setOtherA(a1, 999);
        System.out.println("a1 = " + a1.toString());
        System.out.println("a2 = " + a2.toString());

    }
}

class ClassWithPrivateA
 {
   private int a;
 
   public ClassWithPrivateA(int a){
     this.a = a;
   }
 
   public void setOtherA(ClassWithPrivateA other, int newvalue){
     other.a = newvalue;
   }
 
   public String toString(){
        return "" + a;
    }
}