package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*input array={1,5,6,7,9}

sum = 11

Expected output return array index of sum elements

e,g {1,2}*/

public class Test3 {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 6, 7, 9 };

		int sum = 13;

		// int index=0;

		int i = 0;
		int j = 1;

		for (i = 0; i < arr.length; i++) {

			for (j = 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == sum) {
					System.out.print(i + "," + j);
				}

			}
		}

	}

}
