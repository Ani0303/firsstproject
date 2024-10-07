package firstproject;

public class countno_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 12345;
		String s = String.valueOf(a);
		int len = s.length();

		int count = 0;

		while (a > 0) {

			a = a / 10;
			count++;

		}
		System.out.println(count);
		System.out.println(len);
	}

}
