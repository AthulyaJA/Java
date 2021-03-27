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
import java.util.Scanner;
public class lengthstr {
    public static void main(String args[])
    {
        String a;
        //int count=0;
        Scanner c=new Scanner(System.in);
        System.out.println("enter string");
            a=c.nextLine();
            
            /*while(a>0)
            {
                count=count+1;
                
            }*/
          int length = a.length();
          System.out.println(length);
        
      /* String name = "educative";  //Initilizing a String Object name
       int length = name.length();  //Calling the inbuilt lenght() method
       System.out.println("The length of the String \""+name+"\" is: " +length);*/    }
}
    
    

