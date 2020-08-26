package quiz;

import java.util.Arrays;

public class Quiz31 {
		
	public static void main(String[] args) {//버블정렬
		int[] arr = {5, 23, 1, 43, 100, 200, 40};//길이가 7
		int tmp;
		// 회전을 거듭할 때 마다 감소되는 조건
		for (int i = arr.length-1; i >0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j]>arr[j+1]){
					tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
			}
				
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
