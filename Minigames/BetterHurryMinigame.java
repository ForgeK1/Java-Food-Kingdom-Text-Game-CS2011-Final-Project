import java.util.Scanner;

public class BetterHurryMinigame
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.println("You come upon a mysterous vault that contains a random "
                       + "item, the text below the keypad tells you that "
                       + "you have three tries under a limited time to "
                       + "input the right set of characters. "
                       + "Each round will yield a point and if you win "
                       + "two out of the three rounds you get a food item! "
                       + "If you lose then you walk away with nothing.");

    String randomizedFoodItem = "onion";

    System.out.print("\nYou ready? Input any whole number to continue: ");

    /*The variable below gives time to the player to read the prompt and
    prepare to what's about to come next.*/
    int playerContinuesLevel = input.nextInt();

    System.out.println("\nGreat let's begin!");

    //Seconds will go from 15 to 5 as it decrease by 5 each round
    int seconds = 20;

    //If player has at least two points they win the overall minigame
    int totalPoints = 0;

    //A for loop to continue each round until player finishes round 3
    for(int roundNumber = 1; roundNumber <= 3; roundNumber++)
    {
      /*Suggestion for the code below: Create a loop for the characterList
      that contains a counter and only one variable such that every time the
      loop occurs a new random character is added to the String. String length
      should be eight. Furthermore, have it in a way such that the letters in
      any position are either lower case or uppercase.*/

      //Randomizes the set of characters user has to input
      char ch1 = (char)('A' + (Math.random() * ('Z' - 'A' + 1)));
      char ch2 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
      char ch3 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
      char ch4 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
      char ch5 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
      char ch6 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
      char ch7 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
      String characterList = "" + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7;

      /*At the start of each round the total seconds is decreased by 5 to
      increase difficulty*/
      seconds -= 5;

      /*Gets the current times in seconds before user input*/
      long timeBeforeUserInput = (System.currentTimeMillis() / 1000);

      System.out.print("\nRound " + roundNumber + ": Input the following set of"
                       + " characters in the next " + seconds + " seconds: "
                       + characterList);

      System.out.print("\nYour input: ");
      String userEntry = input.next();

      /*Gets the current times in seconds after user input*/
      long timeAfterUserInput = (System.currentTimeMillis() / 1000);

      /*An if statement checks to see if the player inputed the character set
      before the time was up before checking if the character set inputed is
      correct*/
      if(timeAfterUserInput - timeBeforeUserInput <= seconds)
      {
        /*A series of nested if-else statements to check if the set of
        characters inputed were either correct or incorrect*/
        if(userEntry.equals(characterList))
        {
          System.out.println("\nYou got it, you earned a point!");
          System.out.println("Total rounds won: " + ++totalPoints);
        }
        else
        {
          System.out.println("\nWrong! You lost the round and you didn't earn "
                             + "the point!");
          System.out.println("Total rounds won: " + totalPoints);
        }
      }
      else
      {
        System.out.println("\nYou didn't meet the time required to input the "
                           + "following set of characters so you don't earn "
                           + "the point!");
        System.out.println("Total rounds won: " + totalPoints);
      }
    }

    if(totalPoints >= 2)
    {
      System.out.println("\nYou won! You open to the vault and recieve: "
                         + randomizedFoodItem);
    }
    else
    {
      System.out.println("\nYou lost! You leave the vault empty handed "
                         + "and continue with your quest.");
    }

    input.close();
  }
}
