package quiz;

import java.util.Arrays;

public class Quiz25 {
	
	public static void main(String[] args) {
//		int x = 1; 
//		int y = 5;
//		int tmp ;
//		tmp = x;
//		x = y;
//		y = tmp;
//		System.out.println(x+ " " + y);
				
		//1~ 9까지 배열의 값중에 절대 중복되지 않는 숫자로 만들어진 3개의 크기의 배열을 만들어내는 프로그램 
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		
		for (int i = 0; i < arr.length; i++) {
			
			int rand = (int)(Math.random()*arr.length);
			int	tmp = arr[i];
			arr[i]=arr[rand];
			arr[rand]=tmp;
			
		}
		int[] newArr = new int[3];
		for (int i = 0; i < 3; i++) {
			newArr[i]=arr[i];
		}System.out.println(Arrays.toString(newArr));
			
		
		//for문을 다시 한번이용해서 0,1,2 인덱스 값을 새로운 배열에 옮깁니다
	}
}
