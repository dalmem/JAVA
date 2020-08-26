package quiz;

import java.util.Scanner;

public class Quiz08 {
//	1. 양의 정수를 입력 받아 짝수 라면 “x 는 짝수 입니다” , 홀수 라면 “x는 홀수 입니다” 를 출력하세요.
//	2. 0이라면 “0입니다“
//	3. 음수 라면 “음수 입니다“ 를 출력하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		System.out.print(">");
		int num = scan.nextInt();
		if(num >= 0) {
			if(num ==0) {
				System.out.println("입력한 정수는 0입니다");}
			else if(num%2==0)
				System.out.printf("%d은(는) 짝수입니다",num);
			else
				System.out.printf("%d은(는) 홀수입니다.",num);
		
		}else {
			System.out.printf("%d은(는) 음의 정수입니다.",num);
		}
		
	}
}
