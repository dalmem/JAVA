package quiz;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		int a =0;
		while(a<5) {
			Scanner scan = new Scanner(System.in);

			System.out.print("점수 > ");
			int point = scan.nextInt();

			switch (point/10) {
			case 9:				
				if(point%10>=5) {
					System.out.println("A+학점");
				}else
					System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;

			default:
				if(point ==100)	
					System.out.println("A+학점");
				else if(point > 100 || point <0)
					System.out.println("잘못된 수치입니다");				
				else
					System.out.println("F학점");
				break;
			
			}
			a++;
		}
	}
}	
