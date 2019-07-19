import java.util.Arrays;

public class LabArraysClass 
{
	public static void main(String[] args)
	{
		int[] iArray1 = {6, 12, 3, 9};
		int[] iArray2 = new int[5];

      
      // fill iArray2 with 7
      Arrays.fill(iArray2, 7);

		// print iArray1 and iArray2 (toString)
      System.out.println("iArray1: " + Arrays.toString(iArray1));
      System.out.println("iArray2: " + Arrays.toString(iArray2));

		// search for number 9 in iArray1 and print the value returned:
      int check = 9;
      int index = Arrays.binarySearch(iArray1, check);
      System.out.println("9 in iArray1: " + index);
		
  		// sort iArray1 and print it
      Arrays.sort(iArray1);
      System.out.println("iArray1: " + Arrays.toString(iArray1));

		// search for number 9 in iArray1 and print the value returned:
      index = Arrays.binarySearch(iArray1, check);
      System.out.println("9 in iArray1: " + index);

		// create iArray3 and assign it the first 3 elements of iArray1; print it
      int[] iArray3 = Arrays.copyOf(iArray1, 3);
      System.out.println("iArray3: " + Arrays.toString(iArray3));

		// test equality of new int[] {3, 6, 9} and iArray3; print result
      boolean equals = Arrays.equals(iArray3, new int[]{3, 6, 9});
      System.out.println("iArray3 equals [3, 6, 9]: " + equals);
      
      //Reason 
      System.out.print("Reasons: If the array is not sorted, binarysearch is undefined.");
	}
}