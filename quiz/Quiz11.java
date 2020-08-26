package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		//1. 메뉴를 보여준 후, Scanner로 해당 메뉴를 입력 받으세요. 
//		2. 없는 메뉴 라면 “~은 메뉴에 없습니다“ 를 출력하세요. 
//		3. switch 구문을 이용하세요
		Scanner scan = new Scanner(System.in);
		String[] arr = {"수박","사과","멜론","포도","귤"};
		System.out.println("구입할 메뉴는?");
		System.out.println(Arrays.toString(arr));
		System.out.print("> ");
		String fruit = scan.next();
		switch (fruit) {
		case "수박":
			System.out.println(fruit+"의 가격은 2만원 입니다.");
			break;
		case "사과":
			System.out.println(fruit+"의 가격은 3만원 입니다.");
			break;
		case "멜론":
			System.out.println(fruit+"의 가격은 4만원 입니다.");
			break;
		case "포도":
			System.out.println(fruit+"의 가격은 5만원 입니다.");
			break;
		case "귤":
			System.out.println(fruit+"의 가격은 6만원 입니다.");
			break;
		default:
			System.out.println(fruit+"은(는) 메뉴에 없습니다.");
			System.out.println("다시 입력해주세요.");
			break;
		}
	}
}
