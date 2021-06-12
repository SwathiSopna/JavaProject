package com.jaw.arrayexample;

import java.util.Arrays;
// Q.2.	Find the min element from the given int array
public class MinElementArray {

	public static void main(String[] a) {
		Integer[] arr = {2,45,67,1};
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}
}
