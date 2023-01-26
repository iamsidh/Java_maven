package Test;

import java.util.Scanner;

//leap year
//given year is a leap year or not. A year divisible by 400 (or) a year 
//divisible by 4 and not divisible by 100 is a leap year.
public class Test1 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Year :");
		
		Scanner sc = new Scanner(System.in);
		
		long year = sc.nextLong();
		
		sc.close();
		
		
		if(year!=0) 
		{
			if(year%400==0) 
			{
			System.out.println(year+" is leap year");
			}
			else if(year%100==0) {
				System.out.println(year+" is not leap year");
				
			}else if(year%4==0){
				System.out.println(year+" is a leap year");
			}else {
				System.out.println(year+" is not a leap year");
			}
			
		}
	}



}
