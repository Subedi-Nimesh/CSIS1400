
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;


public class Connect4App
{
   public static void main (String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      Board myBoard = new Board();
      List Col = Arrays.asList("1", "2", "3", "4", "5", "6", "7");
      
      System.out.print("Enter the name of First player : ");
      String firstName = scanner.next();
      System.out.print("Enter the name of Second player : ");
      String secondName = scanner.next();
      
      Players player1 = new Players(firstName, 1);
      Players player2 = new Players(secondName, 2);
   
      int playerNumber = 1;
      char chip;
      
      
      System.out.println(myBoard.toString());
      
      boolean gameIsOnGoing = true;
      while(gameIsOnGoing)
      {
         if(playerNumber == 1)
            System.out.print(player1.getName() + ", Enter the Column to Drop Chip : ");
         else   
            System.out.print(player2.getName() + ", Enter the Column to Drop Chip : ");
         
         String col = scanner.next();
         if(Col.contains(col))
         {
            int Column = Integer.parseInt(col) - 1;
            int Row = myBoard.dropChip(Column, playerNumber);
            if(Row != -1)
            {              
               System.out.println(myBoard.toString());
               int winnerResult = myBoard.getWinner(Row, Column, playerNumber);
               if (winnerResult == 1)
               {
                  System.out.printf("Congratulation %s! YOU WON %n", player1.getName());
                  System.out.println("Do You Want To Play Again");
                  gameIsOnGoing = false;
               }
               else if (winnerResult == 2)
               {
                  System.out.printf("Congratulation %s! WINNER %n", player2.getName());
                  System.out.println("Do You Want To Play Again(Y/N): ");
                  String choice = scanner.next();
                  gameIsOnGoing = false;
               }
               else if (winnerResult == 3)
               {
                  System.out.println("It's a Tie.");
                  System.out.println("Do You Want To Play Again(Y/N): ");
                  String choice = scanner.next();
                  gameIsOnGoing = false; 
               }
               else 
               {               
                  playerNumber = playerNumber % 2;
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
            System.out.println("Wrong Input! Please Try Again.");
            continue;
         }
      }
   }
}