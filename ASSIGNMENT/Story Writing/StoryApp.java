/*****************************
* Aurthor : Nimesh Subedi
* Story App
******************************/

import java.util.ArrayList;
import java.util.Scanner;

public class StoryApp
{
   private ArrayList<String> Words = new ArrayList<>();
   private Scanner input = new Scanner(System.in);
   
   public void scenario1()
   {
      
      System.out.print("Adjective: ");
      Words.add(input.nextLine());
      System.out.print("Animal: ");
      Words.add(input.nextLine());
      System.out.print("Best Friend: ");
      Words.add(input.nextLine());
      System.out.print("Food: ");
      Words.add(input.nextLine());
      System.out.print("Noun: ");
      Words.add(input.nextLine());
      System.out.print("Past Tense Verb: ");
      Words.add(input.nextLine());
      System.out.print("Plural Noun: ");
      Words.add(input.nextLine());
      System.out.print("TV Show: ");
      Words.add(input.nextLine());
      System.out.print("Teacher's Name: ");
      Words.add(input.nextLine());
      System.out.print("Verb #1: ");
      Words.add(input.nextLine());
      System.out.print("Verb #2: ");
      Words.add(input.nextLine());
      System.out.println();
      
      System.out.printf("I just hate it when:%n Mom serves " + Words.get(3) + " for dinner.%n My pet " +
       Words.get(1) + " chews my " + Words.get(4) + ".%n " + Words.get(8) + " gets mad at the class for being " + Words.get(0) +
        ".%n My best friend " + Words.get(2) + " decides to " + Words.get(10) + " with somebody else.%n I get " + Words.get(5) +
         " for something I didn't do.%n Dad makes me wear " + Words.get(6) + " to school.%n My favorite TV show " + Words.get(7) +
          " gets canceled because the station has to broadcast a news conference.%n People " + Words.get(9) +
           " into my bedroom without knocking.%n%n");
   }
   public void scenario2()
   {
      System.out.println("hello2");
   }
   public void scenario3()
   {
      System.out.println("hello3");
   }
}