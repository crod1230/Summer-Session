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
public class JavaD5 {
    
    static final double PI = 3.14;
    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("column1colum2");
     String x = " hello world";
     x = x.trim();
     String y = x.toUpperCase();
     System.out.println(x);
        System.out.println(y);
     if(x.equals(y)) {
         System.out.println("x and y are contain the same letters");
     }
        System.out.println(x.contains("eo"));
        
        
        
     //4.18
     
     //Prompt user to enter two characters 
        System.out.println("Enter two characters: ");
        String s = input.nextLine();
       
        
        char major = s.charAt(0); //first character in String s
        char grade = s.charAt(1); //second character in String s
        String m = "";
        switch (major) {
            case 'M':  m = "mathmatics";
            break;
            case 'C':  m = "computer science";
            break;
            case 'I':  m = "information technology";
            break;
        }
        String g = "";
        switch (grade) {
            case '1':  g = "freshman";
            break;
            case '2':  g = "sophomore";
            break;
            case '3':  g = "junior";
            break;
            case '4':  g = "senior";
        }
        
        System.out.println(m + " " + g);
       
                
        
        
        
        
        
     
     
    
    }
    
}
