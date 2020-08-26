package quiz;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		//1. 7~100까지 정수 중 7의 배수를 가로로 출력
		//2. 1~100까지 정수 중 12의 배수를 가로로 출력
		//3. 1~200까지 정수중 9의 배수의 개수
		//4. 50~100까지 두 수 사이의 합
		//5. char를 이용해서 A~Z까지 가로로 출력 (char형으로  for문)
		//6. 입력받은 정수까지 팩토리얼 값 5! = 5x4x3x2x1
		
		//1
		System.out.println("1번");
		for (int i = 7; i <= 100; i+=7) {
				System.out.print(i+" ");
		}System.out.println();
		System.out.println("================================================");
		System.out.println("2번");
		for (int i = 1; i <= 100; i++) {
			if(i % 12 == 0)
				System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("================================================");
		System.out.println("3번");
		int count = 0;
		for (int i = 1; i <= 200; i++) {
			if(i % 9 ==0)
				count++;
		}
		System.out.println(count+ "개");
		System.out.println("================================================");
		System.out.println("4번");
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			sum +=i;
		}
		System.out.println("합 : " +sum);
		System.out.println("================================================");
		System.out.println("5번");
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("================================================");
		System.out.println("6번");
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 > ");
		int num = scan.nextInt();
		int a = 1;
		for (int i = num; i >0; i--) {
			a*=i;
			
		}
		System.out.println(num+"!"+" = " +a);
		System.out.println("================================================");
		
	}
}
