package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr1);
		
		for (int i = arr1[0]; i <= arr1.length; i++) {
			
			if(arr1[i]!=arr1[i]) {
				
				System.out.println(arr1[i]);
			}
			
		}
		
	}

}
