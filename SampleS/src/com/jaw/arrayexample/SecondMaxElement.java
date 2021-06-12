package com.jaw.arrayexample;

import java.util.Arrays;
import java.util.Collections;

//Q.5.	Find the 2nd max element from the given int array?
public class SecondMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = {2,45,67,1,0,5,89};
		//reverse(arr,arr.length);
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(arr[1]);
		
	}

}
