import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char ColorCode = in.next().charAt(0);
		switch(ColorCode) {
			case 'R' : System.out.println("Red");
						break;
			case 'B' : System.out.println("Blue");
						break;
			case 'G' : System.out.println("Green");
						break;
			case 'O' : System.out.println("Orange");
						break;
			case 'Y' : System.out.println("Yellow");
						break;
			case 'W' : System.out.println("White");
						break;
			default : System.out.println("Invalid Code");
						break;
		}
	}

}
