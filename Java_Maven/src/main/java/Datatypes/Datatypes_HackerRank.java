package Datatypes;

import java.util.Scanner;

public class Datatypes_HackerRank {
	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check datatypes");
		int t = sc.nextInt();
		//sc.close();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (Long.MIN_VALUE <= x && Long.MAX_VALUE >= x) {
					if (Integer.MIN_VALUE <= x && Integer.MAX_VALUE >= x) {
						if (Short.MIN_VALUE <= x && Short.MAX_VALUE >= x) {
							if (Byte.MIN_VALUE <= x && Byte.MAX_VALUE >= x) {
								System.out.println("* byte");
								System.out.println("* short");
								System.out.println("* int");
								System.out.println("* long");
							} else {
								System.out.println("* short");
								System.out.println("* int");
								System.out.println("* long");
							}
						} else {
							System.out.println("* int");
							System.out.println("* long");
						}
					} else {
						System.out.println("* long");
					}

				} else {
					System.out.println(x + " can't be fitted anywhere.");
				}

			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}

}
