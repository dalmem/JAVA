package quiz;


import java.util.Scanner;

public class Quiz13 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 > ");
		int num = scan.nextInt();
		
		System.out.print("연산을 선택하세요['+', '-', '*', '/']> ");
		String a = scan.next();
		
		System.out.print("정수2 > ");
		int num2 = scan.nextInt();
		
		switch (a) {
		case "+":
			System.out.println("두수의 덧셈은 : " +(num + num2));
			break;
		case "-":
			System.out.println("두수의 뺄셈은 : " +(num - num2));
			break;
		case "*":
			System.out.println("두수의 곱셈은 : " +(num * num2));
			break;
		case "/":
			System.out.println("두수의 나눗셈은 : " +(num / num2)+ " 나머지는 : "+(num%num2));
			break;
		default:
			System.out.println("사칙연산 기호를 입력해 주세요");
			System.out.print("['+', '-', '*', '/']");
			
		}
		
	}
}
