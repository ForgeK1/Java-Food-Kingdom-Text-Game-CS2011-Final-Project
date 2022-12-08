import java.util.Scanner;

public class VideoGameBones {
  public static void main(String[] args) {
    //♥ █ | ╔ = ╗ \u255D ╚
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

    int[] numlosses = {0};

    System.out.println("You have entered the dungeon.\n To move around use:\n  "
    + " w\n a s d \n\n To leave use q");

    char move = ' ';
    do {
    System.out.println("\n\n\n\n\n\n\n\n\n\n To move around use"
    + ":\n   w\n a s d \n\n To leave use q\n"
    + "╔=======╗\n"
    + "|\033[0;103m" + occupied(space[0]) +  "\033[0m" + occupied(space[1]) +occupied(space[2])
    +occupied(space[3]) + occupied(space[4]) +occupied(space[5])
    +occupied(space[6]) +"|\n"
    + "|" + occupied(space[7]) + "█" + occupied(space[8]) + "█"
    + occupied(space[9]) + "█" + occupied(space[10]) + "|\n"
    + "|" + occupied(space[11]) + occupied(space[12])+occupied(space[13])
    +occupied(space[14])+occupied(space[15])+occupied(space[16])
    +occupied(space[17])+ "|\n" + "|" + occupied(space[18]) + "█"
    + occupied(space[19]) + "█" + occupied(space[20]) + "█"
    + occupied(space[21]) + "|\n"+ "|" + occupied(space[22])
    + occupied(space[23]) + occupied(space[24]) +occupied(space[25])
    +occupied(space[26]) +occupied(space[27]) +occupied(space[28]) +"|\n"
    + "╚=======|" + "\n\n\n"
    + "Food Collected:\n-------------------------\n1: " + basket[0]
    + "\n2: " + basket[1]
    + "\n3: " + basket[2]
    + "\n4: " + basket[3]
    + "\n5: " + basket[4]
    + "\n6: " + basket[5]
    + "\n7: " + basket[6]
    + "\n8: " + basket[7]);


    move = input.next().charAt(0);
    int index = locate(space);
    movementAt(move, space, index);






    if(((int) (Math.random() * 2)) == 0) {
      int minigame = (int) (Math.random() * 4);
      switch(minigame) {
        case 0: miniGame1(basket, numlosses);
                break;
        case 1: miniGame2(basket, numlosses);
                break;
        case 2: miniGame3(basket, numlosses);
                break;
        case 3: miniGame4(basket, numlosses);
                break;
        default: System.out.println("This should not happen");
      }
    }

    } while (numlosses[0] < 3);
      System.out.println("\n\n\n\n\n\n\n\n\n You have lost 3 times. GAME OVER");

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

  public static int locate (boolean[] space) {
    int index = 0;
    while (space[index] == false) {
      index++;
    }
    return index;
  }

  public static void movementAt(char move, boolean[] space, int index) {
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
      case 'q': if(space[0] != true) {
                  System.out.println("You have chosen to leave the dungeon");
                  *********************************
                  *********************************
                  System.exit(0);
                  **********************************
                  *********************************
                } else {
                  System.out.println("You must stand at the exit in order to leave");
                }
                break;
      default: System.out.println("Not a valid input, try again");
    }
  }


  public static void miniGame1(String[] basket, int[] numlosses){
    Scanner input = new Scanner(System.in);
    System.out.println("You have entered mini-game-1\ncarefully enter \"win\" "
    + "to win");
    String winOrLose = input.next();
    if(winOrLose.equals("win")){
      addFood(basket);
    } else {
      numlosses[0]++;
    }
  }


  public static void miniGame2(String[] basket, int[] numlosses){
    Scanner input = new Scanner(System.in);
    System.out.println("You have entered mini-game-2\ncarefully enter \"win\" "
    + "to win");
    String winOrLose = input.next();
    if(winOrLose.equals("win")){
      addFood(basket);
    } else {
      numlosses[0]++;
    }
  }


  public static void miniGame3(String[] basket, int[] numlosses){
    Scanner input = new Scanner(System.in);
    System.out.println("You have entered mini-game-3\ncarefully enter \"win\" "
    + "to win");
    String winOrLose = input.next();
    if(winOrLose.equals("win")){
      addFood(basket);
    } else {
      numlosses[0]++;
    }
  }


  public static void miniGame4(String[] basket, int[] numlosses){
    Scanner input = new Scanner(System.in);
    System.out.println("You have entered mini-game-4\ncarefully enter \"win\" "
    + "to win");
    String winOrLose = input.next();
    if(winOrLose.equals("win")){
      addFood(basket);
    } else {
      numlosses[0]++;
    }
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
    switch((int) (Math.random() * 8)){
      case 0: return "Potatoes";
      case 1: return "Syrup";
      case 2: return "Meat";
      case 3: return "Cheese";
      case 4: return "Eggs";
      case 5: return "Flour";
      case 6: return "Tomatoes";
      case 7: return "Onions";
      default: System.out.println("This shouldn't happen");
      return "";
    }
  }


}
