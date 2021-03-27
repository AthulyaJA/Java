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
//user input swapping
import java.util.Scanner;
public class userinswap {
    public static void main(String[] args){
        int a;
        int b;
        int temp;
        Scanner c=new Scanner(System.in);
        System.out.println("enter first number");
                a=c.nextInt();
                System.out.println("enter second number");
                b=c.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping the value ofa="+a+"value of="+b);
        
    }
    
}
