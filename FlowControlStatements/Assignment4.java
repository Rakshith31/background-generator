import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c1 = in.next().charAt(0);
		char c2 = in.next().charAt(0);
		
		if(c1 < c2) {
			System.out.println(c1 + "," + c2);
		}
		else if(c2 < c1) {
			System.out.println(c2 + "," + c1);
		}
		else {
			System.out.println(c2 + "," + c1 + " or " + c1 + "," + c2);
		}

	}

}
