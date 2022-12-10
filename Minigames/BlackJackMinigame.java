import java.util.Scanner;

public class BlackJackMinigame
{
  public static void main(String[] args)
  {
    //Created Scanner Object
    Scanner input = new Scanner(System.in);

    //Story of the minigame
    System.out.println("As your walking through the aisle you see an individual "
                       + "who is sitting down in front of a table with a food "
                       + "item that you need to make a dish to heal the King. "
                       + "Funnily enough they said that if you beat them in "
                       + "a game of Blackjack then you get the food item, if "
                       + "not then you walk away with nothing.");

    /*Clean this section up with more simpler rules and proper grammer*/
    System.out.println("\nThe rules are simple, your goal is to get as close "
                       + "as to 21 as possible before you end your turn. Once "
                       + "ended, the dealer starts their turn at drawing cards "
                       + "until they get close to 21. If you or the "
                       + "dealer passes 21, then the other wins the round. "
                       + "If you or the dealer gets 21 exactly, then they "
                       + "automatically win the round. There are five rounds,"
                       + "and whoever wins three out of the five rounds wins "
                       + "the game. Lastly, if you and the other person ties "
                       + "with each other on round 5, then the maximum round "
                       + "is increased and everyone continues to play until "
                       + "someone wins!");

    System.out.print("\nAre you ready? Input any whole number to continue: ");

    /*The variable below gives time to the player to read the prompt and
    prepare to what's about to come next.*/
    int playerContinuesLevel = input.nextInt();

    //Rounds Score Count
    int userRoundsWon = 0;
    int programRoundsWon = 0;
    int maximumRounds = 5;

    //Food item
    String foodItem = "Bananna";

    /*A for loop that makes the player and the program verse each other for the
    next five rounds*/
    for(int k = 1; k <= 5; k++)
    {
/*-----------------------------User's Field-----------------------------------*/

      //Prompts the user what round it is
      System.out.println("\nRound " + k + " begins");

      //Variables for when it is the player's turn
      char seeAgain;
      int userIndividualNumber;
      int userSumTotal = 0;
      String userSumTotalInString = "";

      //Player's turn to play
      do
      {
        userIndividualNumber = (int)(Math.random() * 11 + 1);
        userSumTotal += userIndividualNumber;
        userSumTotalInString += " " + userIndividualNumber;

        //Stops the current while loop if user's sumTotal = 21
        if(userSumTotal == 21)
        {
          /*This line of code is here because it shows proof that this if
          statement is true on the console*/
          System.out.println("\nYou currently have" + userSumTotalInString
                             + ".");

          System.out.println("\nYou got 21! That means that the other person "
                             + "lost the round automatically.");
          userRoundsWon++;

          System.out.println("\nTotal rounds you won: " + userRoundsWon + "\n\n"
                              + "Total rounds they won: " + programRoundsWon);

          break;
        }

        //Stops the current while loop if user went above 21
        if(userSumTotal > 21)
        {
          /*This line of code is here because it shows proof that this if
          statement is true on the console*/
          System.out.println("\nYou currently have" + userSumTotalInString
                             + ".");

          System.out.println("\nYou went over 21 which means you lost the " +
                             "round!");
          programRoundsWon++;

          System.out.println("\nTotal rounds you won: " + userRoundsWon + "\n\n"
                              + "Total rounds they won: " + programRoundsWon);

          break;
        }

        System.out.println("\nYou currently have" + userSumTotalInString
                           + ". Would you want to add one more? Enter 'n' or "
                           + "'N' to not recieve anymore cards.");
        seeAgain = input.next().charAt(0);
      } while(seeAgain != 'N' && seeAgain != 'n');

      //Repeats the main for loop if user went over or equaled 21
      if(userSumTotal == 21 || userSumTotal > 21)
      {
        continue;
      }

/*-----------------------------Program's Field--------------------------------*/

      //Variables for when it is the program's turn
      int programIndividualNumber;
      int programSumTotal = 0;
      String programSumTotalInString = "";

      //Program's turn to play
      while (programSumTotal <= 16)
      {
        programIndividualNumber = (int)(Math.random() * 11 + 1);
        programSumTotal += programIndividualNumber;
        programSumTotalInString += " " + programIndividualNumber;

        //Stops the current while loop if program's sumTotal = 21
        if(programSumTotal == 21)
        {
          /*This line of code is here because it shows proof that this if
          statement is true on the console*/
          System.out.println("\nThe other person has"
                             + programSumTotalInString);

          System.out.println("\nThe other person got 21! That means that you "
                             + "lost the round automatically.");
          programRoundsWon++;

          System.out.println("\nTotal rounds you won: " + userRoundsWon + "\n\n"
                              + "Total rounds they won: " + programRoundsWon);

          break;
        }

        //Stops the current while loop if program went above 21
        if(programSumTotal > 21)
        {
          /*This line of code is here because it shows proof that this if
          statement is true on the console*/
          System.out.println("\nThe other person has"
                             + programSumTotalInString);

          System.out.println("\nThe other person went over 21 which means you "
                             + "won the round!");
          userRoundsWon++;

          System.out.println("\nTotal rounds you won: " + userRoundsWon + "\n\n"
                              + "Total rounds they won: " + programRoundsWon);

          break;
        }

        System.out.println("\nThe other person has" + programSumTotalInString);
      }

      //Repeats the main for loop if program went over 21
      if(programSumTotal == 21 || programSumTotal > 21)
      {
        continue;
      }

/*-----------------Player's sumTotal vs Program's sumTotal--------------------*/

      //Checks if the player has a higher num versus the program
      if(userSumTotal > programSumTotal)
      {
        System.out.println("\nSince you have a sum total of " + userSumTotal +
                           " and the other person has a sum total of " +
                           programSumTotal + ", then you win the round!");
        userRoundsWon++;

        System.out.println("\nTotal rounds you won: " + userRoundsWon + "\n\n"
                          + "Total rounds they won: " + programRoundsWon);
      }

      //Checks if the program has a higher num versus the player
      if(programSumTotal > userSumTotal)
      {
        System.out.println("\nSince you have a sum total of " + userSumTotal +
                           " and the other person has a sum total of " +
                           programSumTotal + ", then they win the round!");
        programRoundsWon++;

        System.out.println("\nTotal rounds you won: " + userRoundsWon + "\n\n"
                          + "Total rounds they won: " + programRoundsWon);
      }

      //Checks if the player has tied with the program in regards to num
      if(userSumTotal == programSumTotal)
      {
        System.out.println("\nSince you have a sum total of " + userSumTotal +
                           " and the other person has a sum total of " +
                           programSumTotal + ", then its a draw and both win " +
                           "the round!");

        userRoundsWon++;
        programRoundsWon++;

        System.out.println("\nTotal rounds you won: " + userRoundsWon + "\n\n"
                          + "Total rounds they won: " + programRoundsWon);
      }

/*-----------------------Checks Who Won The Minigame--------------------------*/

      //Checks if the user tied with the program on round 5
      if(userRoundsWon == 3 && programRoundsWon == 3)
      {
        System.out.println("Since you tied with the other person on round " +
                           k + ", then we increase the max round to play one " +
                           "more time!");

        //Increases maximum rounds by 1
        maximumRounds++;
      }
      else
      {
        //Checks if the player won the game
        if(userRoundsWon >= 3)
        {
          System.out.println("\nCongradulations, you won the game! The food "
                             + " item you recieve is " + foodItem);

          System.out.println("\nTotal rounds you won: " + userRoundsWon + "\n\n"
                              + "Total rounds they won: " + programRoundsWon);

          //Stops the whole for loop since player won the minigame
          break;
        }

        //Checks if the program won the game
        if(programRoundsWon >= 3)
        {
          System.out.println("\nUnfortunately, you lost the game! And you do "
                             + "not recieve the food item. So, you continue "
                             + "with your quest.");

          //Stops the whole for loop since program won the minigame
          break;
        }
      }
    }
  }
}
