package firstproject;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 123;

		int sum = 0;

		while (a > 0) {
			sum = sum + a % 10;

			a /= 10;

		}
		System.out.println(sum);
	}

}
