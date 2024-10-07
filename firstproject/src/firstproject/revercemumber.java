package firstproject;

import java.util.Scanner;

public class revercemumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" enter number");
		int num = scanner.nextInt();
		int numm = num;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		// 2 logic

		StringBuffer revv;

		StringBuffer st = new StringBuffer(String.valueOf(numm));
		revv = st.reverse();
		System.out.println(" using string buffer " + revv);

		StringBuilder revvv;

		StringBuilder sb = new StringBuilder();
		sb.append(numm);
		sb.reverse();
		System.out.println(" using string builder " + sb);

	}
}
