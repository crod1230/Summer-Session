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
public class JavaD4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //**3.15
        //Generate a lottery of a 3-digit number. 
        int lottery = (int)((Math.random() * 899) + 100);
        
        //Prompt user to enter 3-digit number 
        System.out.println("Enter a 3-digit number: ");
        int number = input.nextInt();
        
        //test case for top prize
//        int number = 333;
//        int lottery = 333;
        
        //test case for second prize
//        int number = 234;
//        int lottery = 432;
        
        //find each individual digit of user input
        int a = number / 100; 
        int b = number % 100;
        int c = b / 10;
        int d = b % 10; 
        
        //find each individual digit of lottery #
        int e = lottery / 100;
        int f = lottery % 100; 
        int g = f / 10;
        int h = f % 10; 
        
        
        
        //if input matches lottery number exactly 
        if (number == lottery){
            System.out.println("You won $10,000!");
        }
        //if input matches all digits of lottery number 
        else if ((a == e || a == g || a == h) && (c == e || c == g || c == h) && 
                (d == e || d == g || d == h)){
            System.out.println("You won $3,000!");
        }
        //if input matches one digit in lottery number 
        else if (a == e || a == g || a == h || c == e || c == g || c == h || 
                d == e || d == g || d == h){
            System.out.println("You won $1,000!");
        }
        //if none of the above
        else {
            System.out.println("You did not win :/");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("");
        System.out.println("");
        
        
        //**3.4
        //Generate an integer between 1 and 12
        int month = (int)((Math.random() * 11) + 1);
        
        //Display the English month name
        switch (month) {
            case 1: System.out.println("January");
                    break;
            case 2: System.out.println("February");
                    break;
            case 3: System.out.println("March");
                    break;
            case 4: System.out.println("April");
                    break;
            case 5: System.out.println("May");
                    break;
            case 6: System.out.println("June");
                    break;
            case 7: System.out.println("July");
                    break;
            case 8: System.out.println("August");
                    break;
            case 9: System.out.println("September");
                    break;
            case 10: System.out.println("October");
                    break;
            case 11: System.out.println("November");  
                    break;
            case 12: System.out.println("December");    
                    break;
             
    }
    
}
