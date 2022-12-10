import java.util.Scanner;

public class PickAChest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("You came across 3 chests sitting in the middle of the"
                        + " aisle. Upon closer inspection, you see on each chest"
                        + " theres a sign that says 100% off! What a deal!"
                        + " You cannot let this opportunity pass!");

    boolean PickingAChest = false;

    do {

      System.out.println("Do you want to open a chest? Yes (y)? No (n)? ");
      char selection = input.next().charAt(0);

      if(selection == 'y') {
        PickingAChest = true;
      }

      else if(selection == 'n') {
        System.out.println("C'mon its literally a steal you GOTTA pick one.");
      }

      else{
        System.out.println("Erm, that isn't a valid option. 🤓🤓🤓");
      }

    }
    while(!PickingAChest);

    if(PickingAChest) {
      int correctChest = (int)(Math.random() * 3) + 1;
      // String strCorrectChest = "";
      //
      // switch(correctChest) {
      //   case 0: strCorrectChest = "1"; break;
      //   case 1: strCorrectChest = "2"; break;
      //   case 2: strCorrectChest = "3"; break;
      //   default: strCorrectChest = "4"; break;
      // }

      System.out.println("Alright! Theres 3 chest in front of you, which chest "
                          + "would you like?");
      System.out.println("The first chest (1)? The second chest (2)? Or the "
                          + "third chest (3)?");
      int whichChest = input.nextInt();

      if(whichChest == correctChest) {
        System.out.println("Nice! You got an ingredient, I knew these chests"
                            + " were worth it!");
      }

      else {
        System.out.println("Some rats jumped out of the chest you open and"
                            + " ate one of your ingredient."
                            + " You know you could've not"
                            + " pick a chest and left it alone." );
      }

      System.out.println(correctChest);

    }


    input.close();
  }
}
