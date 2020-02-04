/*
 * Application: Project 7
 * Programmer: Catherine Balaban
 * Program: read lines from a file, change the word house then reprint the revised version to a new file
 */
package program.pkg7.catherine.balaban;

import java.util.Scanner; //needed for Scanner Class
import java.io.* ; //needed for File and IOException
import java.io.EOFException;

public class Program7CatherineBalaban {

    public static void main(String[] args) throws IOException{
  
      boolean EOFException = false;
      
      try
      {
                //create and open a file
        FileWriter input = new FileWriter ("/Users/catherinebalaban/Desktop/GardenOut.txt", true);
        PrintWriter outputFile = new PrintWriter (input);
          
        //create object and open input file 
        File myFile = new File ("/Users/catherinebalaban/Desktop/Garden.txt");
        Scanner inputFile = new Scanner(myFile);
      
        while (inputFile.hasNextLine()) //read all of the lines until there are none
        {
            String inputLine = inputFile.nextLine(); //read next available line from input file
            inputLine = inputLine.replace("horse", "dog");  //change every instance of horse to dog 
            //System.out.println(inputLine);    Used to text

            //write to the output file

            outputFile.println(inputLine); //print the new version of Garden to the output file
        }
      
            inputFile.close(); 
            outputFile.close();
 
      }
      
      catch (FileNotFoundException e)
      {
          System.out.println ("The following error has occured" + e.getMessage());
      }
      
      catch (EOFException e)
      {
          System.out.println("The following error has occured" + e.getMessage());
      }   
      finally
      {
        //close the output files
        System.out.println ("The program is complete");
         
      }

    }
    
}
