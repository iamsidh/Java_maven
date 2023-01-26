package Test;

public class Test2 {

	public static void main(String[] args) {

		boolean result = true;

		int x = 9;
		
		System.out.println("Input number is :"+x);

		int expectedsum = 36;
		
		System.out.println("Expected Sum is :"+expectedsum);

		if (expectedsum == sumofnum(x)) {

			result = true;
		} else {
			result = false;
		}

		System.out.println("Final result is : "+result);

	}

	public static int sumofnum(int n) {

		int sum = 0;

		while (n > 0) {

			sum += n;
			n--;
		
		}

		System.out.println("Actual sum is : "+sum);

		return sum;
	}

}
