package day03;

import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {
		
		//입력받은 수가 소수인지 판별...
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력> ");
		int num =scan.nextInt();
		
		int x = 2;
		while(num % x !=0) {//나머지가 있다면,
			
			x++;
		}
		System.out.println(num == x ? num + "은 소수입니다" : num + "은 소수가 아닙니다");
	}
}
