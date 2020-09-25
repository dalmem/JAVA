package quiz21;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz02 {
	/*
	 * 1. User클래스는 은닉된 변수로 name, age를 선언하고 생성
	 * 2. User클래스를 저장할 수 있는 List생성 선언
	 * 3. User객체 2개를 생성해서 리스트에 추가
	 * 4. list에 저장된 모든 name, age를 반복문으로 출력
	 * 5. list에 홍길자가 있다면 홍길자의 이름, 나이만 출력
	 * 6. list에 홍길동이 있다면 홍길동User객체 삭제
	 */
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		User u = new User("홍길동", 22);
		User u1 = new User("홍길자", 32);
		list.add(u);
		list.add(u1);


		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getName()+list.get(i).getAge()+" ");

		}System.out.println();


		for(User user : list) {
			if(user.getName().equals("홍길자"))
				System.out.println("이름 : "+user.getName() + ", 나이 : " +user.getAge());
		}

		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals("홍길동"))
				list.remove(i);
		}
		System.out.println(list.toString());


	}
}
