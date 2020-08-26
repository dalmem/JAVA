package quiz;

import java.util.Scanner;

public class Quiz28 {

	public static void main(String[] args) {

		/*
		 *1. 가로, 세로를입력 받습니다
		 *2. 가로 길이, 세로길이의 사각형을 출력하면 됩니다
		 *3. 단, 윤곽만 나타나도록 처리합니다
		 *조건 : 첫행, 마지막 행에 출력, 첫열 마지막 열에 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("가로> ");
		int a = scan.nextInt();
		System.out.print("세로> ");
		int b = scan.nextInt();
		for (int i = 0; i < b; i++) {


			for (int j = 0; j < a; j++) {

				if (1<=i && i<b-1 && j>0 && j<(a-1)) {
					System.out.print(" ");	
				}else
					System.out.print("*");
			}
			System.out.println();
		}
	}



}

