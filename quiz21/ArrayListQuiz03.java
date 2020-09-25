package quiz21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>();
		a:while(true) {
			System.out.println("[1.등록 | 2.회원정보보기| 3.회원정보검색| 4.회원정보삭제| 5.종료]");
			System.out.print("> ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.print("이름 > ");
				String name = scan.next();
				System.out.print("나이 > ");
				int age = scan.nextInt();
				//스캐너로 이름, 나이를 받고 User객체에 저장, list에 추가
				User u = new User(name,age);
				list.add(u);
				System.out.println(list.toString());
				break;
			case 2:
				//list길이 만큼 회전하면서 모든 회원정보 출력
				System.out.print("[");
				for (int i = 0; i < list.size(); i++) {

					System.out.print(" 이름 : " +list.get(i).getName()+", 나이 : "+list.get(i).getAge()+" ");

				}
				System.out.print("]");
				System.out.println();
				break;

			case 3:
				System.out.print("찾을 이름 > ");
				String findName = scan.next();
				String info;
				for (int i = 0; i < args.length; i++) {

					if(list.get(i).getName().equals(findName) ) {
						System.out.println("이름 : "+list.get(i).getName() + ", 나이 : "+list.get(i).getAge());
						break;
					}
					if(i == list.size()-1)
						System.out.println(findName+"님은 목록에 없습니다");
				} 

				
				//찾을 이름을 입력 받고, 이름이 있다면 이름, 나이 출력
				//찾는 이름이 없으면, ~~님은 목록에 없습니다 출력
				break;

			case 4:
				System.out.print("목록에서 삭제 할 이름 : ");
				name = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
						System.out.println(name+"이 삭제 되었습니다.");
						break;
					}else
						System.out.println("입력하신 이름은 목록에 없습니다.");
					break;
				}
				//삭제할 이름을 입력받고, 입력받은 이름과 동일하면 User를 삭제
				break;

			case 5:
				System.out.println("종료합니다");
				break a;


			default:
				System.out.println("다시 입력하세요");
				break;
			}

		}
	}
}
