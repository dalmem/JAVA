package quiz;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * 스캐너를 통해서 정수를 입력받습니다.
		 * 1부터 해당 정수까지 소수들의 합을 구하는 코드를 작성
		 * 
		 * ex) 10을 입력받으면 2,3,5,7 의 합인 17을 출력하면 됩니다. 
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		int n = 2;
		int sum =0;
		while(n <=num) {
			for (int i = 2; i <=n ; i++) {
				if(n % i == 0) {
					
					System.out.println(i);
					
				}
			}
			++n;
		}	
	}			
}
