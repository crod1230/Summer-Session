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
public class ArraysD2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        //7.2
        //create array to store integers (length 10)
        System.out.println("Enter 10 integers: ");
        int[] integers = new int [10];
        
        //generate integers and store them in array
        for (int i = 0; i < integers.length; i++) {
            integers[i] = input.nextInt();
        }
        //display integers in reverse order
        for (int i = integers.length - 1; i >= 0; i--) {
            System.out.println(integers[i]);
        }
        
        System.out.println("");
        
        
        
        
        //7.9
        //Test program 
        //create array to store numbers (length 10)
        double[] numbers = new double[10];
        
        //generate numbers and store them in array 
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = input.nextDouble();
        }
        //find the smallest value in array
        System.out.println("The smallest value is: " + min(numbers));
        
          
    }
    //Create a method that returns the smallest element in an array
    public static double min(double[] array) {
        double min = array[0]; //the variable min equals the min value at index 0
       
            
        }
}
