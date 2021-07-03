/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javad2;

/**
 *
 * @author Nina
 */
public class Arrays {

    public static void main(String[] args) {

        //create array to keep track of counts 
        int[] counts = new int[10];

        //create an array of 100 integers 
        int[] random = new int[100];

        for (int i = 0; i < random.length; i++) {
            //store the counts for 
            random[i] = (int) (Math.random() * 9);
        }
        
        for (int i = 0; i < random.length; i++) {
            counts[random[i]] = counts[random[i]] + 1;
        }
        
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " appears " + counts[i] + " times.");
        }
        //after counts are determined
        

    }

}
