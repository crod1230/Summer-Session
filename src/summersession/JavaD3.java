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
public class JavaD3 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         
         System.out.println("Enter a number between 0 and 1000: ");
         int number = input.nextInt();
         
         int y = 10;
         int z = number % y;
         int a = number / y;
         int b = a % y;
         int d = a / y;
         int e = z + b + d;
         
         System.out.println("the sum of the digits is: " + e);
         

         
    }
    
}
