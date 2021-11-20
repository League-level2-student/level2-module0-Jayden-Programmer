package arrays;

import java.util.Iterator;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] array = new String[5];
		String[] array1 = { "word", "e", "hi", "a", "word1" };
		// 2. print the third element in the array
		System.out.println(array1[2]);
		// 3. set the third element to a different value
		array1[2] = "hey";
		// 4. print the third element again
		System.out.println(array1[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		// 6. make an array of 50 integers
		int[] array2 = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < array2.length; i++) {
			array2[i] = new Random().nextInt(100);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int lowest = array2[0];
		for (int i = 0; i < array2.length; i++) {
			if (lowest > array2[i]) {
				lowest = array2[i];
			}
		}
		System.out.println(lowest);
		// 9 print the entire array to see if step 8 was correct

		// 10. print the largest number in the array.
		int highest = array2[0];
		for (int i = 0; i < array2.length; i++) {
			if (highest < array2[i]) {
				highest = array2[i];
			}
		}
		System.out.println(highest);
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
