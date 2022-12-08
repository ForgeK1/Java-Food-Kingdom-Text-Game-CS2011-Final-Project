import java.util.Scanner;
import java.util.Random;

public class Magician
{
  public static void main(String[] args)
  {
    //Created Scanner Object
    Scanner input = new Scanner(System.in);

    //Story of the minigame
    System.out.println("As you were walking to the next aile POOF a mysterous "
                       + "women dressed up as a Magician appears before you "
                       + "from the cloud of smoke that appeared out of no "
                       + "where. \"You there! I have magic to show you with my "
                       + "deck of cards,\" she says. \n\nYou don't have the "
                       + "time for her tricks but she convinced you otherwise "
                       + "because, \"If you win my game I give you a food item "
                       + "you need to heal the King!\" Your not sure how she "
                       + "knows the King is ill but you play along. \n\n\"The "
                       + "rules are simple, I'm going to show a set of cards "
                       + "for three rounds and after you pick a card I am "
                       + "going to show you the shuffled version of the deck. "
                       + "You have to tell me the positon of the number you "
                       + "picked and if you get it right you win the round. "
                       + "You need to win two out of the three rounds, and if "
                       + "you win I give you the food item. But if you lose I "
                       + "disapear!\" A stupid game but you decide to play "
                       + "anyway because the King is ill afterall....");

    System.out.print("\nAre you ready? Input any whole number to continue: ");

    /*The variable below gives time to the player to read the prompt and
    prepare to what's about to come next.*/
    int playerContinuesLevel = input.nextInt();

    //Food and number of rounds won location
    String food = "Apple";
    int numOfRoundsWon = 0;

    //A for loop that will repeat three times because there are three rounds
    for(int i = 1; i <= 3; i++)
    {
      System.out.println("\n\"Let round " + i + " begin!\"");

      //Array storage is 10 bc we want index 0 to 9 to store 1 to 10
      int[] deck = new int[10];
      //A for loop to generate an array
      for(int k = 1; k <= deck.length; k++)
      {
        deck[k - 1] = k;
      }

      //Stores #s 1 to 10 in the string
      String deckBeforeShuffle = "";
      for(int k = 0; k < deck.length; k++)
      {
        deckBeforeShuffle += deck[k] + " ";
      }

      System.out.println("\n\"Here are the set of cards I have displayed to "
                         + "you\": ");
      System.out.println(deckBeforeShuffle);

      System.out.print("\"Which position number will you pick from one to "
                       + "ten?\": ");
      int userInputPositionPickedBeforeShuffle = deck[input.nextInt() - 1];

      System.out.print("\n*She proceeds to shuffle the cards*");

      //A for loop to shuffle the array
      for(int k = 0; k < deck.length; k++)
      {
        //Index variable gets the random # from [0,10)
        int index = (int)(Math.random() * deck.length);

        /*For each time the loop repeats, temperaryVariable stores the # the
        loop is on, then we replace that # with a randomly generated # from
        the index variable. So in summary, we swap the # the loop is on with
        a randomly generated # from the deck array*/
        int temperaryVariable = deck[k];
        deck[k] = deck[index];
        deck[index] = temperaryVariable;
      }

      //Stores the shuffled #s in the string
      String deckAfterShuffle = "";
      for(int k = 0; k < deck.length; k++)
      {
        deckAfterShuffle += deck[k] + " ";
      }

      System.out.println("\n\n\"Here are the set of cards I have displayed to "
                         + "you after shuffling\": ");
      System.out.println(deckAfterShuffle);

      System.out.print("\"Which position number is the card number you "
                       + "chose?\": ");
      int userInputPositionPickedAfterShuffle = deck[input.nextInt() - 1];

      /*An if statement that checks wether the user picked the right position
      before and after shuffling the cards*/
      if(userInputPositionPickedBeforeShuffle ==
         userInputPositionPickedAfterShuffle)
         {
           numOfRoundsWon += 1;
           System.out.println("\n\"That's right you won the round! So far " +
                              "you won " + numOfRoundsWon + " out of the 3 " +
                              "rounds.\"");
         }
         else
         {
           System.out.println("\n\"Sucker! You lost the round! That means you "
                              + "have won " + numOfRoundsWon + " out of the 3 "
                              + "rounds.\"");
         }
    }

    //An if statement to check if the user won the total minigame
    if(numOfRoundsWon >= 2)
    {
      System.out.println("\n\"Congradulations you won! Here is a " + food +
                         " you can take with you to heal the king.\" After " +
                         "storing the food in your bag you look up and " +
                         "suddenly she's gone. You continue with your quest.");
    }
    else
    {
      System.out.println("\n\"You failed to win two out of the three rounds! " +
                         "Abrakadabra!\"" + " She says before disapearing " +
                         "in a bright purple smoky cloud. You don't receive " +
                         "the item and continue with your quest.");
    }
  }
}
