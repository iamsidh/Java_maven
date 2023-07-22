package Test;

public class palidromNumber {

	public static void palidrom(int n) {

		int temp = n;
		int rev = 0;

		while (n > 0) {

			int dig = n % 10;
			rev = rev * 10 + dig;
			n = n / 10;
		}

		if (temp == rev) {

			System.out.println("Number is Palidrom");
		} else {

			System.out.println("Number is not palidrom");
		}

	}
	
	public static void main(String[] args) {
		palidrom(56);
		
	}

}
