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
public class ComputeArea {
    
    public final static double PI = 3.14;
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Enter a number for radius: ");
        double radius=input.nextDouble();
        double area=radius*radius*PI;
        
        
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
        
        //2^3 
        double pow = Math.pow(2, 3);
        
        int i = 2;
        int x = i++ + 2; 
        System.out.println("x post increment: " + x);
        System.out.println("i = " + i);
        
        int j = 2; 
        int y = ++j + 2; 
        System.out.println("y pre increment: " + y);
        System.out.println("j = " + j);
            
        //System.out.println("Area of circle with given radius: " + area);
        
       
        
        
        // Step 1: Read in radius
        // Step 2: Compute area
        // Step 3: Display the area
        
    }
    
    public void method2() {
        int number1 = 2;
        System.out.println(number1);
    }

    
}
