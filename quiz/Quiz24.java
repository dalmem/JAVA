package quiz;

import java.util.Arrays;

public class Quiz24 {
	public static void main(String[] args) {
		/*
		 * 크기가 100인 배열을 생성하고 3의 배수를 순서대로 저장
		 */
		int[]arr = new int[100];
		int a= 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=a+=3;			
		}
		System.out.println(Arrays.toString(arr));
	}
}
