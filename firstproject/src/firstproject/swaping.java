package firstproject;

public class swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 10;

		System.out.println("before the number are " + a + (" ") + b);

		// logic first

		int t = a;
		a = b;
		b = t;

		System.out.println(a + " " + b);

		// logic second

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a + " " + b);

	}

}
