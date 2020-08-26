package day05;

import java.util.Scanner;

public class BreakEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int rand  = (int)(Math.random()* 9)+1;
			System.out.println("5 x " + rand +  " = ?");
			System.out.print("> ");
			int answer = scan.nextInt();
			
			if(answer == rand*5) {
				System.out.println("정답입니다");
				break;
			}else
				System.out.println("그것도 모르냐 ㅉㅉ");
			
			
		}
	}
}
