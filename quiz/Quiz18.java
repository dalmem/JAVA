package quiz;

import java.util.Scanner;

public class Quiz18 {
	
	public static void main(String[] args) {
		int sum =0;
		boolean i = true;
		Scanner scan = new Scanner(System.in);
		
		while(i) {
			
			System.out.print("정수 입력> ");
			int num = scan.nextInt();
			
			sum += num;
			
			if(num == 0)
				i=false;
		}System.out.println("합계 > " + sum);
	}
}
