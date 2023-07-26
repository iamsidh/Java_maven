package Test;

import java.util.Arrays;

public class Test6{
	
	
	public static void main(String[] args) {
	    int[] arr = { 1, 2, 3, 4, 5 };
	    int[] new_arr = addLargestSmallest(arr);
	    System.out.println(Arrays.toString(new_arr));
	  }

	  public static int[] addLargestSmallest(int[] arr) {
	    // find the largest and smallest elements in the array
	    int largest = arr[0];
	    int smallest = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	      if (arr[i] > largest) {
	        largest = arr[i];
	      }
	      if (arr[i] < smallest) {
	        smallest = arr[i];
	      }
	    }

	    // add them together
	    int result = largest + smallest;

	    // create a new array with the result
	    int[] new_arr = { result };

	    return new_arr;
	  }
	
	
}
