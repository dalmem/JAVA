package quiz;

import java.util.Scanner;

public class MethodQuiz0{
	public static void main(String[] args) {
//		System.out.println("정수 두개를 입력하세요");
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("> ");
//		int num1 = scan.nextInt();
//		System.out.print("> ");
//		int num2 = scan.nextInt();
//		
//		int result = num1 + num2;
//		
//		System.out.println("결과 : "+ result);
		
		print();
		int a = input();
		int b = input();
		int result =add(a,b);
		showResult(result);
	}
	static void print() {
		System.out.println("정수 두개를 입력하세요");
	}
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		int num = scan.nextInt();
		return num;
		
	}
	static int add(int a, int b) {
		return a+b;
	}
	static void showResult(int c) {
		System.out.println("결과 : " + c);
	}
}
