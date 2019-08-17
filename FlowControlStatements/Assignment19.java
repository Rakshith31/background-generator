
public class Assignment19 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 1000; i++) {
				if(count == 5) {
					break;
				}
				else if((i % 2== 0) && (i % 3 == 0) && (i % 5 == 0)) {
					System.out.println(i);
					count++;
				}
		}
	}
}
