import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		int i = s1.length();
		String s2 = "";
		while(i != 0) {
			s2 += s1.charAt(i - 1);
			i--;
		}
		if(s1.equals(s2)) {
			System.out.println(s1 + " is a palindrome");
		}
		else {
			System.out.println(s1 + " is not a palindrome");
		}
	}

}
