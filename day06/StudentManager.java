package day06;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] nameList = new String[100];
		String[] genderList = new String[100];
		String[] emailList = new String[100];
		int[] ageList = new int[100];

		//현재 위치를 나타내는 변수 index, 시작은 -1에서 시작
		int index = -1;
		//저장된 사람 수를 알기 위한 변수 count 
		int count = 0;
		char run = 'r';
		while(run == 'r') {
			System.out.println("----------------------------");
			System.out.println("[메뉴] 1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.ViewAll 8.Quit");
			System.out.print("메뉴 입력> ");
			int menu = scan.nextInt();

			switch(menu) {
			case 1:
				System.out.println("--------- 고객 정보 입력 ---------");
				for (int i = count; i <= count; i++) {


					System.out.print("이름 > ");
					nameList[i] = scan.next();
					System.out.print("성별 > ");
					genderList[i] = scan.next();
					System.out.print("나이 > ");
					ageList[i] = scan.nextInt();
					System.out.print("이메일 > ");
					emailList[i]=scan.next();
				}count++;

				/*
				 * 이름, 성별, 이메일, 나이를 받아서 각각 배열에 저장, 사람 수를 증가
				 */
				break;
			case 2:
				System.out.println("--------- 이전 고객 정보 ---------");
				if (count>=2 && index >-1) {
					System.out.println("이름: " +nameList[index]);
					System.out.println("나이: "+ageList[index]);
					System.out.println("성별: "+genderList[index]);
					System.out.println("메일: "+emailList[index]);
					--index;
				}else
					System.out.println("이전 고객 정보가 없습니다");


				/*
				 * 현재 위치 기반으로 index를 이동해서 이전 정보를 출력
				 * index <=0 
				 */
				break;
			case 3:
				System.out.println("--------- 다음 고객 정보 ---------");

				if(count>=2 && index<count-2) {		
					++index;

					System.out.println("이름: " +nameList[index+1]);
					System.out.println("나이: "+ageList[index+1]);
					System.out.println("성별: "+genderList[index+1]);
					System.out.println("메일: "+emailList[index+1]);


				}else 					
					System.out.println("다음 고객 정보가 없습니다");

				/*
				 * 다음고객 정보를 출력할수 없는 조건을 생각해서  " 다음 고객 정보가 없습니다" 
				 * 그렇지 않으면 index를 이용해서 다음 고객 정보 출력
				 */
				break;
			case 4:
				System.out.println("--------- 현재 고객 정보 ---------");
				if(count == 0 || index > count-1) {
					System.out.println("등록된 정보가 없습니다");
					break;
				}
				if(index<0) {
					System.out.println("이름: " +nameList[index+1]);
					System.out.println("나이: "+ageList[index+1]);
					System.out.println("성별: "+genderList[index+1]);
					System.out.println("메일: "+emailList[index+1]);
				}else if(index>=0 && index < count-1){					
					System.out.println("이름: " +nameList[index+1]);
					System.out.println("나이: "+ageList[index+1]);
					System.out.println("성별: "+genderList[index+1]);
					System.out.println("메일: "+emailList[index+1]);
				}else
					break;
				/*
				 * 현재 위치를 출력할수 있는 조건을 생각해서 현재 조건을 출력하면 됩니다.
				 * 그렇지 않으면 "현재 고객정보가 없습니다"
				 */
				break;
			case 5:
				System.out.println("--------- 고객 정보 수정 ---------");
				/*
				 * 현재 위치를 출력할수 있는 조건을 생각해서
				 * 스캐너를 통해 순서대로 이름, 성별, 이메일, 나이를 입력받고 배열의 값을 수정
				 * 
				 */
				System.out.print("이름 > ");
				nameList[index+1] = scan.next();
				System.out.print("성별 > ");
				genderList[index+1] = scan.next();
				System.out.print("나이 > ");
				ageList[index+1] = scan.nextInt();
				System.out.print("이메일 > ");
				emailList[index+1]=scan.next();

				break;
			case 6:
				System.out.println("--------- 고객 정보 삭제 ---------");
				if(index >= 0 && index < count) {
					for (int i = index+1; i < count-1; i++) {
						nameList[i] = nameList[i+1];
						genderList[i] = genderList[i+1]; 
						ageList[i] = ageList[i+1];
						emailList[i] = emailList[i+1];
					}--count;}
				/*
				 * 현재 정보를 삭제할 수 있는 조건을 생각 해서 
				 * 현재 index 부터 ~~ 뒤에 있는 배열 요소를 당겨와서 덮어 씌웁니다
				 * 고객수를 감소
				 */
				break;
			case 7:
				System.out.println("--------- 등록된 고객 ---------");
				System.out.print("이름 : ");System.out.print("[");
				for (int i = 0; i < count; i++) {
					System.out.print(i+1 +": "+nameList[i]+"\t");
				}
				System.out.print("]");
				System.out.println();
				System.out.print("성별 : ");System.out.print("[");
				for (int i = 0; i < count; i++) {
					System.out.print(i+1 +": "+genderList[i]+"\t");
				}
				System.out.print("]");
				System.out.println();
				System.out.print("나이 : ");System.out.print("[");
				for (int i = 0; i < count; i++) {
					System.out.print(i+1 +": "+ageList[i]+"\t");
				}
				System.out.print("]");
				System.out.println();
				System.out.print("메일: ");System.out.print("[");
				for (int i = 0; i < count; i++) {
					System.out.print(i+1 +": "+emailList[i]+"\t");
				}
				System.out.print("]");

				System.out.println();
				break;				

			default:
				System.out.println("------------ 프로그램 종료 -------------");
				run = 's';
				break;
			}

		}
	}
}
