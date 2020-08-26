package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 > ");
		int num = scan.nextInt();
		
		int i = 0;
		int[] arr = new int[num];
		
		while(i < arr.length) {
			arr[i]=i+1;
			i++;
		}
		System.out.println("배열  arr은:"+Arrays.toString(arr));
	}
}
