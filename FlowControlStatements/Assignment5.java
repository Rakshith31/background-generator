import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c1 = in.next().charAt(0);
		
		if((c1 >= 'a' && c1 <= 'z') || (c1 >= 'A' && c1 <= 'Z')) {
			System.out.println(c1 + " is a alphabet");
		}
		else if(c1 >= 48 && c1 <=57) {
			System.out.println(c1 + " is a digit");
		}
		else {
			System.out.println(c1 + " is a special character");
		}
	}

}
