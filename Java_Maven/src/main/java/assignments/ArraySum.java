package assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySum {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 6, 7, 9 };
		
		int sum = 0;

		for(int i = 0 ; i < arr.length ; i++) {
			
			sum = sum + arr[i+1];
			i++;
			break;

		}
		
		System.out.println(sum);
			
			
		}



	

}
