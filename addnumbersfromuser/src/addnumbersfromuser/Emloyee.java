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
public class Emloyee 
{
    
    float salary=10000;
    
    
}
  class programer extends Emloyee
 {
     
     int bonus=50000;
     
     
 public static void main(String[] args)
{

 programer P=new programer();
 System.out.println("programer salry"+P.salary);
System.out.println("programer bnous"+P.bonus);
 }
 }