package quiz;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		int a = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("1번 정수 입력 > ");
		int num =scan.nextInt();
		int sum = 0;
		int count = 0;
				
		
		System.out.print("1번 : ");
		while(a <= num) {
			if(a % 3 ==0 || a % 4 == 0) //1번
				System.out.print(a + " ");
			
			a++;
		}
		
		a=1;
		System.out.println("");
		System.out.print("2번 정수 입력 > ");
		int num2 =scan.nextInt();
		while(a<=num2) {
			if(a % 6 == 0) {//2번
				sum +=a;
			}
			a++;
		}System.out.println("2번 : " + sum);
		a=1;
		System.out.println("================================================================");
		
		while(a<=100) {
			if( a % 4 == 0 && a % 8 != 0) {//3번
				System.out.print(a+" ");
				count++;
				
			}
			a++;
		}
		
		System.out.println("");
		System.out.println("3번 : " + count + "개");
		System.out.println("================================================================");
		a=1;
		count = 0;
		while(a<=1000) {
			if(1000 % a == 0 ) {
				count++;
				
			}
			a++;
		}
		System.out.println("4번 : " + count + "개");
	}



}


