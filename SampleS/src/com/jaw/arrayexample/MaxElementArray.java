package com.jaw.arrayexample;

import java.util.Arrays;
import java.util.Collections;

//Q.3.	Find the max element from the given int array?
public class MaxElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = {2,45,67,1};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(arr[0]);
	}

}
