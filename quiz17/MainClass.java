package quiz17;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 인터페이스 형으로 선언하고, 무한반복문 안에서 
		 * 추가, 재생, 종료 메뉴를 입력 받아서 클래스의 각 기능을 실행해 보세요.
		 * 
		 */
		SongList sl = new MelonMusic();
		music:while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. 추가 "+"\t"+"2. 재생"+"\t"+"3. 저장된 목록"+"        "+"4. 종료");
			System.out.print("메뉴 선택 >> ");
			int sel= scan.nextInt();
			
			switch (sel) {
			case 1:
				System.out.print("추가할 음악 제목 >> ");
				String song = scan.next();
				sl.insertList(song);
				break;
			case 2:
				System.out.println("랜덤 재생됩니다");
				sl.playList();
				break;

			case 3:
				System.out.print("리스트 목록 [");
				sl.playLength();

				break;
			case 4:
				System.out.println("재생을 종료합니다");
				break music;


			default:
				break;
			}
		}

	}
}
