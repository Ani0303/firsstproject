package firstproject;

public class palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABA";
		String rev = "";
		String newstr = str;
		String revv = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		System.out.println(rev);

		if (newstr.equals(rev)) {
			System.out.println("given string is palindrome " + rev);
		} else {
			System.out.println("given string is not palindrome " + rev);

		}

		char a[] = str.toCharArray();

		for (int i = len - 1; i >= 0; i--) {

			revv = revv + a[i];
		}

		if (newstr.equals(revv)) {
			System.out.println("given string is palindrome " + revv);
		} else {
			System.out.println("given string is not palindrome " + revv);

		}

	}

}
