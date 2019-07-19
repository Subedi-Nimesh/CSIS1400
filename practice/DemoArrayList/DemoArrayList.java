/****************************
* Author: Nicholas and Jared
* Demo Array List
*****************************/

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList
{
   public static void main(String[] args)
   {
      ArrayList<String> colors = new ArrayList<>();
      colors.add("Red");
      colors.add("Blue");
      colors.add("Yellow");
      colors.add("Green");
      
      System.out.println(colors);
      colors.remove("Blue");
      int index = colors.indexOf("Green");
      System.out.println("index of green: " + index);
      System.out.println("contains red: " + colors.contains("Red"));
      System.out.println("First colors: " + colors.get(0));
      System.out.println("number of elements: " + colors.size());
      for (int i = 0; i < colors.size(); i++)
      {
         System.out.print(colors.get(i) + " ");
      }
      
      System.out.println();
      String[] colors2 = {"red", "yellow", "blue"};
      System.out.println("Colors2: " + Arrays.toString(colors2));
      colors.set(0, "pink");
      colors2[0] = "pink";
      System.out.println("last element of colors: " + colors.get(colors.size()-1));
      System.out.println("last element of colors2: " + colors2[colors2.length - 1]);
      System.out.println("colors: " + colors);
      System.out.println("colors2: " + Arrays.toString(colors2));
      
      colors2[0] = colors.get(colors.size()-1);
      System.out.println("colors2: " + Arrays.toString(colors2));
   }
}