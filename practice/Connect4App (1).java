

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;


public class Connect4App
{
   public static void main (String[] args)
   {
      Scanner scnr = new Scanner(System.in);
      Board myBoard = new Board();
      List Column = Arrays.asList("1", "2", "3", "4", "5", "6", "7");
      
      System.out.print("Welcome! Do you want to play Connect 4(Y/N) : ");
      String choice = scnr.next();
      while(choice.equals("y") || choice.equals("Y")) {
         
         myBoard = new Board();
         System.out.print("Enter the name of player one: ");
         String firstName = scnr.next();
         System.out.print("Enter the name of player two: ");
         String secondName = scnr.next();
         
         Players player1 = new Players(firstName, 1);
         Players player2 = new Players(secondName, 2);
   
         int playerNumber = 1;
         char chip;
         int row;
         
         System.out.println(myBoard.toString());
         
         boolean gameIsOnGoing = true;
         while(gameIsOnGoing)
         {
            if(playerNumber == 1)
               System.out.print(player1.getName() + ", Enter the Column to drop chip : ");
            else   
               System.out.print(player2.getName() + ", Enter the Column to drop chip : ");
            
            String col = scnr.next();
            int count = 0; 
            count++;
            
            if(Column.contains(col))
            {
               int column = Integer.parseInt(col) - 1;
               if(myBoard.dropChip(column, playerNumber))
               {              
                  System.out.println(myBoard.toString());
                  
                  if(myBoard.getWinner(playerNumber))
                  {
                     System.out.printf("Congratulations! Player %d wins! %n", playerNumber); 
                     gameIsOnGoing = false;
                                  
                  }
                  else
                  {
                     playerNumber = playerNumber % 2;
                     if(playerNumber == 0)
                        chip = 'O';
                     else
                        chip = 'X';
                     playerNumber++;
                  }
               }
                                 else if(count == 48){
                     System.out.println("It's a Tie.");
                     gameIsOnGoing = false; 
                  } 
               else
               {
                  System.out.printf("Column %s is full. Please Try Again.%n%n", col);
               }
            }
            else
            {
               System.out.println("Invalid Input! Please Try Again.");
               continue;
            }
         }
      System.out.println("Do you want to play again? Y/N");
      choice = scnr.next();
      System.out.println();
      }
      System.out.println("Good-Bye!");
   }
}