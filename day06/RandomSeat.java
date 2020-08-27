package day06;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {

	public static void main(String[] args) {
		/*
		 * 1. 사람수를 입력 받을 수 있습니다
		 * 2. 입력받은 사람수 만큼 랜덤값을 생성해서 배열에 중복되지 않게 랜덤으로 저장
		 * ex) 25를 받으면 1~25까지 숫자가 중복되지 않게 크기가 25인 배열에 랜덤하게 배정
		 * 3. 해당 배열의 크기만큼 o으로 출력해주세요 (ㅁ한자9) 
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다
		 * 5. 제대로 된 좌석이라면 자리번호를 공개하면 되고, 제대로 선택되지 않은 좌석이면 "경고문을 띄워주세요"
		 * 
		 * 선택된 자리는 ●로 다시 표기
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("인원수 > ");
		int people = scan.nextInt();
		int[] seat = new int[people];
		String[] o = new String[people];
		for (int i = 0; i < people; i++) {
			seat[i] = (int)(Math.random()*people)+1;

			for (int j = 0; j < i; j++) {

				if(seat[i]==seat[j]) {
					i--;
				}
			}
		}for (int i = 0; i < people; i++) {
			o[i]="o";
		
		}
			while(true) {
				
				System.out.print("학생번호 > ");
				int no = scan.nextInt();
				System.out.println();
				System.out.println("좌석 번호 > " +seat[no-1]);
				o[seat[no-1]-1]="■";
				System.out.println();
				for (int i = 1; i < people; i++) {
					System.out.print(String.format("%02d", i)+ " "+o[i-1]+"   ");
					if(i % 4 ==0)
						System.out.println();
				}System.out.println();
				
				
				
			}
			
		


	}




}
