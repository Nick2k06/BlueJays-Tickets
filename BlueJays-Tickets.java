/* 
Nickolas Gabrialovitch
ICS3U1
Thursday October 13, 2022
Unit 2 Computer Science assignment
*/

//Importing the scanner
import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        
        //Using a While method to create a loop for the program.
        int restart = 1;
        while (restart == 1)
        {
            //Using the println() method to ask the user questions on how many tickets they want.
            System.out.println("Welcome to the 2022 Blue Jays Postseason!");
            
            System.out.print("How many In the Action tickets would you like? ");
            int q1 = s.nextInt();
            
            System.out.print("How many Premium Dugout tickets would you like? ");
            int q2 = s.nextInt();
            
            System.out.print("How many Premium Infield tickets would you like? ");
            int q3 = s.nextInt();
            
            System.out.print("How many Field Level Infield  tickets would you like? ");
            int q4 = s.nextInt();
            
            System.out.print("How many Field Level Bases tickets would you like? ");
            int q5 = s.nextInt();
        
            System.out.print("How many 100 Level Outfield tickets would you like? ");
            int q6 = s.nextInt();
            
            int sum = q1 + q2 + q3 + q4 +q5 +q6;
            
            //Creating the variables and assigning their prices.
            double t1 = 360.00;
            double t2 = 106.50;
            double t3 = 97.00;
            double t4 = 94.50;
            double t5 = 91.00;
            double t6 = 50.00;
            double sub;
            
            //Doing the math to find the subtotal.
            sub = (q1*t1) + (q2*t2) + (q3*t3) + (q4*t4) + (q5*t5) + (q6*t6);
            
            //Using println() methods to get the output.
            System.out.println("You have orded " + sum + " tickets");
            System.out.println("Your subtotal is $" + sub);
            System.out.println("Your total after 13% tax is $" + (sub + (sub*0.13)));
            System.out.println("Thank you for purchasing Toronto Blue Jays playoff tickets!");
            System.out.println("Would you like to refresh the page and restart? Yes = 1, No = 2");
            restart = s.nextInt();
            
            //Using a If command to wether determine the output of the user is Yes or No.
            if (restart == 2){
                
                //Using the println() method to output a statement if they user says No.
                System.out.println("Enjoy your game!");
                
                //Using 'Break' to end the code after the println() method is used.
                break;
            
            }
        } 
    }        
    
}