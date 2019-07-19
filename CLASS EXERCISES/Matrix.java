/***********************************
* Aurthor : Nimesh Subedi
* Demo for 2-Dimentional Array
************************************/

import java.util.Random;
public class Matrix
{
   private static final Random rand = new Random();
   
   public static void print(int[][] m)
   {
      for(int[] row : m)
      {
         for(int el : row)
         {
            System.out.printf("%3d", el);
         }
         System.out.println();
      }
   }
   
   // Creates a matrix of size that is fill with
   // random numbers between -99 and 99. 
   public static int[][] randomMatrix(int m, int n)
   {
      int[][] matrix = new int[m][n];
      for(int i = 0; i < m; i++)
      {
         for(int j = 0; j < n; j++)
         {
            matrix[i][j] = rand.nextInt(199)-99;
         }
      }
      return matrix;
   }
   
   public static int[][] Identity(int n)
   {
      int[][] matrix = new int[n][n];
      for(int i = 0; i < n; i++)
      {
         matrix[i][i] = 1;
      }
      return matrix;
   }
   
   //Test Client
   public static void main (String[] args)
   {
      int[][] m1 = {{6, 4, 24},{1, -9, 8}};
      print(m1);
      System.out.println();
      
      int[][] m2 = randomMatrix(4,5);
      print(m2);
      System.out.println();
      
      int[][] m3 = Identity(3);
      print(m3);
      System.out.println();
   }
}