import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c1 = in.next().charAt(0);
		if(Character.isUpperCase(c1)) {
			System.out.println(c1 + "->" +Character.toLowerCase(c1));
		}
		if(Character.isLowerCase(c1)) {
			System.out.println(c1 + "->" +Character.toUpperCase(c1));
		}
	}

}
