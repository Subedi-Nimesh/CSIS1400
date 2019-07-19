/*****************************************
* Aurthor : Nimesh Subedi
* The following program is a game known as
* Connect 4.
************************************/

import java.util.Scanner;
public class Connect4App
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      Board myBoard = new Board();
      Players player = new Players();

      System.out.print("Enter the name of First player : ");
      String fName = input.next();
      Players.setName(fName);
      System.out.print("Enter the name of Second player : ");
      String sName = input.next();
      
      int playerNumber = 1;
      char chip;
      
      System.out.println(myBoard.toString());
      
      
      
      
      while(!())
      {
         System.out.print("Enter the Column to drop chip : ");
         String col = input.next();
         
         
         playerNumber = playerNumber % 2;
         if(playerNumber == 0)
            chip = 'X';
         else
            chip = 'O';
    
         if(win.getWinner() == true)
         {
            System.out.println("Congratulation! YOU WON ");
            System.out.println("Do You Want To Play Again");
         }
         playerNumber++;
      }
      public static void DropX(){
        
        int counter = 1;

        
        System.out.println("Player 1 turn");

        
        int column = scanner.nextInt();

        while(true){
            if(column > WIDTH){
                System.out.println("That's not a valid column");
                break;
            }

            if (board[BOTTOM_ROW][column] == '.') { //checks to see if space is blank, puts X there if it is
                board[BOTTOM_ROW][column] = 'X';
                break; //breaks loop after placing
            }else if(board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O'){ //if space isn't blank, checks to see if one above is
                if(board[BOTTOM_ROW - counter][column] == '.'){ //puts X if blank
                    board[BOTTOM_ROW - counter][column] = 'X';
                    break; //breaks loop after placing
                }
            }
            counter += 1; //adds one to counter if the space wasn't blank, then loops again
            if(counter == WIDTH){ //checks to see if at end of column
                System.out.println("That column is full");
                break;
            }
        }
    }


    public static void DropO(){
        
        int counter = 1;

        
        System.out.println("Player 2 turn");

        
        int column = scanner.nextInt();

        while(true){
            if(column > WIDTH){
                System.out.println("That's not a valid column");
                break;
            }

            if (board[BOTTOM_ROW][column] == '.') { //checks to see if space is blank, puts O there if it is
                board[BOTTOM_ROW][column] = 'O';
                break; //breaks loop after placing
            }else if(board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O'){ //if space isn't blank, checks to see if one above is
                if(board[BOTTOM_ROW - counter][column] == '.'){ //puts O if blank
                    board[BOTTOM_ROW - counter][column] = 'O';
                    break; //breaks loop after placing
                }
            }
            counter += 1; //adds one to counter if the space wasn't blank, then loops again
            if(counter == WIDTH){ //checks to see if at end of column
                System.out.println("That column is full");
                break;
            }
        }
    }
   }
}
