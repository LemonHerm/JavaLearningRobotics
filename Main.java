package java101;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 3};
		int[] new_array = PracticeProblems.reverseArray(arr);
		System.out.println(Arrays.toString(new_array));
	}
}
