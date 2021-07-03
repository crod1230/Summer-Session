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
public class LotteryRedo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        
        //Lottery program using strings
        
        //Generate a random 3-digit lottery number
        String lottery = "" + (int)((Math.random() * 899) + 100);
        
        char lot1 = lottery.charAt(0);
        char lot2 = lottery.charAt(1);
        char lot3 = lottery.charAt(2);
        
        
        
        //Prompt user to enter 3-digit number 
        System.out.println("Enter a 3-digit number: ");
        String enter3 = input.nextLine();
        
        char num1 = enter3.charAt(0);
        char num2 = enter3.charAt(1);
        char num3 = enter3.charAt(2); 
        
        
        
        System.out.println("The lottery number was: " + lottery);
        
        
        
      
        //if input matches lottery number exactly 
        if (lottery == enter3){
            System.out.println("You won $10,000!");
        }
        
        //if input matches all lottery digits
        else if ((lot1 == num1 || lot1 == num2 || lot1 == num3) && (lot2 == num1 || lot2 == num2 || lot2 == num3) && 
                (lot3 == num1 || lot3 == num2 || lot3 == num3)){
            System.out.println("You won $3,000!");
        }
        
        //if input matches one lottery digit
        else if (lot1 == num1 || lot1 == num2 || lot1 == num3 || lot2 == num1 || lot2 == num2 || lot2 == num3 || 
                lot3 == num1 || lot3 == num2 || lot3 == num3){
            System.out.println("You won $1,000!");
        }
        
        //if none of the above
        else {
            System.out.println("You did not win :/");
        }
        
        
        
     
      
    }
                
        
        
        
        
      
}
