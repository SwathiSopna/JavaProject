package com.jaw.arrayexample;

//Q.1.	Find the sum of all given elements from an int array?
public class SumAllElement {

	public static void main(String[] a) {
		int[] arr = {2,45,67,78};
		int sum =0;
		for (int i : arr) {
			sum+= i;
		}
		System.out.println(sum);
}
}
