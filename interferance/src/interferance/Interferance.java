/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interferance;



    interface printable
    {
        void print();
    }
 public class Interferance implements printable
 {
     public void print()
     {
         System.out.print("hello");
     }
    
    public static void main(String[] args) {
        
        Interferance obj=new Interferance ();
        obj.print();
    }
    
}
