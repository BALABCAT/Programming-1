
    

/**
 * Application: Program 1
 * Programmer: Catherine Balaban
 * Program Description: This program will display classes I am taking and calculate 
 *                      how many credits it is worth
 * 

 */
package project.pkg1;
import java.util.*;


public class Project1 {
    
    public static void main (String[] args){
        int courseNumber; //variable for the number of courses the student is taking
        int totalCredits; //varible for the final calculation of credits
        
        // beneath are all of the classes I am taking each statement will be
        //printed and most of them with a tab in front of the line
        
        System.out.println ("Catherine Balaban - Fall Semester 2018");
        System.out.println("\t SAR 115 01 - Drawing");
        System.out.println("\t SCS 123 01 - Intro to Programming");
        System.out.println("\t SEL 107 01 - Composition and Culture");
        System.out.println("\t STR 110 01 - Intro to Theatre");
        System.out.println("\t STR 115 01 - Scenic Technology");
        
        Scanner keyboard = new Scanner (System.in); //add in scanner class
        
        System.out.println ("How many courses are you taking this semester?");
        courseNumber = keyboard.nextInt(); //get and store the amount of courses
        
        totalCredits = courseNumber * 3; //multiply the amount of courses taken by three to get the total number of credits
        
        System.out.println ("You will earn " + totalCredits + " this semester!"); //print out the final number
        
        
    }
}
