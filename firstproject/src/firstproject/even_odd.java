package firstproject;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1234567890;

		int evencount = 0;
		int oddcount = 0;

		while (a > 0) {

			int rem = a % 10;

			if (rem % 2 == 0) {
				evencount++;
			} else {
				oddcount++;

			}
			a = a / 10;
		}
		System.out.println("even count is " + evencount);
		System.out.println("odd count is " + oddcount);
	}

}
