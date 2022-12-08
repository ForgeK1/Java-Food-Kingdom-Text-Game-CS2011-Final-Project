import java.util.Scanner;

public class HomelessMiniGame
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Suddenly a homeless man jumps in front of you! He says "
                       + "\"Let's do rock paper scirrors right now or else "
                       + "I will take all of your groceries! If I win then "
                       + "I will take one item from your cart, if you win "
                       + "then you'll be left alone.\"" + " You have no "
                       + "other choice but to play so choose your action "
                       + "carefully.");

    String food = "Orange";
    // boolean[] items = new boolean[3];
    //
    // final int Cucumber = 1;
    // final int Apple = 1;
    // final int Bannana = 1;
    //
    // items = Cucumber, Apple, Bannana;

    boolean homelessManTiesWithUser = true;
    do
    {
      System.out.print("\nscissor (0), rock (1), paper (2): ");
      int userInput = input.nextInt();
      String userInputString = "";

      //A switch statement to assign a String to what the player chooses
      switch(userInput)
      {
        case 0: userInputString = "scissor"; break;
        case 1: userInputString = "rock"; break;
        case 2: userInputString = "paper"; break;
        default: userInputString = "something went wrong, "
                                    + "check switch(userInput)"; break;
      }

      int inputHomelessMan = (int)(Math.random() * 3);
      String inputHomelessManInString = "";

      switch(inputHomelessMan)
      {
        case 0: inputHomelessManInString = "scissor"; break;
        case 1: inputHomelessManInString = "rock"; break;
        case 2: inputHomelessManInString = "paper"; break;
        default: inputHomelessManInString = "something went wrong, "
                                            + "check switch(inputFromAi)"; break;
      }

      //Checks when the player wins against the homeless man
      if(userInput == 0 && inputHomelessMan == 2
         || userInput == 1 && inputHomelessMan == 0
         || userInput == 2 && inputHomelessMan == 1)
         {
           System.out.println("The homeless man chose " + inputHomelessManInString
                              + " and you chose " + userInputString + ", so you "
                              + "win! The homeless man got angry and lashed "
                              + "out on an" + food + " which you "
                              + "picked up afterwards.");
                              //The food here should be random

           homelessManTiesWithUser = false;
         }

      //Checks when the player loses against the homeless man
      else if (userInput == 2 && inputHomelessMan == 0
               || userInput == 0 && inputHomelessMan == 1
               || userInput == 1 && inputHomelessMan == 2)
         {
           System.out.println("The homeless man chose " + inputHomelessManInString
                              + " and you chose " + userInputString + ", so you "
                              + "lose and the homeless man took your "
                              + food + "!");

           homelessManTiesWithUser = false;
         }

      //When the player ties with homeless man
      else if(userInput == inputHomelessMan)
      {
        System.out.println("The homeless man chose " + inputHomelessManInString
                           + " and you chose " + userInputString + ", so you "
                           + "tie! Try again!");
      }

      else
      {
        System.out.println("You inputed the wrong number, please put in the "
                           + "right number.");
      }
    }while (homelessManTiesWithUser);

    input.close();
  }
}
