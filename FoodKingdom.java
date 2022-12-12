import java.util.Scanner;
import java.util.Arrays;

public class VideoGameBones {
  public static void main(String[] args) {

    if (args.length > 0 && args[0].equals("-help")){
      System.out.println("Welcome to Food Kingdom. In this game you must travel"
      + " to the ancient grocery tomb/ruins in order to slay the perfect "
      + "ingredients in order to heal the sick king. But these foods have "
      + "tricks up their sleeves, so be careful!\n");

      System.out.println("You must wander around the map, and face several "
      + "trials. Upon winning each trial, you will win the promised ingredient"
      + "but simply having ingredients is not enough. They have to make the "
      + "perfect combination in order to make an adequate dish. So leave once "
      + "you judge that you have enough ingredients\n");

      System.out.println("HINT: YOU ONLY EVER NEED 1 OF EACH INGREDIENT "
      + "(REPEATS DONT COUNT)\n");

      System.out.println("WARNING: IF YOU FAIL 3 OF THE TRIALS. YOU'RE WILL IS "
      + "BROKEN, AND ITS GAME OVER");
    } else {





    Scanner input = new Scanner(System.in);
    boolean[] space = new boolean[29];

    space[0] = true;
    for(int i = 1; i <= 28; i++) {
      space[i] = false;
    }

    String[] basket = new String[9];
    for(int i = 0; i < 9; i++){
      basket[i] = "";
    }

    int[] numLosses = {0};

    char move = ' ';
    do {
    System.out.println("\n\n\n\n\n\n\n\n\n\n To move around use"
    + ":\n   w\n a s d \n\n To leave use q\n"
    + "╔=======╗\n"
    + "|\033[0;103m" + occupied(space[0]) +  "\033[0m" + occupied(space[1])
    + occupied(space[2])
    + occupied(space[3]) + occupied(space[4]) + occupied(space[5])
    + occupied(space[6]) +"|\n" + "|" + occupied(space[7]) + "█"
    + occupied(space[8]) + "█" + occupied(space[9]) + "█" + occupied(space[10])
    + "|\n" + "|" + occupied(space[11]) + occupied(space[12])
    + occupied(space[13]) + occupied(space[14])+ occupied(space[15])
    + occupied(space[16]) + occupied(space[17])+ "|\n" + "|"
    + occupied(space[18]) + "█" + occupied(space[19]) + "█"
    + occupied(space[20]) + "█" + occupied(space[21]) + "|\n"+ "|"
    + occupied(space[22]) + occupied(space[23]) + occupied(space[24])
    + occupied(space[25]) + occupied(space[26]) + occupied(space[27])
    + occupied(space[28]) +"|\n"
    + "╚=======|" + "\n\n\n"
    + "Number of Losses: " + numLosses[0]
    + "\n\nFood Collected:\n-------------------------\n1: " + basket[0]
    + "\n2: " + basket[1]
    + "\n3: " + basket[2]
    + "\n4: " + basket[3]
    + "\n5: " + basket[4]
    + "\n6: " + basket[5]
    + "\n7: " + basket[6]
    + "\n8: " + basket[7]);


    move = input.next().charAt(0);

    int index = 0;
    while (space[index] == false) {
      index++;
    }

    movementAt(move, space, index, basket);






    if(((int) (Math.random() * 2)) == 0) {
      int minigame = (int) (Math.random() * 8);
      switch(minigame) {
        case 0: battleSystem(basket, numLosses);
                break;
        case 1: hangMan(basket, numLosses);
                break;
        case 2: magician(basket, numLosses);
                break;
        case 3: ingredientInteraction(basket, numLosses);
                break;

        default: System.out.println("This should not happen");
      }
    }

    } while (numLosses[0] < 3);
      System.out.println("\n\n\n\n\n\n\n\n\n You have lost 3 times. GAME OVER");

      input.close();
    }
  }





/*
Minimap methods
--------------------------------------------------------------------------
*/
  public static String occupied(boolean space){
    if(space) {
      return "\033[1;31m♥\033[0m";
    } else {
      return " ";
    }
  }


  public static void movementAt(char move, boolean[] space, int index, String[] basket) {
    switch(move) {
      case 'w': switch(index) {
                  case 7:
                  case 8:
                  case 9:
                  case 10: space[index] = false;
                           space[(index * 2) - 14] = true;
                           break;
                  case 11:
                  case 13:
                  case 15:
                  case 17: space[index] = false;
                           space[(index + 3) / 2] = true;
                           break;
                  case 18:
                  case 19:
                  case 20:
                  case 21: space[index] = false;
                           space[(index * 2) - 25] = true;
                           break;
                  case 22:
                  case 24:
                  case 26:
                  case 28: space[index] = false;
                           space[(index + 14) / 2] = true;
                           break;
                  default: System.out.println("You cannot move that way.");
                }
                break;
      case 'a': switch(index) {
                  case 0:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                  case 11:
                  case 18:
                  case 19:
                  case 20:
                  case 21:
                  case 22: System.out.println("You cannot move that way.");
                           break;
                  default: space[index] = false;
                           space[--index] = true;
                }
                break;
      case 's': switch(index) {
                  case 0:
                  case 2:
                  case 4:
                  case 6: space[index] = false;
                          space[(index + 14) / 2] = true;
                          break;
                  case 7:
                  case 8:
                  case 9:
                  case 10: space[index] = false;
                           space[(index * 2) - 3] = true;
                           break;
                  case 11:
                  case 13:
                  case 15:
                  case 17: space[index] = false;
                           space[(index + 25) / 2] = true;
                           break;
                  case 18:
                  case 19:
                  case 20:
                  case 21: space[index] = false;
                           space[(index * 2) - 14] = true;
                           break;
                  default : System.out.println("You cannot move that way.");
                }
                break;
      case 'd': switch(index) {
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  case 10:
                  case 17:
                  case 18:
                  case 19:
                  case 20:
                  case 21:
                  case 28: System.out.println("You cannot move that way.");
                           break;
                  default: space[index] = false;
                           space[++index] = true;
                }
                break;
      case 'q': if(space[0] = true) {
                  System.out.println("You have chosen to leave the dungeon");
                  System.out.println("Time to cook!");

                  if(contains(basket, "love")) {
                    System.out.println("You made your dish with love and it aut"
                    + "omatically healed the king");
                  } else if(contains(basket, "meat")
                    && contains(basket, "potatoes")
                    && contains(basket, "lettuce")
                    && contains(basket, "flour")
                    && contains(basket, "cheese")
                    && contains(basket, "tomato")
                    && contains(basket, "onions")){
                    System.out.println("You made a burger with fries. The kin"
                    + "g loved it!!");
                  } else if(contains(basket,"flour") && contains(basket,"rice")
                    && contains(basket,"meat") && contains(basket,"tomato")
                    && contains(basket,"onion")) {
                    System.out.println("You made a burrito. The king is healed!");
                  } else if(contains(basket,"flour")
                    && contains(basket,"cheese")
                    && contains(basket,"tomato")
                    && contains(basket,"meat")) {
                    System.out.println("You made a pizza. The king is healed!");
                  } else if(contains(basket, "meat")
                    && contains(basket,"tomato") && contains(basket,"cheese")
                    && contains(basket,"potatoes")) {
                    System.out.println("You made chili cheese fries!. "
                    + "The kings is healed");
                  } else if(contains(basket,"eggs")
                  && contains(basket,"cheese") && contains(basket,"onion")
                  && contains(basket,"tomato")) {
                    System.out.println("You made an omelet! The king is healed!!");
                  } else if(contains(basket,"flour") && contains(basket,"eggs")
                    && contains(basket,"syrup")) {
                    System.out.println("You made a pancake. The king lives");
                  } else if (contains(basket,"cheese")
                    && contains(basket,"potato")) {
                    System.out.println("You made nacho fries. The king lives");
                  } else if (contains(basket,"flour")
                    && contains(basket, "cheese")) {
                    System.out.println("You made a quesadilla. The kig lives");
                  } else {
                    System.out.println("You used what you could to make a dish."
                    + "The king died upon eating your dish.");
                  } System.exit(0);

                } else {
                  System.out.println("You must stand at the exit in order to leave");
                }
                break;
      default: System.out.println("Not a valid input, try again");
    }
  }


