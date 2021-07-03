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
public class Lemonade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        String yes = "yes";
        String no = "no";
        String response = "";
        double change = 0;
        
        do {
            //Ask user what type of lemonade they want (sweet, sour, plain)
            System.out.println("What type of lemonade would you like?");
            System.out.println("Options: Sweet, Sour, or Plain");
            String type = input.nextLine(); //store input in string variable
        
            double price = 0; //initialize price variable
        
            //determine price of drink based on user input 
            switch (type) {
                case "Sweet": price = 1.00;
                break;
                case "Sour": price = 1.50;
                break;
                case "Plain": price = 0.50;
                break;
            }
            
        System.out.println("");
        
            System.out.println("That will cost $" + price + "0");
            System.out.println("Please enter your payment amount:");
            double payment = input.nextDouble();
        
            change = payment - price;
            
        System.out.println("");
        
            System.out.println("Reciept:");
            System.out.println(type + " lemonade  $" + price + "0");
            System.out.println("Change due: $" + change);
            
            System.out.println("Would you like to purchase another drink?");
            response = input.next();
          
        
        } while (response.equals(yes)); 
        
        
        /* I can't declare "response" as a variable outside of the block because 
        it's supposed to be given a value AFTER all of the code determining the type 
        of drink and price has been executed. 
        So I got stuck here
        
        But what I wanted to do is 
        while "response" (user input) equals "yes" then the loop will 
        continue until the user's response is "no" 
        */
        
        //What I would've done for the bonus
        
        //quarter change 
        double q = (int)(change * 100) / 25; 
        double qleft = (int)(change * 100) % 25;
        //dime change 
        double d = qleft / 10; 
        double dleft = qleft % 10; 
        //nickel change 
        double n = dleft / 5;
        double nleft = dleft % 5;
        //penny change
        double p = nleft / 1;
        
        
        if (qleft == 0) {
            System.out.println("Change: " + q + " quarters");
            
        }
        else if (dleft == 0) {
            System.out.println("Change: " + q + " quarters and " + d + " dimes");
            
        }
        else if (nleft == 0) {
            System.out.println("Change: " + q + " quarters and " + d + " dimes" + n + " nickels");
            
        }
        else {
            System.out.println("Change: " + q + " quarters and " + d + " dimes" + n + " nickels" + p + " pennies");
        }
        
        
        /* 
        I know there's alot of errors but I couldn't figure out the main one which led to more
        */
        
      
       
            
        
    }
}
           
