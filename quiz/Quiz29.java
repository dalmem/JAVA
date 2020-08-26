package quiz;

import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		int a = scan.nextInt();
		
		int count = 0;
		int sum =0;
		for (int i = 2; i <= a; i++) {

			for (int j = 2; j <=i; j++) {

				if (i%j==0) {
					count++;
				}
			}
			if(count ==1 ) {
				System.out.print(i + " ");
				sum+=i;
			}
			count=0;
		}
		System.out.println();
		System.out.println(a+"까지 소수들의 합 : " + " = " + sum);
		
	}
}
