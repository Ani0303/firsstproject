package firstproject;

import java.util.Scanner;

public class palindromeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter no");
		int a = sc.nextInt();
		int b = a;
		int rev = 0;

		while (a != 0) {

			rev = rev * 10 + a % 10;
			a = a / 10;
		}

		System.out.println("reverse no is " + rev);
		if (b == rev) {
			System.out.println(" given no is palindrome number");
		} else {
			System.out.println(" given no is not palindrome no");
		}
	}

}
