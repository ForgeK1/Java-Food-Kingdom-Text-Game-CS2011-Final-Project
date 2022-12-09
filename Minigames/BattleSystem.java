import java.util.Scanner;

public class BattleSystem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Battle starting.");

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

      if(selection == 'b') {
        battleStatus = false;
        System.out.println("You escaped. You pussy." );
      }

      if(yourCurrentHP < 0) {
        battleStatus = false;
        System.out.println("You took the L. SKill issue.");
      }

      if(enemyCurrentHP < 0) {
        battleStatus = false;
        System.out.println("That mf got clapped!!! RIP bozo.");
      }

    }



  }
}
