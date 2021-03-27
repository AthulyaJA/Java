/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//user input sum
package addnumbersfromuser;

import java.util.Scanner;
public class Addnumbersfromuser {

   
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;
        Scanner a=new Scanner(System.in);
                System.out.println("enter first number");
                num1=a.nextInt();
                System.out.println("enter second number");
                num2=a.nextInt();
                sum=num1+num2;
                System.out.println("sum is="+sum);
    }
    
}
