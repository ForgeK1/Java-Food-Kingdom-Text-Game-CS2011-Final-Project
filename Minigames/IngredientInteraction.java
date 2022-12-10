import java.util.Scanner;

public class IngredientInteraction {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int dialogueRandomizer = (int)(Math.random() * 3) + 1;
    boolean interactWithIngredient = false;
    boolean talkWithIngredient = false;
    System.out.println("You found a [ingrediant].");

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
                        }

                        if(dialogueSelection == 'b') {
                          System.out.println("Tomato: Oh, ok... \n");
                          System.out.println("Can't believe you are really "
                                              + "set on buying this garbage. "
                                              + "i am sending my prayers for "
                                              + "late king. \n You "
                                              + "got a rotten Tomato");
                          talkWithIngredient = false;
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
                                  + "literal [ingrediant]? You look insane."
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
                  }

                }

              }

              if(dialogueSelection == 'b') {
                System.out.println("Tomato: FUCK YOU! /n");
                System.out.println("Looks like this thing doesn't want to be"
                                    + "bought. Lets go somewhere else. \n"
                                    + "You left the angry Tomato alone.");
                talkWithIngredient = false;
              }

            }

            if(dialogueSelection == 'b') {
              System.out.println("Tomato: YOU CAN'T SCARE ME, I HEARD "
                                  + "YOU HUMANS ARE SCARED OF THINGS MUCH "
                                  + "SMALLER THAN YOU, YOU PUSSIES! \n");
              System.out.println("Ok, you for real can't let that slide now, "
                                  + "go beat it up. \n");
              //enter into BattleSystem program
              talkWithIngredient = false;
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
            }

            if(dialogueSelection == 'b') {
              System.out.println("Tomato: Alright bro, I can help you "
                                  + "however I can. \n");
              System.out.println("Looks like we got ourselves a cool talking "
                                  + "Tomato with us. \n You obtained a "
                                  + "Tomato.");
              talkWithIngredient = false;
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
            }

            if(dialogueSelection == 'b') {
              System.out.println("Tomato: Alright, it's all good bro. "
                                  + "You have a good one.");
              System.out.println("What? We are leaving that chill Tomato?"
                                  + " What a shame... \n You left the "
                                  + "Tomato.");
              talkWithIngredient = false;
            }

          }

        }


      }

      else if(selection == 'n') {
        System.out.println("Boo hoo, your lose I guess.");
        interactWithIngredient = true;
        talkWithIngredient = false;
      }

      else {
        System.out.println("Erm, that isn't a valid option. 🤓🤓🤓");
      }

    } while(!interactWithIngredient && !talkWithIngredient);

    System.out.println("Wowzers");

    input.close();

  }
}
