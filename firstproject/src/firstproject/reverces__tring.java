package firstproject;

public class reverces__tring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCD";

		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}

		System.out.println("reverce string using concateantion  is " + rev);

		char a[] = str.toCharArray();
		String revv = "";
		for (int i = len - 1; i >= 0; i--) {
			revv = revv + a[i];

		}
		System.out.println("reverce string using array  is " + revv);
	}

}
