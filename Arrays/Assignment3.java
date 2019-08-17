package Arrays;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr1 = {1, 3, 10, 20, 4, 2};
		System.out.println("Enter the element to be searched:");
		int ele = in.nextInt();
		int index = -1;
		for(int i = 0; i < arr1.length; i++) {
			
			if(arr1[i] == ele) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}

}
