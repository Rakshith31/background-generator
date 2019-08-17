import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if(num > 0) {
			System.out.println(num + " is positive");
		}
		if(num < 0) {
			System.out.println(num + " is negetive");
		}
		if(num == 0) {
			System.out.println(num + " is zero");
		}
	}

}
