package quiz21;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz01 {
	//list에 1~20까지 정수를 저장
	// 저장한 값을 반복문으로 출력
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i+1);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println(list.toString());
	}
}