  public static boolean contains (String[] basket, String food){
    for(int i = 0; i < basket.length; i++){
      if(basket[i].equals(food)){
        return true;
      }
    } return false;
  }


  public static void battleSystem (String[] basket, int[] numLosses){
    Scanner input = new Scanner(System.in);
    System.out.println("You found a meat that wants to beat you up. "
                        + "Battle starting.");

    int yourMaxHP = 100;
    int yourCurrentHP = yourMaxHP;
    int yourATK = 20;
    int yourDamageRecieved;
    int yourDEF = 5;

    double enemyStatChanger =  Math.random() + 1 ;
    int enemyMaxHP = (int)(50 * enemyStatChanger);
    int enemyCurrentHP = enemyMaxHP;
    int enemyATK = (int)(10 * enemyStatChanger);
    int enemyDamageRecieved;
    int enemyDEF = (int)(2 * enemyStatChanger);

    boolean battleStatus = true;

    while(yourCurrentHP > 0 && enemyCurrentHP > 0 && battleStatus) {
      System.out.println("Your HP: " + yourCurrentHP + "/" + yourMaxHP);
      System.out.println("Enemy HP: " + enemyCurrentHP + "/" + enemyMaxHP);
      System.out.println("Options: Attack (a), Run (b)");
      char selection = input.next().charAt(0);


      if(selection == 'a') {
        enemyDamageRecieved = yourATK - enemyDEF;
        if(enemyDamageRecieved < 0) {
          enemyDamageRecieved = 1;
          System.out.println("Get fucked, enemy's defense is too high.");
        }
        enemyCurrentHP -= enemyDamageRecieved;
        System.out.println("You attacked! You dealt " + (enemyDamageRecieved)
                            + " damage!");

        yourDamageRecieved = enemyATK - yourDEF;

        if(yourDamageRecieved < 0) {
          yourDamageRecieved = 1;
          System.out.println("Fuckin sigma.");
        }
        yourCurrentHP -= enemyATK - yourDEF;
        System.out.println("They enemy attacked! You took "
                          + yourDamageRecieved + " damage!");
        System.out.println("");

      }

      else if(selection == 'b') {
        battleStatus = false;
        System.out.println("You escaped. You pussy." );
      }

      else{
        System.out.println("Erm, that isn't a valid option. 🤓🤓🤓 \n");
      }

      if(yourCurrentHP < 0) {
        battleStatus = false;
        System.out.println("You took the L. SKill issue.");
        numLosses[0]++;
      }

      if(enemyCurrentHP < 0) {
        battleStatus = false;
        System.out.println("That mf got clapped!!! RIP bozo.");
        int foodNum = -1;
        int i = 0;
        while(i <= 8){
          if(i == 8){
            basket[i] = "meat";
            System.out.println("You can not carry more than 8 food items. Please en"
            + "ter an integer from 1 to 9 to discard an item");
            while(foodNum < 0 || 10 < foodNum) {
              System.out.println("\n\n\n\n\n\n\n\n\n"
              + "1: " + basket[0]
              + "\n2: " + basket[1]
              + "\n3: " + basket[2]
              + "\n4: " + basket[3]
              + "\n5: " + basket[4]
              + "\n6: " + basket[5]
              + "\n7: " + basket[6]
              + "\n8: " + basket[7]
              + "\n9: " + basket[8] + "(item you just obtained)");
              foodNum = input.nextInt();
            }
            basket[foodNum - 1] = basket[i];
            basket[8] = "";
            return;
          } else if(basket[i] == "") {
            basket[i] = "meat";
            return;
          }
          i++;
        }
      }


    }



  }


  public static void hangMan(String[] basket, int[] numLosses){
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

    /*The variable below gives time to the player to read the prompt and
    prepare to what's about to come next.*/
    int playerContinuesLevel = input.nextInt();

    //The food item the user recieves
    String foodItem = randomFood();

    //List of foods the user will be guessing
    String guessingWordsList[] = {"food", "strawberry", "lemonade",
                                "cheeseburger", "nutella"};

    //A random food would be selected for hangman minigame
    int k = (int)(Math.random() * 5);

    //List of hangman parts that will be printed
    String hangmanParts[] = {"Head", "Body", "L-Arm", "R-Arm", "L-Leg",
                             "R-Leg"};
    //a variable to increase for hangmanParts if the user inputs the wrong thing
    int b = 0;

    System.out.println("\nThe machine prints out, LET THE GAME BEGIN!");

    //The word that the user is trying to find
    String foodItemMysteryWord = "";

    /*A loop to fills empty spots with stars or spaces into a String
    for the user to guess letters*/
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

    // //What word the program wants you to find out
    // System.out.println(guessingWordsList[k]);

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
        System.out.println("\nThe machine prints out, \"YOU GOT IT RIGHT! YOU "
                           + "WIN!. HERE'S YOUR PRIZE.\" You earn enough money "
                           + "to go and buy an ingredient. So you buy "
                           + foodItem + " and continue with your quest.");

        int foodNum = -1;
        int i = 0;
        while(i <= 8){
          if(i == 8){
            basket[i] = foodItem;
            System.out.println("You can not carry more than 8 food items. Please en"
            + "ter an integer from 1 to 9 to discard an item");
            while(foodNum < 0 || 10 < foodNum) {
              System.out.println("\n\n\n\n\n\n\n\n\n"
              + "1: " + basket[0]
              + "\n2: " + basket[1]
              + "\n3: " + basket[2]
              + "\n4: " + basket[3]
              + "\n5: " + basket[4]
              + "\n6: " + basket[5]
              + "\n7: " + basket[6]
              + "\n8: " + basket[7]
              + "\n9: " + basket[8] + "(item you just obtained)");
              foodNum = input.nextInt();
            }
            basket[foodNum - 1] = basket[i];
            basket[8] = "";
            return;
          } else if(basket[i] == "") {
            basket[i] = foodItem;
            return;
          }
          i++;
        }
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

        System.out.println("\nCurrent Word: " + foodItemMysteryWord);
      }
      else if (!(guessingWordsList[k].contains(userGuess)
                && userGuess.trim().length() == 1))
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

