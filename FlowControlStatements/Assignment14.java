

public class Assignment14 {

	public static void main(String[] args) {
		boolean PrimeFlag = false;
		int num = Integer.parseInt(args[0]);
		if(args.length == 0) {
			System.out.println("Please enter an integer number");
			System.exit(0);
		}
		else if(num == 1) {
			System.out.println("1 is neither prime nor composite");
		}
		else if(num == 0) {
			System.out.println("0 is neither prime nor composite");
		}
		else {
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
}
