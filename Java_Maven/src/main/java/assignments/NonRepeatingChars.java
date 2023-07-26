package assignments;

public class NonRepeatingChars {

	public static void main(String[] args) {

		String str = "aaaaaaa";

		int res = nonrepeatingchars(str);

		System.out.println("Given String : " + str);

		System.out.println("Output : " + res);

	}

	public static int nonrepeatingchars(String str) {

		String str2 = str.toLowerCase();

		char ch[] = str2.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			for (int j = 1; j < ch.length; j++) {

				if (ch[i] != ch[j]) {

					return str2.indexOf(ch[j]);

				}

			}

		}
		return -1;

	}

}
