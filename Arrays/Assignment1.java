package Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		int[] arr1 = {9, 4, 5, 7, 8};
		int sum = 0;
		float avg = 0;
		for(int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		avg = (float)sum / arr1.length;
		System.out.println("Sum of the array is " + sum);
		System.out.println("Avg of the array is " + avg);
	}
}
