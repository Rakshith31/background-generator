import java.util.Scanner;

public class Assignment12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		boolean PrimeFlag = false;
		for(int i = 2; i <= num/2; ++i) {
			if(num % i == 0) {
				PrimeFlag = true;
				break;
			}
		}
		if(PrimeFlag) {
			System.out.println(num + " is not prime");
		}
		else {
			System.out.println(num + " is prime");
		}
	}
}
