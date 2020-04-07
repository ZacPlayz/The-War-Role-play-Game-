// Howdy! This is a rolelpay game I made. I hope youlike it, and please, for Everythings sake, upvote this game, ok?????
//Thanks!!!!!!!!!!!!!!!!!!!!
//Programmer: @ZacPlayz
//Reason: Lmao I guess for people to play it.
//Started: 03.04.2020 (That's Third of April, 2020)
//Finished:NAN
//Guys this is just a DEMO of my game, and I'm stll working on it, giving it new routes and stuff, so i have only two finished routes. The first is:
//1
//1
//The second is:
//2
//3
//Have fun, and you can fork this game if you want, and make it better and stuff. Play around with the code!!! If you come up with a game with my code, please link me to your post! @ZacPlayz


import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;


public class Main 
{
  public static void main(String[] args) 
  {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    intro();
  }

  public static void intro()
  {
    int onward;
    Scanner myScanner = new Scanner(System.in);
		System.out.println("THE WAR");
    System.out.println("This roleplay game is about a U.S. soldier in WW3, or World War 3.");
    System.out.println("He has a family; a wife, and two little toddlers.");
    System.out.println("YOU will control what he does, and the sequence of that.");
		System.out.println("YOU will EITHER lead him to WINNING THE BATTLE, or LOSING THE BATTLE DYING.");
		System.out.println("His life is at RISK!");
    System.out.println("WHAT would you do to lead him to winning the battle of Hubme?");
    System.out.println("It is completely YOUR choice!");
		System.out.println("Now, this game is made by ME, in other words @ZacPlayz.");
    System.out.println("Be SURE to upvote this game.");
		System.out.println("NOW good luck. #Goodluck");
		
    System.out.println("Press 1 to continue");

    onward = myScanner.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();

    start();
  }

  public static void start()
  {
    int choice;

    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Daniel, the U.S. soldier, looks around at the people in position. Even though Venezuela does not have that strong of an economy, their military is extremely hard to defeat.");
    System.out.println("Daniel is  General-assistent, which means he commands his people. One of his people bring out two rifles: an AK47, and an M4A1-S to choose from.");
    System.out.println("Daniel furrows his eyebrows. He is better with the AWP or Scout. But they are already occupied.");
    System.out.println("The AK47 has extremely strong damage, though it has high recoil and less control. The M4A1-S on the other hand has half damage, less recoil, and higher control.");
    System.out.println("What do you choose?");
    System.out.println("1. AK47");
    System.out.println("2. M4A1-S");

    choice = myScanner.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    if(choice == 1)
    {
      goFlag();
    }
    if(choice == 2)
    {
      goStraight();
    }
  }


//if choose AK47
  public static void goFlag()
  {
    int choice;
    
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Daniel decides to take the AK47. He thinks that in the battle it would be better to have more damage than more aim, since the Venezuelan army is huge.");
    System.out.println("Suddely the War Horn blares. The battle begins.");
    System.out.println("Daniel sees the huge Venezuelan army march up the hill-park 'Hubme'. He feels a sudden flow of adrenalin as he squeezes into a trench, resting his AK47 on his shoulder. ");
		System.out.println("The armies don't move; in fact they are barely breathing. Daniel yells 'Fire!', and his troops all take a deep breath and press the trigger. ");
		System.out.println("The battlefield is now full fledged; Daniel sees one of his troops get shot out of his trench. Daniel grabs a headset to prevent the loud BOOM of hundreds of guns. He grabs his AK47 again, but sees a Venezuelan soldier 1creep up to one of the U.S. trenches on the sides of the battlefields where the AWPs and Scouts were. The Venezuelan soldier had a Deagle in his hand, which would prove that an AWP against a Dealge is useless. There were at least a thousand U.S. troops in that trench. The Venezuelan soldier was going to kill them.");
		System.out.println("He has a choice: try to not die while getting out of his trench and try to save almost a thousand souls by killing or captivating the Venezuelan soldier, or to just stay where he his and hope that there are handguns in the automated rifle trench.");
    System.out.println("1. Go berserk and yolo and run out of your trench yelling and shooting at the Venezuelan soldier.");
    System.out.println("2. Stay put and hope that the AWP section has some handguns.");
    choice = myScanner.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    if (choice == 1)
    {
      goYOLO();
    }
    if(choice == 2)
    {
      goSTAY();
    }
  }


//if choose M4A1-S
  public static void goStraight()
  {
    int choice;
    
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Daniel decides to take the M4A1-S because one bullet is enough damage for a human. Plus if the leader or General of the Venezuelan army shows up, Daniel will be able to headshot him easily. ");
    System.out.println("Suddenly, the Venezuelan army peeks up from the horizon. They seem to be armed mainly with machine handguns. Though what kind? Daniel peers at the guns with slitted eyes. CZ-75, Glock-18, AK47 Handgun. Ok, not tat bad.");
    System.out.println("Without a signal, the Venezuelan army takes fire. Ok, Venezuela, you want sudden, here you have sudden. Daniel yells in his intercomm 'Okay boys, lets surrise them. Fire after  3... 2... 1...' Daniels' stroops return the sudden fire of Venezuela by rapid shots one after the other in perfect simbiosa. ");
    System.out.println("Daniel sees the General of the Venezuelan army stick out his head, obviously looking around to see if Daniel is around. Daniel purses his lips; he has a choice; try to headshot the General, or to just wait for a better oppurtunity. Or, to just tell somebody else from his army to take the decision.");
    System.out.println("1. Try to headshot the General of the Venezuelan army");
    System.out.println("2. Wait for a better oppurtunity.");
    System.out.println("3. Tell one of his troops to decide what to do");

    choice = myScanner.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    if(choice == 1)
    {
      headGeneral();
    }
    if(choice == 2)
    {
      waitGeneral();
    }
    if(choice == 3)
    {
      giveChoice();
    }
  }

