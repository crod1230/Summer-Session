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
public class RPS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            int u = 0;
            int p = 0;
            
        while ((u < 2) && (p < 2)) {
            System.out.println("Enter rock, paper, or scissors");
            String user = input.nextLine();

            int x = (int) (Math.random() * 2) + 1;

            String c = "";
            switch (x) {
                case 1:
                    c = "rock";
                    break;
                case 2:
                    c = "paper";
                    break;
                case 3:
                    c = "scissors";
                    break;
            }
            System.out.println("User throws: " + user + " | Computer throws: " + c);
            if ((user.equalsIgnoreCase("scissors") && c.equalsIgnoreCase("paper")) || (user.equalsIgnoreCase("rock") && c.equalsIgnoreCase("scissors"))
                    || (user.equalsIgnoreCase("paper") && c.equalsIgnoreCase("rock"))) {
                //user gets 1 point
                u++;
                System.out.println("User wins this round!");
            } else {
                //comp gets 1 point
                p++;
                System.out.println("Computer wins this round!");
            }
            System.out.println("Score Update || User: " + u + " | Computer: " + p  );
           
        }
        if (u == 2) {
            System.out.println("User wins");
        }
        else if (p ==2) {
            System.out.println("Computer wins");
        }
        
        if (u > p) {
            System.out.print("User is the final winner!");
        } else {
            System.out.print("Computer is the final winner!");
        }
        
        System.out.println(" Final Score, User: " + u + " | Computer: " + p);
}
}
