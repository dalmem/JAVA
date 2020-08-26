package quiz;

import java.util.Scanner;

public class Quiz32 {
	
	public static void main(String[] args) {
		
		/*
		 * up & down
		 * 
		 * 1~100까지 임의 숫자를 생성
		 * 스캐너를 통해서 값을 입력받습니다
		 * 랜덤 수가 입력받은 값보다 작으면 " 더 작은수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰수를 입력하세요"
		 * 
		 * 정답이라면 시도횟수: x회를 출력하고 종료
		 *
		 */
		Scanner scan = new Scanner(System.in);
		boolean bool = true;
		int answer = (int)(Math.random()*100)+1;
		int count = 0;
		while(bool) {
			System.out.print("숫자 입력 > ");
			int a = scan.nextInt();
			
			++count;
			if(a == answer) {
				System.out.println("정답입니다");
				System.out.println("시도 횟수 : "+count);
				break;
			}else if(a > answer) {
				System.out.println("DOWN");
			}else {
				System.out.println("UP");
			}
			
		}		
		scan.close();
	}
}

