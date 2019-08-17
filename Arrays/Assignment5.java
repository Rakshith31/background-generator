package Arrays;

import java.util.Arrays;

public class Assignment5 {
	public static void main(String[] args) {
		int[] arr1 = {10, 2, 5, 7, 3, 6, 20, 13}; 
		
		Arrays.sort(arr1);
		System.out.println("Smallest two in the array: " + arr1[0] + " and " + arr1[1]);
		System.out.println("Largest two in the array: " + arr1[arr1.length-1] + " and " + arr1[arr1.length-2]);
	}
}
