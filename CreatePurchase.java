/*
Brice Widger
2/13/2020
Bellevue University
Assignment 3.2
File: CreatePurchase.java

Source:
Java Programming; Joyce Farrell; Course Technology
*/
import java.util.*;
class Purchase
{
   //Declaration of variable
   int invoice_number;
   double sales_amount;
   double sales_tax;
   //tax_rate is static member of class
   static double tax_rate=7.5;
   
   //set() to get invoice number and Sales Amount
   public void set()
   {  
       //Creating instance of Scanner class to read from Command Line  
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Invoice Number:");
       this.invoice_number=Integer.parseInt(in.nextLine());
       System.out.println("Enter Sales Amount:");
       this.sales_amount=Double.parseDouble(in.nextLine());
       //if sale smount is negtive, terminate program and start again; must be positive
       if (sales_amount < 0.0){
           System.out.println(sales_amount + " is a negative Sales Amount, and must " +
                   "be positive. Try again.");
                      System.exit(0); //code to end program
       }
        //Calculating the sales_tax
        this.sales_tax=this.sales_amount*(tax_rate/100);
   }
   //display Method to display formated output
   public void display()
   {
       System.out.println("------------------------");
       System.out.println("Invoice Number:"+this.invoice_number);
       System.out.println("Sales Amount:"+this.sales_amount);
       System.out.println("Sales Tax:"+this.sales_tax);
   }
}
class CreatePurchase
{
   //main Method
   public static void main(String args[])
   {
       //Creating instance of Purchase
       Purchase p = new Purchase();
       //Geting user input from calling set()
       p.set();
       //Displaying the information
       p.display();
   }
}