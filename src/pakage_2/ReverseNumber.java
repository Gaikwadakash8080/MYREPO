package pakage_2;

public class ReverseNumber {

	int remainder;
	int revnum = 0;

	public void method1(int number) {
		while (number != 0) {
			remainder = number % 10;
			revnum = revnum * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reverse of given number is " + revnum);
	}

	public void method2(int number) {
		int reverse = 0;
		for (; number != 0;) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reverse of given number is " + reverse);
	}

	public static void main(String[] args) {

		ReverseNumber rn = new ReverseNumber();
		rn.method1(1234);
		rn.method2(11552233);
	}

}
