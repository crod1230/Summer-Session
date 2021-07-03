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
public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter a string 
        System.out.println("Enter a string:");
        String word = input.nextLine();
        
        //Determine whether the string is a palindrome
        
        
        
        
        //5.4 Suppose the input is 2 3 4 5 0. What is the output of the 
        //following code?
        
        int number, max; //setting the number to max????
        number = input.nextInt(); //assigning user input to number
        max = number; 
        
        while (number != 0) {   //while the the user input does not = 0 
            number = input.nextInt(); //the user input will be stored to variable "number"
            if (number > max) //what is max???? anyways, if the user input aka "number" is greater than "max"
                max = number; //then the max will be replaced by that number??
        }
        
        System.out.println("max is " + max); //print the max is (insert max)
        System.out.println("number is " + number); //print the number is (insert number) 
        
    }
    
}
