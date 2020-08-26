package day05;

import java.util.Scanner;

public class ContinueEx02 {
	public static void main(String[] args) {
		//소수의 합
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		System.out.print("정수 입력> ");
		int num = scan.nextInt();
		start:for (int i = 1; i <= num; i++) {

			count=0;
			for (int j = 1; j <= i; j++) {

				if(i%j ==0) {
					count++;

				}
				if(count > 2) {
					continue start;				
				}

			}if(count==2) {
				System.out.print(i+" ");
				sum+=i;
			}

		}
		System.out.println();System.out.println(sum);
	}
}
