
public class Assignment16 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Please enter an integer number");
			System.exit(0);
		}
		else {
			int val = Integer.parseInt(args[0]);
			for(int i = 1;i <= val; i++) {
				int j = i;
				while(j != 0) {
					System.out.print("* ");
					j--;
				}
				System.out.println();
			}
		}
	}
}
