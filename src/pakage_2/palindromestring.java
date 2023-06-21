package pakage_2;

public class palindromestring {

	public static void main(String[] args) {
		
		String name = "akash";
		String reverse = "";
		for (int i=name.length()-1; i>=0; i--) {
			
			char leter = name.charAt(i);
			reverse = reverse+leter;
			
		}
		System.out.print(reverse);
	}

}
