/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addnumbersfromuser;

/**
 *
 * @author Enter-Lab
 */
public class hirera {
    
    
   {
	System.out.println("Class Car");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
}
class maruti400 extends hirera
{
    public void maruti400()
   {
	System.out.println("Class Maruti");
   }
   
   public void speed()
   {
	System.out.println("Max: 90Kmph");
   }
}

class duster extends hirera
        
{
    
    public void dus()
    {
        System.out.println("Class duster");
        
    }
    
    public void color()
    {
        System.out.println("Color Red");
    }

public static void main(String[] args)
   {
	 duster a=new duster();
         a.color();
         //a.maruti400();

   }
}
