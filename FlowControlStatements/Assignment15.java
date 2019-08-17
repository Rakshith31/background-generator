import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		int sum = 0;
		for(int i = 0; i < s1.length(); i++) {
			sum = sum + Character.getNumericValue(s1.charAt(i));
		}
		System.out.println(sum);
	}

}
