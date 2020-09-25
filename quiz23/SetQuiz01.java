package quiz23;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1. Random 객체를 이용해서 1~ 45 랜덤수를 만들고
		 * 2. set을 이용해서 6개의 로또번호를 만드세요
		 */
		Random rand = new Random();
		Set<Integer> set = new HashSet<>();
		
		while(set.size()!=6) {
			int lotto = rand.nextInt(45)+1;
			set.add(lotto);	
		
		}
		System.out.println("로또 번호 : " +set.toString());
	}	
}
