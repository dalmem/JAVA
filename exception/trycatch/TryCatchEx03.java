package exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("> ");
				int num = scan.nextInt();//엔터값을 포함하지 않고 값을 받는다.
				System.out.println("입력결과 : " + num);
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하실래요?");
				scan.nextLine();//엔터값을 제거하고 다시 실행
			}
		 }
	}
}
