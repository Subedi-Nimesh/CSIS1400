/**********************************
* Author: Isaac Covarrubias
* Game Board
***********************************/
 
public class ConnectBoard
{
  public static void main (String[] args)
  {
    //Board pattern
    String[][] board = createPattern();
    printPattern(board);
  }
  
  //We need to first create the basic visual pattern 
  public static String[][] createPattern()
  {
    //a 2D array of 7 rows and 15 columns because
    //there's an extra row to show the ___ at the bottom
    //and you have double the columns that show | | | 
    //between each number 
     String[][] board = new String[7][15];
    
    //loop over each row from up to down
    for(int i = 0; i < board.length; i++)
    {
      
       //loop over each column from left to right
       for(int j = 0; j < board[i].length; j++)
      {
        //it is always the even column
        //that has the border and the odd column
        //between them that will be either empty or
        //have a number 
        if(j % 2 == 0) board[i][j] ="|";
        else board[i][j] = " ";
        
        //lowest row
        if(i == 6) board[i][j]= "-";
      }
      
    }
    return board;
  }
  
  //printing our game
  public static void printPattern(String[][] board)
  {
    for(int i = 0; i < board.length; i++)
    {
      for(int j = 0; j < board[i].length; j++)
      {
        System.out.print(board[i][j]);
      }
      System.out.println();
    }
  }
} 