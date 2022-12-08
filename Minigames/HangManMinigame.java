import java.util.Scanner;
import java.util.Arrays;

public class HangManMinigame
{
  public static void main(String[] args)
  {
    //Created Scanner Object
    Scanner input = new Scanner(System.in);

    //Story of the minigame
    System.out.println("As you are walking through the shop you see a "
                       + "contraption that has a wooden keyboard and a station "
                       + "that draws images instantanously which you have "
                       + "never seen before. The instructions on the side of "
                       + "the machine tells you that its an interactive game "
                       + "made by the same people who run toy stores. \n\nThe "
                       + "instructions further tell you that if you win their "
                       + "game called \"Hangman,\" then you can earn enough "
                       + "money to go buy whatever you'd like. This is the "
                       + "perfect opportunity to win this game so that you "
                       + "can use this money to buy a food item to make a "
                       + "dish that will heal the King!");

    System.out.println("\nAs you start the game the machine prints out "
                       + "that there are five rounds to guess the right word."
                       + "And each time you guess the wrong letter or word "
                       + "for each round then the more parts of the hangman "
                       + "will show up.");

    System.out.print("\nAre you ready? Input any whole number to continue: ");

    //The food item the user recieves
    String foodItem = "Orange";


    /*The variable below gives time to the player to read the prompt and
    prepare to what's about to come next.*/
    int playerContinuesLevel = input.nextInt();

    //List of foods the user will be guessing
    String guessingWordsList[] = {"Food", "Strawberry", "Lemonade",
                                "Cheeseburger", "Nutella"};

    //A random food would be selected
    int k = (int)(Math.random() * 5);

    //If the player gets the letter or word wrong we start from the body first
    int b = 0;

    //List of hangman parts that will be printed
    String hangmanParts[] = {"Head", "Body", "L-Arm", "R-Arm", "L-Leg",
                             "R-Leg"};

    System.out.println("\nThe machine prints out, LET THE GAME BEGIN!");

    //The word that the user is trying to find
    String foodItemMysteryWord = "";

    /*A loop to fills empty spots and spaces into a String for the user to
    guess letters*/
    for(int i = 0; i < guessingWordsList[k].length(); i++)
    {
      if(Character.isLetter(guessingWordsList[k].charAt(i)))
      {
        foodItemMysteryWord += "*";
      }
      else
      {
        foodItemMysteryWord += guessingWordsList[k].charAt(i);
      }
    }

    //Displays how many letters and how long the word you trying to guess is
    System.out.println("\nThe word you are trying to guess for has "
                       + guessingWordsList[k].length() + " letters: "
                       + foodItemMysteryWord);

    //What word the program wants you to find out
    System.out.println(guessingWordsList[k]);

    /*An inifinite loop that will keep going until the user correctly guesses
    the right letters or word to replace all of the "*" in the mystery word*/
    while(!foodItemMysteryWord.equals(guessingWordsList[k]))
    {
      //Temperary word
      String tempWord = "";

      //Prompts the user to enter a word or letter
      System.out.print("\nInput a letter you think the word contains or "
                         + "input the word instead: ");
      String userGuess = input.next();

      if(userGuess.equals(guessingWordsList[k]))
      {
        System.out.println("The machine prints out, \"YOU GOT IT RIGHT! YOU "
                           + "WIN!. HERE'S YOUR RIZZ.\" You earn enough money "
                           + "to go and buy an ingredient. So you buy "
                           + foodItem + " and continue with your quest.");
        break;
      }
      else if(guessingWordsList[k].contains(userGuess)
              && userGuess.trim().length() == 1)
      {
        for(int i = 0; i < guessingWordsList[k].length(); i++)
        {
          if(guessingWordsList[k].charAt(i) == userGuess.charAt(0))
          {
            tempWord += userGuess.charAt(0) + "";
          }
          else
          {
            tempWord += foodItemMysteryWord.charAt(i);
          }
        }
        /*We added this after the for loop because we did want the last else
        statement to occur. Since we don't want ItemMysteryWord = tempWord
        unless tempWord is populated and not empty*/
        foodItemMysteryWord = tempWord;
      }
      else
      {
        System.out.println("\nYour input is wrong because you did not input "
                           + "the right letter or word. We draw now "
                           + hangmanParts[b]);

        //Andres draws Ascii here***********************************

        if(b == 5)
        {
          System.out.println("\n\"YOU FAILED TO SAVE THE HANGING MAN. YOU "
                             + "DO NOT RECIEVE ANY PRIZE!\" Because you do not "
                             + "recieve anything you move on with your quest.");

          System.exit(0); //Andres you change this
        }

        b++;
      }

      foodItemMysteryWord = tempWord;

      System.out.println("\nCurrent Word: " + foodItemMysteryWord);
    }

    System.out.println("\nThe machine prints out, \"YOU GOT IT RIGHT! YOU "
                       + "WIN!. HERE'S YOUR RIZZ.\" You earn enough money "
                       + "to go and buy an ingredient. So you buy "
                       + foodItem + " and continue with your quest.");

    input.close();
  }
}
