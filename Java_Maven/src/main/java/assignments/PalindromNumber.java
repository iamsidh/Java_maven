package assignments;

import java.util.Scanner;

public class PalindromNumber {

    public static void main(String[] args) {

        int r; //for reminder

        int sum = 0;  // for checking number with actual number

        int temp;   // for storing actual number

        System.out.println("Enter Number :");
        
        Scanner sc = new Scanner(System.in); //Number to be checked
        
        int n = sc.nextInt();
        
        sc.close();

        temp = n;  // number assigned to temp variable

        while (n > 0) {

            r = n % 10; //reminder of number

            sum = (sum * 10) + r;

            n = n / 10;

        }

        if (temp == sum) {
            System.out.println("true"); //number is Palindrome

        } else {

            System.out.println("false"); //number is not Palindrome
        }


    }

}
