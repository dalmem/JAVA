package quiz;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		/*
		 * 정수 3개를 받아서 큰값, 중간, 작은값을 구분하면 됩니다. (단, 세값이 같은 경우는 예외로 한다 ) 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		int a = scan.nextInt();
		System.out.print("> ");
		int b = scan.nextInt();
		System.out.print("> ");
		int c = scan.nextInt();
		int max = 0, mid =0, min=0;
		
		if(a > b &&  a>c) {
			max = a;
			if(b>c) {
				mid = b;
				min = c;
			}else {
				mid = c;
				min = b;
			}
		}else if(b>a && b>c) {
			max = b;
			if(a>c) {
				mid = a;
				min = c;
			}else {
				mid = c;
				min = a;
			}
		}else if(c>a && c>b) {
			max = c;
			if(a>b) {
				mid = a;
				min = b;				
			}else {
				mid = b;
				min = a;
			}
		}
		System.out.println("max : " + max);
		System.out.println("mid : " + mid);
		System.out.println("min : " + min);
		scan.close();
	}
}
