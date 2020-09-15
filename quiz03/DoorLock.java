package quiz03;

import java.util.Scanner;

public class DoorLock{

	int pw;
	int index;
	Scanner scan = new Scanner(System.in);
	int insert;
	int menu;

	void Setpw() {
		System.out.println("===============비밀번호 셋팅============");
		System.out.print("비밀번호 입력 > ");
		insert = scan.nextInt();
		pw = insert;
		System.out.println("완료");
	}
	void Insert() {
		System.out.print("비밀번호 입력 > ");
		insert = scan.nextInt();
		if(pw == insert) {
			System.out.println("열림");
		}else
			System.out.println("잘못된 비밀번호 입니다.");
	}
	void Menu() {
		MENU:while(true) {
			System.out.println("메뉴를 선택하세요 > 1. 비밀번호 셋팅\t2. 비밀번호 입력\t아무키. 종료");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				Setpw();
				break;
			case 2:
				Insert();
				break MENU;
			default:
				
				break MENU;
			}
		}
	}


}