          numLosses[0]++;

          return; //Andres you change this
        }

        b++;

        System.out.println("\nCurrent Word: " + foodItemMysteryWord);
      }
    }



    System.out.println("\nThe machine prints out, \"YOU GOT IT RIGHT! YOU "
                       + "WIN!. HERE'S YOUR PRIZE.\" You earn enough money "
                       + "to go and buy an ingredient. So you buy "
                       + foodItem + " and continue with your quest.");


                       int foodNum = -1;
                       int i = 0;
                       while(i <= 8){
                         if(i == 8){
                           basket[i] = foodItem;
                           System.out.println("You can not carry more than 8 food items. Please en"
                           + "ter an integer from 1 to 9 to discard an item");
                           while(foodNum < 0 || 10 < foodNum) {
                             System.out.println("\n\n\n\n\n\n\n\n\n"
                             + "1: " + basket[0]
                             + "\n2: " + basket[1]
                             + "\n3: " + basket[2]
                             + "\n4: " + basket[3]
                             + "\n5: " + basket[4]
                             + "\n6: " + basket[5]
                             + "\n7: " + basket[6]
                             + "\n8: " + basket[7]
                             + "\n9: " + basket[8] + "(item you just obtained)");
                             foodNum = input.nextInt();
                           }
                           basket[foodNum - 1] = basket[i];
                           basket[8] = "";
                           return;
                         } else if(basket[i] == "") {
                           basket[i] = foodItem;
                           return;
                         }
                         i++;
                       }


  }





  public static void magician(String[] basket, int[] numLosses){
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
    String food = randomFood();
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


      int foodNum = -1;
      int i = 0;
      while(i <= 8){
      if(i == 8){
        basket[i] = food;
        System.out.println("You can not carry more than 8 food items. Please en"
        + "ter an integer from 1 to 9 to discard an item");
        while(foodNum < 0 || 10 < foodNum) {
          System.out.println("\n\n\n\n\n\n\n\n\n"
          + "1: " + basket[0]
          + "\n2: " + basket[1]
          + "\n3: " + basket[2]
          + "\n4: " + basket[3]
          + "\n5: " + basket[4]
          + "\n6: " + basket[5]
          + "\n7: " + basket[6]
          + "\n8: " + basket[7]
          + "\n9: " + basket[8] + "(item you just obtained)");
          foodNum = input.nextInt();
        }
        basket[foodNum - 1] = basket[i];
        basket[8] = "";
        return;
        } else if(basket[i] == "") {
          basket[i] = food;
          return;
        }
        i++;
        }
    }
    else
    {
      System.out.println("\n\"You failed to win two out of the three rounds! " +
                         "Abrakadabra!\"" + " She says before disapearing " +
                         "in a bright purple smoky cloud. You don't receive " +
                         "the item and continue with your quest.");

      numLosses[0]++;
    }


  }





  public static void ingredientInteraction(String[] basket, int[] numLosses){
    Scanner input = new Scanner(System.in);
    //for food winning purposes
    int foodNum;
    int i;






    int dialogueRandomizer = (int)(Math.random() * 3) + 1;
    boolean interactWithIngredient = false;
    boolean talkWithIngredient = false;
    System.out.println("You found a Tomato.");

    System.out.println(dialogueRandomizer);

    do {
      System.out.println("Would like to grab this Tomato? "
                          + "Yes (y) or No (n)?");
      char selection = input.next().charAt(0);

      if(selection == 'y') {
        System.out.println("You decided to grab the Tomato. \n");
        interactWithIngredient = true;
        talkWithIngredient = true;


        //dialogue 1
        if(dialogueRandomizer == 1) {
          System.out.println("Tomato: Am I finally gonna be sold?!");
          System.out.println("The fuck? This Tomato talks?!"
                              + " Well, uhh, how do you respond? \n");
          System.out.println("(a) 'Hey buddy how you doing?' \n"
                              + "(b) 'How are you talking???' \n");
          char dialogueSelection = input.next().charAt(0);

            if(dialogueSelection == 'a') {
              System.out.println("Tomato: Ah, uhh, well, umm are you "
                                  + "gonna buy me? \n");
              System.out.println("After looking a bit closer to"
                                  + " this, uhh, sentient Tomato you see "
                                  + " some rotten spots on it. Gross. \n");
              System.out.println("(a) 'Ew this Tomato is gross, bye.' \n"
                                  + " (b)'Are you ok? You don't seem ok, "
                                  + "literally.");
              dialogueSelection = input.next().charAt(0);

                if(dialogueSelection == 'a') {
                  System.out.println("You decide to leave this abomination"
                                      + " alone.");
                  System.out.println("Tomato: NOOOO PLEASE COME BACK!"
                                      + " I JUST WANT SOMEONE TO BUY ME!"
                                      + " I DON't WANNA ROT HERE FOREVER!");
                  talkWithIngredient = false;
                  numLosses[0]++;
                }

                if(dialogueSelection == 'b') {
                  System.out.println("Tomato: Well... It's because I... "
                                      + "I am rotten. And nobody wants me."
                                      + " *sniff* and you too. \n" );
                  System.out.println("Cmon lets find a different ingrediant,"
                                      + " you can't recover the king with a"
                                      + " rotten Tomato. \n");
                  System.out.println("(a) 'Yep you're right I'm not gonna buy "
                                      + "you. Bye.' \n (b) 'What? Don't say "
                                      + "that, I want you. You are needed.");
                    dialogueSelection = input.next().charAt(0);

                    if(dialogueSelection == 'a') {
                      System.out.println("You decide to leave this abomination"
                                          + " alone.");
                      System.out.println("Tomato: Of course... I am "
                                          + "doomed to be stuck in this store "
                                          + "forever after all...");
                      talkWithIngredient = false;
                      numLosses[0]++;
                    }

                    if(dialogueSelection == 'b') {
                      System.out.println("Tomato: Me? Needed? But I am"
                                          + " rotten. You wouldn't want buy"
                                          + " a Tomato that is spoiled,"
                                          + " would you?");
                      System.out.println("This bozo literally stinks, why would"
                                          + " you want to it so bad? \n");
                      System.out.println("(a) 'Of course you are needed. Needed "
                                          + "to shut up. And it seems like I "
                                          + "need to buy you in order to get you"
                                          + " to shutting the hell up.' \n (b) "
                                          + "'Of course you are needed. Just "
                                          + "because you are rotten doesn't "
                                          + "mean you aren't needed. I need you "
                                          + "to heal the great king "
                                          + "that is ill.'");
                      dialogueSelection = input.next().charAt(0);

                      if(dialogueSelection == 'a') {
                        System.out.println("Tomato: Oh, y-yay... \n");
                        System.out.println("Well looks like you made a mistake "
                                            + "on buying this rotten piece of "
                                            + "crap. Don't blame me if you get "
                                            + "executed. \n"
                                            + "You got a rotten Tomato");
                        talkWithIngredient = false;
                        foodNum = -1;
                        i = 0;
                        while(i <= 8){
                          if(i == 8){
                            basket[i] = "tomato";
                            System.out.println("You can not carry more than 8 food items. Please en"
                            + "ter an integer from 1 to 9 to discard an item");
                            while(foodNum < 0 || 10 < foodNum) {
                              System.out.println("\n\n\n\n\n\n\n\n\n"
                              + "1: " + basket[0]
                              + "\n2: " + basket[1]
                              + "\n3: " + basket[2]
                              + "\n4: " + basket[3]
                              + "\n5: " + basket[4]
                              + "\n6: " + basket[5]
                              + "\n7: " + basket[6]
                              + "\n8: " + basket[7]
                              + "\n9: " + basket[8] + "(item you just obtained)");
                              foodNum = input.nextInt();
                            }
                            basket[foodNum - 1] = basket[i];
                            basket[8] = "";
                            return;
                          } else if(basket[i] == "") {
                            basket[i] = "tomato";
                            return;
                          }
                          i++;
                        }
                      }

                      if(dialogueSelection == 'b') {
                        System.out.println("Tomato: But I'm rotten. How "
                                            + "can a rotten Tomato like "
                                            + "me heal the king? \n");
                        System.out.println("(a) 'I believe that you can heal "
                                            + "the king whether you are rotten "
                                            + "or not' \n (b) 'You won't I'm "
                                            + "buying you cause I pity you'");
                        dialogueSelection = input.next().charAt(0);

                        if(dialogueSelection == 'a') {
                          System.out.println("Tomato: R-really? Thank you!");
                          System.out.println("The rotten Tomato "
                                              + "sudden began to glow with the "
                                              + "power of a newfound friendship"
                                              + " and transformed into the "
                                              + "mystical, legendary secret "
                                              + "ingredient, 'love'. \n"
                                              + "You obtained love.");
                          talkWithIngredient = false;
                          foodNum = -1;
                          i = 0;
                          while(i <= 8){
                            if(i == 8){
                              basket[i] = "love";
                              System.out.println("You can not carry more than 8 food items. Please en"
                              + "ter an integer from 1 to 9 to discard an item");
                              while(foodNum < 0 || 10 < foodNum) {
                                System.out.println("\n\n\n\n\n\n\n\n\n"
                                + "1: " + basket[0]
                                + "\n2: " + basket[1]
                                + "\n3: " + basket[2]
                                + "\n4: " + basket[3]
                                + "\n5: " + basket[4]
                                + "\n6: " + basket[5]
                                + "\n7: " + basket[6]
                                + "\n8: " + basket[7]
                                + "\n9: " + basket[8] + "(item you just obtained)");
                                foodNum = input.nextInt();
                              }
                              basket[foodNum - 1] = basket[i];
                              basket[8] = "";
                              return;
                            } else if(basket[i] == "") {
                              basket[i] = "love";
                              return;
                            }
                            i++;
                          }
                        }

                        if(dialogueSelection == 'b') {
                          System.out.println("Tomato: Oh, ok... \n");
                          System.out.println("Can't believe you are really "
                                              + "set on buying this garbage. "
                                              + "i am sending my prayers for "
                                              + "late king. \n You "
                                              + "got a rotten Tomato");
                          talkWithIngredient = false;
                          foodNum = -1;
                          i = 0;
                          while(i <= 8){
                            if(i == 8){
                              basket[i] = "tomato";
                              System.out.println("You can not carry more than 8 food items. Please en"
                              + "ter an integer from 1 to 9 to discard an item");
                              while(foodNum < 0 || 10 < foodNum) {
                                System.out.println("\n\n\n\n\n\n\n\n\n"
                                + "1: " + basket[0]
                                + "\n2: " + basket[1]
                                + "\n3: " + basket[2]
                                + "\n4: " + basket[3]
                                + "\n5: " + basket[4]
                                + "\n6: " + basket[5]
                                + "\n7: " + basket[6]
                                + "\n8: " + basket[7]
                                + "\n9: " + basket[8] + "(item you just obtained)");
                                foodNum = input.nextInt();
                              }
                              basket[foodNum - 1] = basket[i];
                              basket[8] = "";
                              return;
                            } else if(basket[i] == "") {
                              basket[i] = "tomato";
                              return;
                            }
                            i++;
                          }
                        }

                      }


                    }

                }


            }

          else if(dialogueSelection == 'b') {
            System.out.println("Tomato: Oh me?! Well I am a special "
                                + "product with high intelligence created for "
                                + "the purpose to be your talking food "
                                + "companion to assist your cooking. We are "
                                + "created to help beginner cooks to learn "
                                + "how to cook by communiticating with them "
                                + "and showing them the step by step process "
                                + "on how to make a dish that they wish for. "
                                + "So will you buy me? \n");
            System.out.println("Well I caught none of that, and I don't wanna "
                                + "deal with a talking Tomato. And I'm "
                                + "sure you don't want to too, right? \n");
            System.out.println("(a) 'You sound annoying bye.' \n (b) 'Well "
                                + "thats neat. ");
            dialogueSelection = input.next().charAt(0);

            if(dialogueSelection == 'a') {
              System.out.println("Tomato: NOOOO PLEASE COME BACK!"
                                  + " I JUST WANT SOMEONE TO BUY ME!"
                                  + " I DON't WANNA ROT HERE FOREVER! \n");
              System.out.println("Alright, time to find a different ingredient "
                                  + "that isn't annoying.");
              talkWithIngredient = false;
              numLosses[0]++;
            }

            if(dialogueSelection == 'b') {
              System.out.println("Tomato: Huh... R-REALLY?! WILL YOU "
                                  + " BUY ME THEN??? \n");
              System.out.println("Don't buy this sentient thing, it seems to be"
                                  + " rotten if you look closely. \n");
              System.out.println("(a)'Huh... uhhhh nuh uh. I'm not buying no "
                                  + "rotten ass Tomato.' \n (b) 'Well why"
                                  + " not, buying a talking Tomato would "
                                  + "pretty neat' ");
              dialogueSelection = input.next().charAt(0);

              if(dialogueSelection == 'a') {
                System.out.println("Tomato:... \n");
                System.out.println("Well looks like you shocked that thing into"
                                    + " shutting up. Time to find a fresh, "
                                    + "healthy, non-sentient ingredient this "
                                    + "time.");
                talkWithIngredient = false;
                numLosses[0]++;
              }

              if(dialogueSelection == 'b') {
                System.out.println("Tomato: But what's so neat about "
                                    + "buying a rotten Tomato like "
                                    + "me? \n");
                System.out.println("Really? You seriously buying this junk? \n");
                System.out.println("(a) 'I'm buying to keep you on a podium, I "
                                    + "could care less if you are rotten.' \n"
                                    + "(b) 'If you can help me cook in the "
                                    + "kitchen, then I would need you. ");
                dialogueSelection = input.next().charAt(0);

                if(dialogueSelection == 'a') {
                  System.out.println("Tomato: P-podium? You don't want "
                                      + "to use me as an ingredient for a "
                                      + "dish? \n");
                  System.out.println("(a) 'Nope you could be a neat trophy that"
                                      + " can talk.' \n (b) 'I'm not gonna use "
                                      + "you for my dish'");
                  dialogueSelection = input.next().charAt(0);
                  System.out.println("Tomato: But that's not my purpose. "
                                      + "I want to be used in your cooking. I "
                                      + "I want to help people by sharing my "
                                      + "knowledge that I was created with. "
                                      + "But nobody wants me, until you came "
                                      + "along, but this is not what I want. "
                                      + "I don't want to be stuck on top of a "
                                      + "podium rotting away. I want to be "
                                      + "cooked! \n");
                  System.out.println("(a) 'Too bad cry about it, wah wah wah, "
                                      + "I'm buying you and you are staying on "
                                      + "that podium.' \n (b) 'Oh, I didn't "
                                      + "know that is how you feel. I'm sorry, "
                                      + "let me fullfil that wish of yours.'");
                  dialogueSelection = input.next().charAt(0);

                  if(dialogueSelection == 'a') {
                    System.out.println("Tomato: NO NO NO I DON'T WANNA "
                                        + "BE IN YOUR STUPID PODIUM NO NO NO"
                                        + "PLEASE I BEG YOU PLEASE COOK ME ANY "
                                        + "WAY YOU LIKE PLEASE DON'T PUT ME IN "
                                        + "A PODIUM! \n");
                    System.out.println("Well looks like you are buying a piece "
                                        + "of shit for yourself. You know that "
                                        + "we are here to save the king, not to"
                                        + " shop souvenirs. \n *sigh* Looks "
                                        + "like you got yourself a rotten "
                                        + "Tomato.");
                    talkWithIngredient = false;

                    foodNum = -1;
                    i = 0;
                    while(i <= 8){
                      if(i == 8){
                        basket[i] = "tomato";
                        System.out.println("You can not carry more than 8 food items. Please en"
                        + "ter an integer from 1 to 9 to discard an item");
                        while(foodNum < 0 || 10 < foodNum) {
                          System.out.println("\n\n\n\n\n\n\n\n\n"
                          + "1: " + basket[0]
                          + "\n2: " + basket[1]
                          + "\n3: " + basket[2]
                          + "\n4: " + basket[3]
                          + "\n5: " + basket[4]
                          + "\n6: " + basket[5]
                          + "\n7: " + basket[6]
                          + "\n8: " + basket[7]
                          + "\n9: " + basket[8] + "(item you just obtained)");
                          foodNum = input.nextInt();
                        }
                        basket[foodNum - 1] = basket[i];
                        basket[8] = "";
                        return;
                      } else if(basket[i] == "") {
                        basket[i] = "tomato";
                        return;
                      }
                      i++;
                    }
                  }

                  if(dialogueSelection == 'b') {
                    System.out.println("Tomato: R-really? You would do "
                                        + "that for me? Thank you! I am so "
                                        + "grateful for you. \n");
                    System.out.println("The rotten Tomato "
                                        + "sudden began to glow as if it is "
                                        + "evolving into something greater. "
                                        + "As if it is evolving into that "
                                        + "one ultimate, extraordinary secret "
                                        + "ingredient, love, through the "
                                        + "power of a newfound friendship. Oh "
                                        + "wait, it did evolve into the secret "
                                        + "ingredient love. \n"
                                        + "You obtained the secret ingredient "
                                        + "love.");
                    foodNum = -1;
                    i = 0;
                    while(i <= 8){
                    if(i == 8){
                      basket[i] = "love";
                      System.out.println("You can not carry more than 8 food items. Please en"
                      + "ter an integer from 1 to 9 to discard an item");
                      while(foodNum < 0 || 10 < foodNum) {
                      System.out.println("\n\n\n\n\n\n\n\n\n"
                      + "1: " + basket[0]
                      + "\n2: " + basket[1]
                      + "\n3: " + basket[2]
                      + "\n4: " + basket[3]
                      + "\n5: " + basket[4]
                      + "\n6: " + basket[5]
                      + "\n7: " + basket[6]
                      + "\n8: " + basket[7]
                      + "\n9: " + basket[8] + "(item you just obtained)");
                      foodNum = input.nextInt();
                    }
                    basket[foodNum - 1] = basket[i];
                    basket[8] = "";
                    return;
                  } else if(basket[i] == "") {
                    basket[i] = "love";
                    return;
                  }
                  i++;
                }
              }
              }

                if(dialogueSelection == 'b') {
                  System.out.println("Tomato: Of course I can help you!"
                                      + "I can help assist your cooking when"
                                      + "ever you need me!");
                  System.out.println("Why would you buy th- IS IT SHINING?! \n"
                                      + " The rotten Tomato suddenly began"
                                      + " to glow at the parts where it is "
                                      + "rotten. It seems with the rotten "
                                      + "Tomato finally fullfiling its "
                                      + "sense of purpose, it restored back into"
                                      + " a healthy looking Tomato. \n"
                                      + "You obtained a Tomato.");
                  talkWithIngredient = false;
                  foodNum = -1;
                  i = 0;
                  while(i <= 8){
                    if(i == 8){
                      basket[i] = "tomato";
                      System.out.println("You can not carry more than 8 food items. Please en"
                      + "ter an integer from 1 to 9 to discard an item");
                      while(foodNum < 0 || 10 < foodNum) {
                        System.out.println("\n\n\n\n\n\n\n\n\n"
                        + "1: " + basket[0]
                        + "\n2: " + basket[1]
                        + "\n3: " + basket[2]
                        + "\n4: " + basket[3]
                        + "\n5: " + basket[4]
                        + "\n6: " + basket[5]
                        + "\n7: " + basket[6]
                        + "\n8: " + basket[7]
                        + "\n9: " + basket[8] + "(item you just obtained)");
                        foodNum = input.nextInt();
                      }
                      basket[foodNum - 1] = basket[i];
                      basket[8] = "";
                      return;
                    } else if(basket[i] == "") {
                      basket[i] = "tomato";
                      return;
                    }
                    i++;
                  }

                }

              }

            }

          }

        }


        //dialogue 2
        if(dialogueRandomizer == 2) {
          System.out.println("Tomato: YOU PUT YOUR FILTHY HANDS AWAY FROM"
                              + "ME OR ELSE!!! \n");
          System.out.println("The fuck? This Tomato talks?! Well, uhh,"
                              +" how do you respond? \n");
          System.out.println("(a) 'Or else what?' \n(b) 'Woah buddy, why "
                              + " don't you calm down for a minute.'");
          char dialogueSelection = input.next().charAt(0);

          if(dialogueSelection == 'a') {
            System.out.println("Tomato: YOU WANNA FIGHT ME? COME AT ME, "
                                + "I GONNA BRUISE YOU UP! \n");
            System.out.println("Why are you starting a fight with this "
                                + "Tomato. \n");
            System.out.println("(a) 'What? I'm not fighting you, besides why "
                                + "are you so heated for?' \n (b) 'Bet, your "
                                + "tiny Tomato ass can't do shit to me.'");
            dialogueSelection = input.next().charAt(0);

            if(dialogueSelection == 'a') {
              System.out.println("Tomato: I'M HEATED BECAUSE I AM CREATED"
                                  + " TO BE SERVANTS TO YOU PATHETIC CREATURES!"
                                  + " WHY SHOULD I BE FATED TO HELP YOU?! \n");
              System.out.println("Don't you realize you are talking to a "
                                  + "literal Tomato? You look insane."
                                  + "\n");
              System.out.println("(a) 'But the king is ill, and I need you.'"
                                  + "\n (b) 'I am sorry you feel that way, can "
                                  + "I buy you though?");
              dialogueSelection = input.next().charAt(0);

              if(dialogueSelection == 'a') {
                System.out.println("Tomato: I DON'T GIVE A DAMN ABOUT "
                                    + "SOME HUMAN! GO AWAY! \n");
                System.out.println("Alright, looks like this thing doesn't "
                                    + "wanna be bothered. Lets go somewhere "
                                    + "else with no annoying Tomato. \n");
                System.out.println("(a) 'Ok.' \n (b) 'No I am not gonna go "
                                    + "away, I am gonna help you.");
                dialogueSelection = input.next().charAt(0);

                if(dialogueSelection == 'a') {
                  System.out.println("You left that Tomato alone");
                  talkWithIngredient = false;
                  numLosses[0]++;
                }

                if(dialogueSelection == 'b') {
                  System.out.println("Tomato: HELP ME? HOW? FORCE ME TO "
                                      + "ACCEPT MY FATE TO HELP YOU IN THE "
                                      + "KITCHEN TO SAVE YOUR PRECIOUS KING? \n");
                  System.out.println("(a) 'Not a bad idea, I'm gonna buy you' "
                                      + "\n (b) 'Maybe your fate isn't about "
                                      + "helping us, maybe it is to be the best"
                                      + " Tomato ever!");
                  dialogueSelection = input.next().charAt(0);

                  if(dialogueSelection == 'a') {
                    System.out.println("Tomato: DON'T YOU DARE, NO, TAKE "
                                        + "YOUR HANDS OFF OF ME! NOOOOOOOO NOO"
                                        + "OOOOOOOOO!!! \n ");
                    System.out.println("Looks like you got yourself a very "
                                        + "angry looking Tomato.");
                    talkWithIngredient = false;
                    foodNum = -1;
                    i = 0;
                    while(i <= 8){
                      if(i == 8){
                        basket[i] = "tomato";
                        System.out.println("You can not carry more than 8 food items. Please en"
                        + "ter an integer from 1 to 9 to discard an item");
                        while(foodNum < 0 || 10 < foodNum) {
                          System.out.println("\n\n\n\n\n\n\n\n\n"
                          + "1: " + basket[0]
                          + "\n2: " + basket[1]
                          + "\n3: " + basket[2]
                          + "\n4: " + basket[3]
                          + "\n5: " + basket[4]
                          + "\n6: " + basket[5]
                          + "\n7: " + basket[6]
                          + "\n8: " + basket[7]
                          + "\n9: " + basket[8] + "(item you just obtained)");
                          foodNum = input.nextInt();
                        }
                        basket[foodNum - 1] = basket[i];
                        basket[8] = "";
                        return;
                      } else if(basket[i] == "") {
                        basket[i] = "tomato";
                        return;
                      }
                      i++;
                    }
                  }

                  if(dialogueSelection == 'b') {
                    System.out.println("Tomato: But I AM the BEST! I am "
                                        + "better than you human. \n");
                    System.out.println("This Tomato is a narcissist. \n");
                    System.out.println("'What if we healed the king without "
                                        + "using you huh. Then that means we "
                                        + " 'humans' are better than you.' \n");
                    System.out.println("Tomato: HOW DARE YOU, I CAN HEAL "
                                        + "THIS KING FAR BETTER THAN YOU COULD "
                                        + "EVER DO!!! \n");
                    System.out.println("'Alright, bet, we'll see when we buy "
                                        + "you. You better prove that you are "
                                        + "truly the best.' \n");
                    System.out.println("Tomato: BET! \n");
                    System.out.println("Seems like you tricked this angry, "
                                        + "self-centered fodder to be bought. \n"
                                        + "You got yourself a Tomato.");

                    foodNum = -1;
                    i = 0;
                    while(i <= 8){
                      if(i == 8){
                        basket[i] = "tomato";
                        System.out.println("You can not carry more than 8 food items. Please en"
                        + "ter an integer from 1 to 9 to discard an item");
                        while(foodNum < 0 || 10 < foodNum) {
                          System.out.println("\n\n\n\n\n\n\n\n\n"
                          + "1: " + basket[0]
                          + "\n2: " + basket[1]
                          + "\n3: " + basket[2]
                          + "\n4: " + basket[3]
                          + "\n5: " + basket[4]
                          + "\n6: " + basket[5]
                          + "\n7: " + basket[6]
                          + "\n8: " + basket[7]
                          + "\n9: " + basket[8] + "(item you just obtained)");
                          foodNum = input.nextInt();
                        }
                        basket[foodNum - 1] = basket[i];
                        basket[8] = "";
                        return;
                        } else if(basket[i] == "") {
                          basket[i] = "tomato";
                          return;
                        }
                        i++;
                      }
                  }

                }

              }

              if(dialogueSelection == 'b') {
                System.out.println("Tomato: FUCK YOU! /n");
                System.out.println("Looks like this thing doesn't want to be"
                                    + "bought. Lets go somewhere else. \n"
                                    + "You left the angry Tomato alone.");
                talkWithIngredient = false;

                numLosses[0]++;
              }

            }

            if(dialogueSelection == 'b') {
              System.out.println("Tomato: YOU CAN'T SCARE ME, I HEARD "
                                  + "YOU HUMANS ARE SCARED OF THINGS MUCH "
                                  + "SMALLER THAN YOU, YOU PUSSIES! \n");
              System.out.println("Ok, you for real can't let that slide now, "
                                  + "go beat it up. \n");
              System.out.println("You beat up the tomato, and collected it's carcass");
              talkWithIngredient = false;

              foodNum = -1;
              i = 0;
              while(i <= 8){
                if(i == 8){
                  basket[i] = "tomato";
                  System.out.println("You can not carry more than 8 food items. Please en"
                  + "ter an integer from 1 to 9 to discard an item");
                  while(foodNum < 0 || 10 < foodNum) {
                    System.out.println("\n\n\n\n\n\n\n\n\n"
                    + "1: " + basket[0]
                    + "\n2: " + basket[1]
                    + "\n3: " + basket[2]
                    + "\n4: " + basket[3]
                    + "\n5: " + basket[4]
                    + "\n6: " + basket[5]
                    + "\n7: " + basket[6]
                    + "\n8: " + basket[7]
                    + "\n9: " + basket[8] + "(item you just obtained)");
                    foodNum = input.nextInt();
                  }
                  basket[foodNum - 1] = basket[i];
                  basket[8] = "";
                  return;
                } else if(basket[i] == "") {
                  basket[i] = "tomato";
                  return;
                }
                i++;
              }
            }

          }

          else if(dialogueSelection == 'b') {
            System.out.println("Tomato: ME?! CALM DOWN?!!! I AM PUT INTO"
                                + " THIS FOOD AUCTION WHERE I AM EXPECTED TO BE"
                                + "SOLD OFF TO YOU PATHETIC HUMANS, AND YOU "
                                + "EXPECT ME TO CALM DOWN!!! \n");
            System.out.println("Well looks like someone is malding. \n");
            System.out.println("(a) 'Well I'll let you be.' \n (b) 'Oh "
                                + "I'm sorry about your situation. How can "
                                + "I help you?");
            dialogueSelection = input.next().charAt(0);

            if(dialogueSelection == 'a') {
              System.out.println("You left the very angry Tomato that "
                                  + "cursed its fate alone.");
              talkWithIngredient = false;
              numLosses[0]++;
            }

            if(dialogueSelection == 'b') {
              System.out.println("Tomato: You can help me by LEAVING ME "
                                  + "THE HELL ALONE!!! \n");
              System.out.println("Cmon, clearly this thing doesn't want you "
                                  + "here, lets go. \n");
              System.out.println("(a) Leave the Tomato be. \n"
                                  + "(b) 'No I will help you, I will show you "
                                  + "that there is more to the world than being"
                                  + " stuck in this grocery story that you "
                                  + "called a prison'");
              dialogueSelection = input.next().charAt(0);

              if(dialogueSelection == 'a') {
                System.out.println("You respected this thing's wishes and left.");
                talkWithIngredient = false;
                numLosses[0]++;
              }

              if(dialogueSelection == 'b') {
                System.out.println("Tomato: Why would I care about the "
                                    + "outside world filled with you humans?"
                                    + "\n");
                System.out.println("'It is not about us human, it's about "
                                    + "giving you freedom. Doesn't that sound "
                                    + "great?' \n");
                System.out.println("Tomato: Freedom? Well, I always "
                                    + "wanted to leave this shithole. \n");
                System.out.println("(a) 'Well wanna leave?' (b) 'I can buy "
                                    + "you to grant your freedom.'");
                dialogueSelection = input.next().charAt(0);
                System.out.println("Tomato: Well... \n");
                System.out.println("(a) 'Freedom' (b) 'Freedom' \n");
                System.out.println("Tomato: FINE! Show me what the "
                                    + "outside world is then. BUY ME HUMAN! \n");
                System.out.println("'You won't regret it! \n");
                System.out.println("Oh but the Tomato will regret it. "
                                    + "After all, we are here to buy ingredients"
                                    + " to save the king after all. \n"
                                    + "You obtained a Tomato.");
                talkWithIngredient = false;

                foodNum = -1;
                i = 0;
                while(i <= 8){
                  if(i == 8){
                    basket[i] = "tomato";
                    System.out.println("You can not carry more than 8 food items. Please en"
                    + "ter an integer from 1 to 9 to discard an item");
                    while(foodNum < 0 || 10 < foodNum) {
                      System.out.println("\n\n\n\n\n\n\n\n\n"
                      + "1: " + basket[0]
                      + "\n2: " + basket[1]
                      + "\n3: " + basket[2]
                      + "\n4: " + basket[3]
                      + "\n5: " + basket[4]
                      + "\n6: " + basket[5]
                      + "\n7: " + basket[6]
                      + "\n8: " + basket[7]
                      + "\n9: " + basket[8] + "(item you just obtained)");
                      foodNum = input.nextInt();
                    }
                    basket[foodNum - 1] = basket[i];
                    basket[8] = "";
                    return;
                  } else if(basket[i] == "") {
                    basket[i] = "tomato";
                    return;
                  }
                  i++;
                }

              }

            }

          }

        }


        //dialogue 3
        if(dialogueRandomizer == 3) {
          System.out.println("Tomato: Hey what's up. \n");
          System.out.println("The fuck? This Tomato talks?! Well, uhh,"
                              +" how do you respond? \n");
          System.out.println("(a) 'Holy crap how are you talking?' \n"
                              + "(b) 'Whats up g. How you doin?'");
          char dialogueSelection = input.next().charAt(0);

          if(dialogueSelection == 'a') {
            System.out.println("Tomato: I'm just a Tomato that can "
                                + "talk. You wanna buy me? \n");
            System.out.println("A talking Tomato? That's a first for me"
                                + "\n");
            System.out.println("(a) 'Nah I'm good, bye.' \n (b) 'Yeah sure.'");
            dialogueSelection = input.next().charAt(0);

            if(dialogueSelection == 'a') {
              System.out.println("Tomato: Alright I respect that, have a "
                                  + "good one bro. \n");
              System.out.println("Huh, what a chill Tomato. Kinda wish "
                                  + "you would bought it. Oh well.");
              talkWithIngredient = false;

              numLosses[0]++;
            }

            if(dialogueSelection == 'b') {
              System.out.println("Tomato: Alright bro, I can help you "
                                  + "however I can. \n");
              System.out.println("Looks like we got ourselves a cool talking "
                                  + "Tomato with us. \n You obtained a "
                                  + "Tomato.");
              talkWithIngredient = false;

              foodNum = -1;
              i = 0;
              while(i <= 8){
                if(i == 8){
                  basket[i] = "tomato";
                  System.out.println("You can not carry more than 8 food items. Please en"
                  + "ter an integer from 1 to 9 to discard an item");
                  while(foodNum < 0 || 10 < foodNum) {
                    System.out.println("\n\n\n\n\n\n\n\n\n"
                    + "1: " + basket[0]
                    + "\n2: " + basket[1]
                    + "\n3: " + basket[2]
                    + "\n4: " + basket[3]
                    + "\n5: " + basket[4]
                    + "\n6: " + basket[5]
                    + "\n7: " + basket[6]
                    + "\n8: " + basket[7]
                    + "\n9: " + basket[8] + "(item you just obtained)");
                    foodNum = input.nextInt();
                  }
                  basket[foodNum - 1] = basket[i];
                  basket[8] = "";
                  return;
                } else if(basket[i] == "") {
                  basket[i] = "tomato";
                  return;
                }
                i++;
              }

            }

          }

          else if(dialogueSelection == 'b') {
            System.out.println("Tomato: I'm doing all good bro. How "
                                + "about you? \n");
            System.out.println("I'm all good man. Oh wait... \n");
            System.out.println("(a) 'I'm good as well, can I buy you?' \n"
                                + "(b) 'I'm good as well, well I'm gonna go, "
                                + "bye bye.'");
            dialogueSelection = input.next().charAt(0);

            if(dialogueSelection == 'a') {
              System.out.println("Tomato: Go for it man, I don't mind. \n");
              System.out.println("What a chill Tomato. \n Looks like "
                                  + "you got a Tomato.");
              talkWithIngredient = false;

              foodNum = -1;
              i = 0;
              while(i <= 8){
                if(i == 8){
                  basket[i] = "tomato";
                  System.out.println("You can not carry more than 8 food items. Please en"
                  + "ter an integer from 1 to 9 to discard an item");
                  while(foodNum < 0 || 10 < foodNum) {
                    System.out.println("\n\n\n\n\n\n\n\n\n"
                    + "1: " + basket[0]
                    + "\n2: " + basket[1]
                    + "\n3: " + basket[2]
                    + "\n4: " + basket[3]
                    + "\n5: " + basket[4]
                    + "\n6: " + basket[5]
                    + "\n7: " + basket[6]
                    + "\n8: " + basket[7]
                    + "\n9: " + basket[8] + "(item you just obtained)");
                    foodNum = input.nextInt();
                  }
                  basket[foodNum - 1] = basket[i];
                  basket[8] = "";
                  return;
                } else if(basket[i] == "") {
                  basket[i] = "tomato";
                  return;
                }
                i++;
              }



            }

            if(dialogueSelection == 'b') {
              System.out.println("Tomato: Alright, it's all good bro. "
                                  + "You have a good one.");
              System.out.println("What? We are leaving that chill Tomato?"
                                  + " What a shame... \n You left the "
                                  + "Tomato.");
              talkWithIngredient = false;
              numLosses[0]++;
            }

          }

        }


      }

      else if(selection == 'n') {
        System.out.println("Boo hoo, your loss I guess.");
        interactWithIngredient = true;
        talkWithIngredient = false;
        numLosses[0]++;
      }

      else {
        System.out.println("Erm, that isn't a valid option. 🤓🤓🤓");
      }

    } while(!interactWithIngredient && !talkWithIngredient);



  }




  public static boolean isEmpty(String[] basket){
    int numItems = 0;
    for(int i = 0; i < 8; i++){
      if(!basket[i].equals("")){
        return false;
      }
    } return true;
  }


  public static void addFood(String[] basket){
    Scanner input = new Scanner(System.in);
    int foodNum = -1;
    int i = 0;
    while(i <= 8){
      if(i == 8){
        basket[i] = randomFood();
        System.out.println("You can not carry more than 8 food items. Please en"
        + "ter an integer from 1 to 9 to discard an item");
        while(foodNum < 0 || 10 < foodNum) {
          System.out.println("\n\n\n\n\n\n\n\n\n"
          + "1: " + basket[0]
          + "\n2: " + basket[1]
          + "\n3: " + basket[2]
          + "\n4: " + basket[3]
          + "\n5: " + basket[4]
          + "\n6: " + basket[5]
          + "\n7: " + basket[6]
          + "\n8: " + basket[7]
          + "\n9: " + basket[8] + "(item you just obtained)");
          foodNum = input.nextInt();
        }
        basket[foodNum - 1] = basket[i];
        basket[8] = "";
        return;
      } else if(basket[i] == "") {
        basket[i] = randomFood();
        return;
      }
      i++;
    }

  }

  public static String randomFood(){
    switch((int) (Math.random() * 2)){
      case 0: return "flour";
      case 1: return "cheese";
      default: System.out.println("This shouldn't happen");
      return "";
    }
  }


}
