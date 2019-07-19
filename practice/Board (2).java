import java.util.Arrays;

public class Board
{
   private int[][] board;
   private boolean winner;
   public int count = 0;
      
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
         count++;   
         return false;
      }
      else
      {
         board[row][col] = playerNumber;
         return true;   
      }
   }
   
   public boolean getWinner(int playerNumber)
   {
      //diagonal ascending win condition 
      for(int row = 3; row < 6; row++){
         for(int column = 0; column < 4; column++){
            if(this.board[row][column] == playerNumber && this.board[row-1][column+1] == playerNumber && 
               this.board[row-2][column+2] == playerNumber && this.board[row-3][column+3] == playerNumber){
               return true;
            }   
         }
      }
      
      //descending diagonal win condition
      for(int row = 3; row < 6; row++){
         for(int column = 3; column < 4; column++){
            if(this.board[row][column] == playerNumber && this.board[row-1][column-1] == playerNumber &&
               this.board[row-2][column-2] == playerNumber && this.board[row-3][column-3] == playerNumber){
               return true;
            }   
         }
      }
      //horizontal check win condition
      for(int row = 0; row < 6 ; row++ ){
         for(int column = 0; column < 4; column++){
            if(this.board[row][column] == playerNumber && this.board[row][column+1] == playerNumber && 
               this.board[row][column+2] == playerNumber && this.board[row][column+3] == playerNumber){
               return true;
            }           
         }
      }
      
      //vertical check win condition
      for (int row = 0; row< 3; row++ ){
         for (int column = 0; column < 6; column++){
            if (this.board[row][column] == playerNumber && this.board[row+1][column] == playerNumber && 
               this.board[row+2][column] == playerNumber && this.board[row+3][column] == playerNumber){
               return true;
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