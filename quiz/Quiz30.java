package quiz;

import java.util.Arrays;

public class Quiz30 {

	public static void main(String[] args) {
		
		int[] arr = {5, 23, 1, 43, 100, 200, 40};//길이가 7
//		int tmp ;
//		//선택정렬 
//		for (int i = 0; i < arr.length; i++) {
//			
//			for (int j = i+1; j < arr.length; j++) {
//				
//				if (arr[i] < arr[j]) {
//					System.out.println(Arrays.toString(arr));
//					tmp = arr[i];
//					arr[i]= arr[j];
//					arr[j]=tmp;
//					
//					
//				}
//			}
//						
//		}
		Arrays.sort(arr);		
		System.out.print(Arrays.toString(arr));
	}
}
