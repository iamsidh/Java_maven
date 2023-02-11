package com.scratch.test;

import java.util.Scanner;

public class Fibbobaci {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		int c=1;
		
		System.out.println("Enter number to check fibbonaci");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		for(int i=0;i<num;i++) {
			
			a=b;
			b=c;
			c=a+b;
			
			System.out.print(a+" ");
		}
		
	}

}
