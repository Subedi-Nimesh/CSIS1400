import java.util.Arrays;

public class Board
{
   private int[][] board;
   private boolean winner;
      
   public Board()
   {
      board = new int[6][7];
   }   
   
   private int validateRow(int col)
   {
      for(int row = board.length - 1; row > -1; row--)
      {
         if(board[row][col] == 0)
         {
            return row;
         }
      }
      return -1;
   }
   
   public boolean dropChip(int col, int playerNumber)
   {
      int row = validateRow(col);
      if(row == -1)
      {   
         return false;
      }
      else
      {
         board[row][col] = playerNumber;
         return true;   
      }
   }
   
   public boolean getWinner()
   {
      for(int i = 0; i < 6; i++)
      {  
               
         for(int j = 0; j < 7; j++)
         {
            if(board[i][j] == 1){
            
               // this states that if you get a four on the horizontal row you win
               if(board[i][j + 1] == 1 && board[i][j + 2] == 1 && board[i][j + 3] == 1){ //&& board[i += 2][j] == 1 && board[i += 3][j] == 1){
                  return true; 
               }
               // this states that if you get a four on the vertical row you win
               if(i < 3){
                  if(board[i + 1][j] == 1 && board[i + 2][j] == 1 && board[i + 3][j] == 1){ //&& board[i += 2][j] == 1 && board[i += 3][j] == 1){
                     return true; 
                  }              
               
               }
            
               
                                                     
            }
            // this states that if you get a four on the horizontal column you win
            else if(board[i][j] == 2){
               if(board[i][j + 1] == 2 && board[i][j + 2] == 2 && board[i][j + 3] == 2){ //&& board[i += 2][j] == 1 && board[i += 3][j] == 1){
                  return true; 
               }
            // this states that if you get a four on the vertical column you win
               if(i < 3){
                  if(board[i + 1][j] == 2 && board[i + 2][j] == 2 && board[i + 3][j] == 2){ //&& board[i += 2][j] == 1 && board[i += 3][j] == 1){
                     return true; 
                  }              
               
               
               }
            //todo
            }
         }
      }
        
      return false;
   }
   
   @Override
    public String toString() {
         
      String print = "";
      for(int row = 0; row < board.length; row++)
      {
         print += "\n|";
         for(int col = 0; col < board[0].length; col++)
         {
            if(board[row][col] == 1){
               print += "X|";
            }
            else if(board[row][col] == 2) {
               print += "0|";
            }
            else {
               print += "_|";   
            }   
         }
      }      
      print += "\n 1 2 3 4 5 6 7";
      return print;
   }
}