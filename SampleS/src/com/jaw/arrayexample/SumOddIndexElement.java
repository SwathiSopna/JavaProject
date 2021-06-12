package com.jaw.arrayexample;

public class SumOddIndexElement {

	public static void main(String[] args) {

		int[] arr = {2,45,67,1,0,5,89,36};
		int index=0;
		int sum = 0;
		
		for (int intVal : arr) {
			
			if(index%2!=0) {
				sum +=intVal;
			}
			index++;
		}
		System.out.println(sum);
	}

}
