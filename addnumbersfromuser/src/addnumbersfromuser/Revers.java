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
//revers a number
import java.util.Scanner;
public class Revers 
{
    public static void main(String[] args)
    {
         int rev=0;
         int n,rem;
         Scanner c=new Scanner(System.in);
         System.out.println("enter a number");
         n=c.nextInt();
         while(n!=0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
         }
         System.out.println("the reversd number are"+rev);
          
         
        
    }
    
}
