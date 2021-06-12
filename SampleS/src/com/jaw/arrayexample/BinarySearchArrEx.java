package com.jaw.arrayexample;



public class BinarySearchArrEx {

	public static void main(String[] a) {
		
		int arr[] = {10,20,30,40,50,60,70,80,90,100,110};
		int findNum = 80;
		int start = 0;
		int last = arr.length - 1;
		System.out.println(" arrrs" + arr.length);
		System.out.println(" last arrrs" + arr[10]);
		
		binarySearch(arr,start,last,findNum);
		
	}

	private static void binarySearch(int[] arr, int start, int last, int findNum) {
		// TODO Auto-generated method stub
		
		int mid = (start+last)/2;
		System.out.println("midd "+ arr[mid]);
		
      while(start <= last) {
    	  if(arr[mid] < findNum) { // if 60 < 80
    		start = mid+1;  //1. 5=1 = 6// move towards right side
    	  } else if (arr[mid] == findNum) { //60 == 80
    		  System.out.println("Find the Number : "+ arr[mid]);
    		  break;
    	  }
    	  else {
    		  last = mid-1; // go left side
    	  }
    	  mid = (start+last)/2; // 6+10/2= 8
      }
      
      if(start > last) { // which means negative
    	  System.out.println("Elements not Exist");
      }
		
	}
}
