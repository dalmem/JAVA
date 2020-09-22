package quiz19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args)   {

		/*
		 * 1에서 100까지 랜덤한 수를 맞추는 프로그램 입니다.
		 * 입력한 값이 1에서 100까지의 값이 아니라면 예외처리 구문으로 넘기고
		 * 다시 입력받도록 처리합니다.
		 * 단, 카운트는 증가됩니다.
		 * 
		 * 입력한 값이 숫자가 아니라면 "반드시  숫자만 입력하세요"를 출력한 뒤에
		 * 다시 입력받도록 처리합니다.
		 * 단, 카운트는 처리 되지 않습니다.
		 * 
		 * 위와 같은 실행 구조를 갖는 예외처리 코드를 작성해보세요.
		 */

		Scanner scan = new Scanner(System.in);
		char run = 'r';
		int answer = (int)(Math.random()*100+1);
		int count =0;
		while(run=='r') {
			try {
				System.out.print("정수 입력 > ");
				int input = scan.nextInt();
				count++;
				//System.out.println(answer);// 정답 출력				
				if(input >100 || input<1) {
					
					throw new Exception();//input 이 100보다 크거나 1보다 작으면 indexoutofbounds예외 발생 **
					
				}else if(input > answer) {
					System.out.println("DOWN");
					
				}else if(input < answer){
					System.out.println("UP");
					
				}else {
					
					System.out.println("정답입니다");
					run = 's';
					}
				
			}catch(InputMismatchException | NumberFormatException e){//추가 다른 예외는 exception으로 모두 받아서 처리
				System.out.println("반드시 숫자만 입력하세요");				
				scan.nextLine();
			}catch(Exception e) {//**catch에 indexoutofbounds 예외로 와서 안의 내용 처리
				System.out.println("1~100의 정수만 입력하세요");
						
			}finally {
				System.out.println("시도 횟수 : "+count);
			}
		}
	}

}
