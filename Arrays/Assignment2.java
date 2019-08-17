package Arrays;

public class Assignment2 {

	public static void main(String[] args) {
		int[] arr1 = {4, 3, 11, 9, 2};
		int min = arr1[0], max = arr1[0];
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] >= max) {
				max = arr1[i];
			}
			else if(arr1[i] <= min) {
				min = arr1[i];
			}
		}
		System.out.println("Max of array is " + max);
		System.out.println("Min of array is " + min);
	}
}
