package Arrays;

public class Assignment6 {

	public static void main(String[] args) {
		int[] arr1 = {48, 55, 68, 88, 101, 122};
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - i - 1; j++) {
				if (arr1[j] > arr1[j + 1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
	}
}
