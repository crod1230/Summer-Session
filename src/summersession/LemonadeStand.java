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
public class LemonadeStand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Would you like to purchase a drink?");
        
        String yes = "yes";
        String no = "no";
        String response = input.nextLine();
      
        
        while (true){ 
            if (response.equals(yes)) {
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
        
        System.out.println("");
        
        System.out.println("Reciept:");
        System.out.println(type + " lemonade  $" + price + "0");
        System.out.println("Change due: $" + (payment - price));
        
        System.out.println("");
        
    } 
   
    }
  
}
