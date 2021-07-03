/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javad2;

import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class JavaD3Practice {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         //2.13
         System.out.println("Enter a monthly saving amount: ");
         double amount = input.nextDouble();
         
         double a = amount * (1 + 0.00417);
         double b = (amount + a) * (1 + 0.00417);
         double c = (amount + b) * (1 + 0.00417);
         double d = (amount + c) * (1 + 0.00417);
         double e = (amount + d) * (1 + 0.00417);
         double f = (amount + e) * (1 + 0.00417);     
         
         System.out.println("The account value after the sixth month is: " + f);
         
         System.out.println();
         
         Math.sqrt(double a);
         
         
         
         
         //2.21
         System.out.println("Enter investment amount: ");
         double investment = input.nextDouble();
         
         System.out.println("Enter annual interest rate in percentage: ");
         double interest = input.nextDouble();
         
         System.out.println("Enter number of years: ");
         double years = input.nextDouble();
         
         
         double value = investment * Math.pow((1 + interest) , (years * 12));
         System.out.println("The future investment value is: " + value);
         
         
                 
                 
         
    }
    
}
