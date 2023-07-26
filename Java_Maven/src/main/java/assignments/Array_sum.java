package assignments;

public class Array_sum {

	public static void main(String[] args) {

		int array[] = { 1, 4, 3, 5, 9 };

		int large = array[0], small = array[0];

		for (int i = 0; i < array.length; i++) {

			if (large > array[i]) {

				large = array[i];
			} else {

				small = array[i];
			}
			
			if (large == array[i]) {
				
			}
		}

	}

}