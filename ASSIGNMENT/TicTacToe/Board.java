import java.util.Arrays;

public class Board
{
   private int[][] board;
   private boolean winner;
   private int count = 0;
   private int row;
   private int column;
   
   public Board()
   {
      board = new int[3][3];
   }   
    
   public void update(int number)
   {
       if(number == 1)
       {
          this.row = 0;
          this.column = 0;
       }else if(number == 2)
       {
          this.row = 0;
          this.column = 1;
       }else if(number == 3)
       {
          this.row = 0;
          this.column = 2;
       }else if(number == 4)
       {
          this.row = 1;
          this.column = 0;
       }else if(number == 5)
       {
          this.row = 1;
          this.column = 1;
       }else if(number == 6)
       {
          this.row = 1;
          this.column = 2;
       }else if(number == 7)
       {
          this.row = 2;
          this.column = 0;
       }else if(number == 8)
       {
          this.row = 2;
          this.column = 1;
       }else if(number == 9)
       {
          this.row = 2;
          this.column = 2;
       }
       
   }
     
   private boolean validate()
   {
       if(board[row][column] == 0)
       {
          return true;
       }
       return false;
   }
   
   public boolean dropChip(int playerNumber)
   {
      boolean val = validate();
      if(val == true)
      {
         board[row][column] = playerNumber;
         count++;
      }
      return val;
   }
   
   private int checkVertical(int playerNumber)
   {
      int upResult = checkUp(playerNumber);
      int downResult = checkDown(playerNumber);
      int total = upResult + downResult;
      return total;
   }
   
   private int checkUp(int playerNumber)
   {
      int check = 0;
      for(int i = 0; i < 3; i++)
      {
         if(row - i < 0)
         {
            break;
         }
         if (board[row - i][column] == playerNumber)
         {
            check++;
         }
         else
         {
            break;
         }
      }
      return check;
   }

   private int checkDown(int playerNumber)
   {
      int check = 0;
      for(int i = 0; i < 3; i++)
      {
         if(row + i > 2)
         {
            break;
         }
         if (board[row + i][column] == playerNumber)
         {
            check++;
         }
         else
         {
            break;
         }
      }
      return check;
   }
   
   private int checkHorizontal(int playerNumber)
   {
      int leftResult = checkLeft(playerNumber);
      int rightResult = checkRight(playerNumber);
      int total = leftResult + rightResult;
      return total;
   }
   
   private int checkLeft(int playerNumber)
   {
      int check = 0;
      for(int i = 0; i < 4; i++)
      {
         if(column - i < 0)
         {
            break;
         }
         if (board[row][column - i] == playerNumber)
         {
            check++;
         }
         else
         {
            break;
         }
      }
      return check;
   }
   
   private int checkRight(int playerNumber)
   {
      int check = 0;
      for(int i = 0; i < 3; i++)
      {
         if(column + i > 2)
         {
            break;
         }
         if (board[row][column + i] == playerNumber)
         {
            check++;
         }
         else
         {
            break;
         }
      }
      return check;
   }
   
   private int checkDownLeftToUpRight(int playerNumber)
   {
      int downLeftResult = checkDownLeft(playerNumber);
      int upRightResult = checkUpRight(playerNumber);
      int total = downLeftResult + upRightResult;
      return total;
   }
      
   private int checkDownLeft(int playerNumber)
   {
      int check = 0;
      for(int i = 0; i < 4; i++)
      {
         if(row + i > 2  || column - i < 0)
         {
            break;
         }
         if (board[row + i][column - i] == playerNumber)
         {
            check++;
         }
         else
         {
            break;
         }
      }
      return check;
   }
   
   private int checkUpRight(int playerNumber)
   {
      int check = 0;
      for(int i = 0; i < 4; i++)
      {
         if(row - i < 0 || column + i > 2)
         {
            break;
         }
         if (board[row - i][column + i] == playerNumber)
         {
            check++;
         }
         else
         {
            break;
         }
      }
      return check;
   }
   
   private int checkUpLeftToDownRight(int playerNumber)
   {
      int upLeftResult = checkUpLeft(playerNumber);
      int downRightResult = checkDownRight(playerNumber);
      int total = upLeftResult + downRightResult;
      return total;
   }
   
   private int checkUpLeft(int playerNumber)
   {
      int check = 0;
      for(int i = 0; i < 4; i++)
      {
         if(row - i < 0 || column - i < 0)
         {
            break;
         }
         if (board[row - i][column - i] == playerNumber)
         {
            check++;
         }
         else
         {
            break;
         } 
      }
      return check;
   }
   
   private int checkDownRight(int playerNumber)
   {
      int check = 0;
      for(int i = 0; i < 4; i++)
      {
         if(row + i > 2 || column + i > 2)
         {
            break;
         }
         if (board[row + i][column + i] == playerNumber)
         {
            check++;
         }
         else
         {
            break;
         }
      }
      return check ;
   }
   
   public int getWinner(int playerNumber)
   {
      if (checkVertical(playerNumber) > 3 || checkHorizontal(playerNumber) > 3 || checkDownLeftToUpRight(playerNumber) > 3 || checkUpLeftToDownRight(playerNumber) > 3)
      {
         return playerNumber;
      }
      else if(count == 9)
      {
         return 3;
      }
      else
      {
         return 0;
      }
   }
   
   @Override
    public String toString() {
         
      String print = "";
      print += "  _  _  _ ";
      for(int row = 0; row < board.length; row++)
      {
         print += "\n| ";
         for(int column = 0; column < board[0].length; column++)
         {
            if(board[row][column] == 1){
               print += "X |";
            }
            else if(board[row][column] == 2) {
               print += "0 |";
            }
            else {
               if(row == 0)
               {
                  int total = row + column + 1;
                  print += total + " |";
               } else if(row == 1)
               {
                  int total = row + column + 3;
                  print += total + " |";
               } else if(row == 2)
               {
                  int total = row + column + 5;
                  print += total + " |";
               }
            }   
         }
      }      
      print += "\n - - - \n";
      return print;
   }
}