/*
 * Programer: Catherine Balaban
 * Application: Final Project
 * Use: Allow user to either randomize or create their own (basic) D&D character  
 */
package pkgfinal.project.catherine.balaban;

/**
 * @author catherinebalaban
 */
import java.util.Scanner;  //needed for use input
import java.util.Random; //to generate random numbers
import java.io.*; //needed for PrintWriter and IOException

public class FinalProjectCatherineBalaban {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
       String filename; //file name 
        
       try{
       Scanner keyboard = new Scanner(System.in);  //set up scanner class
       System.out.println("Welcome to the D&D Character Creater!");
       System.out.println("If you would like to create your own character from scratch enter 1 ");
       System.out.println("If you would like to exit the program enter 2");
       int programChoice = keyboard.nextInt();
       
       while (programChoice == 1 )
       {
           if (programChoice == 1)
           {    //get the file name
               System.out.println("Before we begin please enter the name of the file you wish to store this character in:");
               filename = keyboard.next();
               filename = "/Users/catherinebalaban/Desktop/" + filename + ".txt";
               FileWriter fw = new FileWriter(filename, true);
               PrintWriter outputFile = new PrintWriter(fw); //open the file
               
               //File myFile = new File("/Users/catherinebalaban/Desktop/filename.txt");
               //Scanner inputFile = new Scanner(myFile);
               
               System.out.println("First, enter a name ");
               String name = keyboard.next();
               outputFile.println("Name: " + name ); //print their name to file
               
               System.out.println("Second, enter an eye color");
               String eyeColor = keyboard.next();
               outputFile.println("Eye Color: " + eyeColor); //print their eye color to a file
               
               System.out.println ("Third, enter a gender");
               String gender = keyboard.next();
               outputFile.println("Gender: " + gender); //print their gender to file
               
               //list and let user pick from all diferent races
               System.out.println("Fourth, pick a race. Enter the number listed next to you race of choice:");
               System.out.println("\t Human (1)");
               System.out.println("\t Half ELf (2)");
               System.out.println("\t Dwarf (3)");
               System.out.println("\t Half Orc (4)");
               System.out.println("\t Elf (5)");
               System.out.println("\t Hafling (6)");
               System.out.println("\t Gnome (7)");
               int race = keyboard.nextInt();
               
               switch (race) //print their race to the file
               {
                   case 1:
                       outputFile.println("Race : Human");
                       break;
                   case 2:
                       outputFile.println("Race : Half Elf");
                       break;
                   case 3:
                       outputFile.println("Race : Dwarf");
                       break;
                    case 4:
                       outputFile.println("Race : Half Orc");
                       break;
                    case 5:
                       outputFile.println("Race : Elf");
                       break;
                    case 6:
                       outputFile.println("Race : Hafling");
                       break;
                    case 7:
                       outputFile.println("Race : Gnome");
                       break;
               }
               
               
               //list and let user pick from all different classes
               System.out.println("Fifth, pick a class: ");
               System.out.println("\t Barbarian (1)");
               System.out.println("\t Bard (2)");
               System.out.println("\t Cleric (3)");
               System.out.println("\t Druid (4)");
               System.out.println("\t Fighter (5)");
               System.out.println("\t Monk (6)");
               System.out.println("\t Paladin (7)");
               System.out.println("\t Ranger (8)");
               System.out.println("\t Rogue (9)");
               System.out.println("\t Sourcer (10)");
               System.out.println("\t Wizard (11)");
               int classType = keyboard.nextInt();
               switch (classType)  //print their class type to the file
               {
                   case 1:
                       outputFile.println("Class : Barbarian");
                       break;
                   case 2:
                       outputFile.println("Class : Bard");
                       break;
                   case 3:
                       outputFile.println("Class : Cleric");
                       break;
                    case 4:
                       outputFile.println("Class : Druid");
                       break;
                    case 5:
                       outputFile.println("Class : Fighter");
                       break;
                    case 6:
                       outputFile.println("Class : Monk");
                       break;
                    case 7:
                       outputFile.println("Class : Paladin");
                       break;
                    case 8:
                       outputFile.println("Class : Ranger");
                       break;
                    case 9:
                       outputFile.println("Class : Rogue");
                       break;
                    case 10:
                       outputFile.println("Class : Sourcer");
                       break;
                    case 11:
                       outputFile.println("Class : Wizard");
                       break;
               }

               System.out.println("Sixth, choose your character's allignment");
               System.out.println("NOTE: Paladins are meant to be played at neutral good \n and half orcs are not supposed to have a good allignment");
               System.out.println("But who am I to stop you?");
               System.out.println(" ");
               System.out.println("\t lawful good (1)");
               System.out.println("\t lawful neutral (2)");
               System.out.println("\t lawful evil (3)");
               System.out.println("\t neutral good (4)");
               System.out.println("\t true neutral (5)");
               System.out.println("\t neutral evil (6)");
               System.out.println("\t chaotic good (7)");
               System.out.println("\t chaotic nuetral (8)");
               System.out.println("\t chaotic evil (9)");
               int allignment = keyboard.nextInt();
               switch (allignment)  //print their allignment to the file
               {
                   case 1:
                       outputFile.println("Alignment : lawful good");
                       break;
                   case 2:
                       outputFile.println("Alignment : lawful neutral");
                       break;
                   case 3:
                       outputFile.println("Alignment : lawful evil");
                       break;
                    case 4:
                       outputFile.println("Alignment : neutral good");
                       break;
                    case 5:
                       outputFile.println("Alignment : true neutral");
                       break;
                    case 6:
                       outputFile.println("Alignment : neutral evil");
                       break;
                    case 7:
                       outputFile.println("Alignment : chaotic good");
                       break;
                    case 8:
                       outputFile.println("Alignment : chaotic nuetral");
                       break;
                    case 9:
                       outputFile.println("Alignment  : chaotic evil");
                       break;
                }
                       
               System.out.println("Seventh, enter an age based on your charater's race \n but them again who am I to stop you from picking a dumb age");
               System.out.println("\t Human (18 - 80)");
               System.out.println("\t Half ELf (20 - 180)");
               System.out.println("\t Dwarf (40 - 400)");
               System.out.println("\t Half Orc (14 - 70)");
               System.out.println("\t Elf (100 - 700)");
               System.out.println("\t Hafling (20 - 250)");
               System.out.println("\t Gnome (40 - 500)");
               double age = keyboard.nextDouble();
               outputFile.println("Age: " + age); //print their age to file
               
               System.out.println("Eigth, enter a skin tone");
               String skinTone = keyboard.next();
               outputFile.println("Skin Tone: " + skinTone); //print their skin tone to file
               
               System.out.println("Finally, it is time to roll to see your stats");
               System.out.println("Numbers ranging from 1-20 will be randomly selected and then applied to \n Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charsima in that order");
               System.out.println("In the end you will have three different options to choose from so pick carefully ");
               
               int[] [] diceRoll;
               diceRoll = new int[3][6]; //set up the array
        
                Random randomNumbers = new Random();  //generate the random numbers

                for(int roll = 0; roll < diceRoll[0].length; roll++)
                {
                   diceRoll [0][roll] = randomNumbers.nextInt(20 +1); //first set

                   diceRoll [1][roll] = randomNumbers.nextInt(20 + 1); //second set

                   diceRoll [2][roll] = randomNumbers.nextInt(20 + 1 ); //third set
                }
                for(int roll = 0; roll < diceRoll[0].length; roll++) //display all of the stats and choices 
                {
                   System.out.println(diceRoll[0][roll] + "\t" + diceRoll[1][roll] + "\t" + diceRoll[2][roll]);
                }

                //let the user pick the stats for their charcater 
                System.out.println("To choose the first set of numbers enter 0 \t to choose the second set enter 1 \t to choose the third set enter 2");
                int stats = keyboard.nextInt();
                switch (stats)  //print their allignment to the file
               {
                   case 0: //print stats to file if user enters 0 
                       outputFile.println("Strength: " + diceRoll[0][0]);
                       outputFile.println("Dexterity: " + diceRoll[0][1]);
                       outputFile.println("Constitution: " + diceRoll[0][2]);
                       outputFile.println("Intelligence: " + diceRoll[0][3]);
                       outputFile.println("Wisdom: " + diceRoll[0][4]);
                       outputFile.println("Charisma: " + diceRoll[0][5]);
                       break;
                   case 1: //print stats to file is user enters 1
                       outputFile.println("Strength: " + diceRoll[1][0]);
                       outputFile.println("Dexterity: " + diceRoll[1][1]);
                       outputFile.println("Constitution: " + diceRoll[1][2]);
                       outputFile.println("Intelligence: " + diceRoll[1][3]);
                       outputFile.println("Wisdom: " + diceRoll[1][4]);
                       outputFile.println("Charisma: " + diceRoll[1][5]);
                       break;
                   case 2: //print stats to file if user enters 2
                       outputFile.println("Strength: " + diceRoll[2][0]);
                       outputFile.println("Dexterity: " + diceRoll[2][1]);
                       outputFile.println("Constitution: " + diceRoll[2][2]);
                       outputFile.println("Intelligence: " + diceRoll[2][3]);
                       outputFile.println("Wisdom: " + diceRoll[2][4]);
                       outputFile.println("Charisma: " + diceRoll[2][5]);
                       break;
                }
                
               outputFile.close(); //close the file
               
               //if the user would like to create another character
               System.out.println(" Would you like to make another character? Enter 1 for yes and 2 to exit");
               programChoice = keyboard.nextInt();
               //System.exit(0);
           }

       }
       }
       finally
       {
        //close the output files
        System.out.println ("The program is complete");
         
       }
       
        
    }
    
}
