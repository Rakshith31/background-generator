
public class Assignment3 {

	public static void main(String[] args) {
		int arg_length = args.length;
		if(arg_length == 0) {
			System.out.println("No Values");
		}
		else {
			for(String i : args) {
				System.out.print(i + ",");
			}
		}
	}

}
