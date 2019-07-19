/********************************************
* Author: Nimesh Subedi
* determine wheter a square of numbers is a magic square
*********************************************/

public class MagicSquare
{
   public static void main(String [] args)
   {
      int[][] square = 
         {
         {8, 11, 14, 1},
         {13, 2, 7, 12},
         {3, 16, 9, 6},
         {10, 5, 4, 15}
         };
      
      System.out.printf("The square %s a magic number. %n",
         (isMagicSquare(square) ? "is" : "is not"));   
   }
   
   // determine whether the square is a magic square
   private static boolean isMagicSquare(int[][] square)
   {
      if(!isSquare(square))
         return false;
         
      int n = square.length;   
      int total = totalSum(square[0]);
            
      // check that row has to sum up to sum
      for(int i = 1; i < n; i++)
      {
         if(totalSum(square[i]) != total)
            return false;
      }
      
      // check that each column add up to sum.
      for(int i = 1; i < n; i++)
      {
         int sum= 0;
         for(int j = 0; j < n; j++)
         {
            sum += square[j][i];
         }
         
         if (sum!= total)
            return false;
      }
      
      // check that diagonal \ add up to sum.   
      int rightDiaganol = 0; 
      for (int i = 0; i < n; i++)
      {
         rightDiaganol += square[i][i];  
      }
      if (rightDiaganol != total)
      return false;
        
      // check that diagonal / add up to sum.
      int col = n - 1; 
      int leftDiaganol= 0; 
      for (int i = 0; i < n; i++)
      {           
         leftDiaganol += square[i][col--];  
      }
      if (leftDiaganol != total)
      return false;
   
      return true;   
   }
   
   private static int totalSum(int[] row)
   {
      int sum = 0;
      for(int el : row)
      {
         sum += el;
      }  
      return sum;
   }
   
   private static boolean isSquare(int[][] a)
   {
      int n = a.length;
      
      for(int[] row : a)
      {
         if(row.length != n)
            return false;
      }
      return true;
   }
}