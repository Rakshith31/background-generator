import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		int i = s1.length();
		String s2 = "";
		while(i != 0) {
			s2 += s1.charAt(i - 1);
			i--;
		}
		System.out.println(s2);
	}

}
