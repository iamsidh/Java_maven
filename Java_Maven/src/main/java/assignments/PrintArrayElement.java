package assignments;

//print array elements 

class PrintArrayElement

{
	public static void main(String[] args) {

		// create an array
		int[] numbers = { 3, 7, 5, -5 };

		// iterating through the array
		for (int number : numbers) {
			System.out.print(number);
		}
	}
}