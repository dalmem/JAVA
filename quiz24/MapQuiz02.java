package quiz24;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		
		//맵을 이용하는데 key: 메뉴이름 , value: 가격
		a:while(true) {
			System.out.println("------------------메뉴 관리-----------------");
			System.out.println("1. 신규 메뉴 등록");//이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기");// 메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정");// 변경할 메뉴를 받아서 메뉴가 있다면 가격 수정
			System.out.println("4. 메뉴판 삭제");// 변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료");
			int menu= scan.nextInt();
			
			switch (menu) {
			case 1:
				System.out.print("등록할 메뉴 이름 > ");
				String name = scan.next();
				System.out.print("메뉴 가격 > ");
				int price = scan.nextInt();
				if(!(map.containsKey(name))) {
					map.put(name, price);			
					
				}else
					System.out.println("이미 등록 되어 있는 메뉴입니다.");			
				
				break;	
			case 2:
				Set<Entry<String, Integer>> entry = map.entrySet();
				for(Entry<String,Integer> e : entry )
					System.out.println(e.getKey() + " " + e.getValue()+"원");
				break;
			case 3:
				System.out.print("수정할 메뉴 >  ");
				String namec = scan.next();
				if(map.containsKey(namec)) {
					System.out.print("수정할 가격 입력 >");
					int pricec = scan.nextInt();	
					map.put(namec, pricec);
				}
				break;
			case 4:
				String mname = scan.next();
				if(map.containsKey(mname)) {
					map.remove(mname);
				}
				break;
			case 5:
				System.exit(0);
			default:
				break a;
			}



		}
	}
}
