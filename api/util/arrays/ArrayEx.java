package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		int[] arr = {5,4,3,2,1};
		
		
		//정렬
		Arrays.sort(arr);
		
		//확인
		System.out.println(Arrays.toString(arr));
		
		//배열의 검색 binarySearch(배열, 키값) - 선행조건 : 정렬
		int index = Arrays.binarySearch(arr,3);
		System.out.println("3이 있는 index: "+index);
		int index2 = Arrays.binarySearch(arr,111);
		System.out.println(index2);
		
		//배열 복사
		int[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(newArr));
		
		//배열복사(배열명, 시작index, 끝index)
		int[] newArr2 = Arrays.copyOfRange(arr, 2, arr.length);
		System.out.println(Arrays.toString(newArr2));
		
		
		//배열의 내부요소가 동일한지 확인
		if(Arrays.equals(arr, newArr)) {
			System.out.println("배열 요소가 같다");
		}
		
		
		
		
		
	}
}
