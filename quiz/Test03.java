package quiz;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 2개의 정수를 입력받습니다.
		 * 2. 입력받은 값이 단순히 정수라면 두 값의 합을 출력하고 반복문을 종료합니다.
		 * 3. 입력받은 값이 문자열이라면 "정수로만 입력하세요"를 출력한 후에 다시 입력받습니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 (1) : ");
		int num = sc.nextInt();
		System.out.print("정수 입력 (2) : ");
		int num2 = sc.nextInt();
		
			
		if(num == (int)num && num2 ==(int)num2) {
			System.out.printf("%d",num+num2);
		}else if(num == (char)num && num2 ==(char)num2){
			System.out.println("정수로만 입력하세요");
		}
		
	}
}
