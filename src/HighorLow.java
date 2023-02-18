
import java.util.Scanner; //Import of Scanner

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);    //Declaration and assignment of Scanner utility
        int computerNumber = 9; //Variable declaration and assignment
        int playerNumber = 0; //Variable declaration and assignment
        String trash = ""; //Variable declaration and assignment

        System.out.print("Guess number between 1 and 10. "); //Prompt user for input
        while (playerNumber == 0) //Keep looping for input until variable changes from 0
            if (in.hasNextInt()) //Check for valid input from user
                {
                    playerNumber = in.nextInt(); //User input
                    in.nextLine(); //Clearing buffer
                }
            else //Next step if input is invalid
                {
                    trash = in.nextLine(); //Variable used to return bad input to user
                    System.out.println(trash + " is an invalid input. Please enter a number "); //Output statement to user
                }
            if (playerNumber == computerNumber) //Boolean calculation process
                {
                    System.out.println("Congrats! You guessed the computer's number " + computerNumber); //Output statement
                }
            else if (playerNumber > computerNumber) //Boolean calculation process
                {
                    System.out.println(playerNumber + " is too high. Try again"); //Output statement
                }
            else //Final step after all checks failed
                {
                    System.out.println(playerNumber + " is too low. Try again"); //Output statement
                }
    }
}