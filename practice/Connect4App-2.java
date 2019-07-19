

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
      
      System.out.print("Enter the name of First player : ");
      String firstName = scnr.next();
      System.out.print("Enter the name of Second player : ");
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
         
         if(Column.contains(col))
         {
            int column = Integer.parseInt(col) - 1;
            if(myBoard.dropChip(column, playerNumber))
            {              
               System.out.println(myBoard.toString());
               
               if(myBoard.getWinner())
               {
                  System.out.println("Congratulation! YOU WON ");
                  System.out.println("Do You Want To Play Again");
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
   }
}