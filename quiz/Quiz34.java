package quiz;

import java.util.Scanner;

public class Quiz34 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입해 주세요> ");
		int insert = scan.nextInt();
		
		a:while(true) {
			
			System.out.println("[1]뎀이소다: 400원, [2]밀킥스: 500원, [3]코가골라: 600원, [4]잔돈받기");
			System.out.print("음료수 선택> ");
			int sel = scan.nextInt();
			
			
			switch (sel) {
			case 1:
				if(insert<400) {
				System.out.println("잔액이 부족합니다 돈을 추가로 투입해 주세요");
				System.out.println("잔액 : "+insert + "원");
				System.out.println();
				break;
			}
				System.out.println("뎀이소다를 받았습니다.");
				insert = insert - 400;
				System.out.println("잔액 : "+insert + "원");
				System.out.println();
				
				break;
			case 2:
				if(insert<500) {
				System.out.println("잔액이 부족합니다 돈을 추가로 투입해 주세요");
				System.out.println("잔액 : "+insert + "원");
				System.out.println();
				break;
			}
				System.out.println("밀킥스를 받았습니다.");
				insert = insert - 500;
				System.out.println("잔액 : "+insert + "원");
				System.out.println();
				
				break;
			case 3:
				if(insert<600) {
					System.out.println("잔액이 부족합니다 돈을 추가로 투입해 주세요");
					System.out.println("잔액 : "+insert + "원");
					System.out.println();
					break;
				}
				System.out.println("코가골라를 받았습니다.");
				insert = insert - 600;
				System.out.println("잔액 : "+insert + "원");
				System.out.println();
				
				break;

			default:
				System.out.println("남은 금액 "+ insert+ "원을 반환합니다.");
				
				break a;
			}
			
			
		}
	}
}