  public static void goSTAY()
  {
    int choice;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Daniel hopes that the rifles have a handgun, and looks back to the battle field. he mows down 55 Venezuelan soldiers and decides to see how his troops are doing. Luckily they had a USP-S and kept campive the Venezuelan soldier.");
    System.out.println("After a long day of battle, the night creeps up and darkness fills up the sky. ");
    System.out.println("Daniel goes to sleep.");
    System.out.println("He suddenly wakes up when somebody quietly jumps into his trench. Daniel grabs his Hunter Knife, and creeps forward.");
    System.out.println("He suddenly sees his Venezuelan friend he got to know from the internet before the war.");
    System.out.println("Puerto, his friend, is handling a Deagle that is aimed at Daniels head.");
    System.out.println("'Don't move and don't cry for help' hissed Puerto 'Casara will pay me well for an assistant- General.' (Casara is the President of Venezuela). ");
		System.out.println("Daniel can't believe his ears; his friend is a TRAITOR.");
		System.out.println("In sudden adrenalinfrom the anger, Daniel jumps forward and grabs the Deagle before Puerto could react. Daniel aims the Deagle at Puerto's head.");
    System.out.println("1. Kill Puerto");
		System.out.println("2. Keep him captive.");

    choice = myScanner.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    if(choice == 1)
    {
      goKillpuerto();
    }
    if(choice == 2)
    {
      goCaptivatepuerto();
    }
  }

  public static void goYOLO()
  {
    int choice;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Daniel rushes out of his trench yelling curses at the Venezuelan soldier, shooting like a madman. The Venezuelan army just takes aim and headshot! he's dead.");
    System.out.println("Afterwards the battle of Hubme is won by the Venezuelan army, and is now a colony of Venezuela.");
    System.out.println("@_@ seriously??? Play again and this time dont kill my main character -_- OK?");
		System.out.println("Press 1 to play again");
    System.out.println("Press 2 to quit");

    choice = myScanner.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    if(choice == 1)
    {
      intro();
    }
  }

  public static void goKillpuerto()
  {
    int choice;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Daniel hisses curses at Puerto and slits Puerto's throat. ");
    System.out.println("Daniel was so angry that he grabs a grenade and throws it at the Venezuelan trenches, yelling 'KILL THEM! KILL THE TRAITORS!!!'");
    System.out.println("All of his troops wake up quickly and grab their guns. The Venezuelan troops are still very sleepy and get up slowly, which Daniel saw as an option. ");
    System.out.println("WHAT DOES HE CHOOSE????");
    System.out.println("1. Wait for a better oppurtunity");
    System.out.println("2. Try to headshot.");

    choice = myScanner.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    if(choice == 1)
    {
      waitOppurtunity();
    }
    if(choice == 2)
    {
      tryHeadshot();
    }
  }

  public static void goCaptivatepuerto()
  {
    int choice;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Press 1 to play again.");
    System.out.println("Press 2 to quit");

    choice = myScanner.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    if(choice == 1)
    {
      intro();
    }
  }

  public static void waitGeneral()
  {
    int choice;
    Scanner myScanner = new Scanner(System.in);

    System.out.println();
    System.out.println("");
    System.out.println();
    System.out.println("");
    System.out.println("Press 1 to play again.");
    System.out.println("Press 2 to quit");

    choice = myScanner.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    if(choice == 1)
    {
      intro();
    }
  }

  public static void headGeneral()
  {
    int choice;
    Scanner myScanner = new Scanner(System.in);

    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Press 1 to play again.");
    System.out.println("Press 2 to quit");
    choice = myScanner.nextInt();
    System.out.print("\033[H\033[2J");
    System.out.flush();
    if(choice == 1)
    {
      intro();
    }
  }
  public static void giveChoice()
	{
   
	 int choice;
	 Scanner myScanner = new Scanner(System.in);
  
  System.out.println("The soldier aims and headshot!");
	System.out.println("The General of the Venezuelan army is dead.");
	System.out.println("The Venezuelan army, when they see that their General is dead, after  battle of 45 mins they surrender. The battle of Hubme is won by the U.S. army. Daniel and the soldier who killed the General got the silver Cross of Bravery by the President.");
	System.out.println("$_$ Nice #YouAreDaBest");
  System.out.println("Press 1 to play again.");
	System.out.println("Press 2 to quit.");
	choice = myScanner.nextInt();
	System.out.print("\033[H\033[2J");
	System.out.flush();
	if(choice == 1)
  { 
    intro();
	} 

	}





}

