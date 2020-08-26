package quiz;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
//		문제
//		1. 정수 2개를 입력 받으세요.
//		2. 두 수를 비교해서 “x 가 큰 수 입니다“ 를 출력 , 같은 수라면 “같은 수 입니다“ 를 출력하세요. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		System.out.print(">");
		int a  = scan.nextInt();
		System.out.print(">");
		int b  = scan.nextInt();
		
		if (a == b) {
			System.out.println("같은 수 입니다.");
		}else if (a > b) {
			System.out.printf("%d이 큰수입니다.",a);
		}else if (a < b) {
			System.out.printf("%d이 큰수입니다.",b);
			}
	}
}
