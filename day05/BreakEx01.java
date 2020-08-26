package day05;

public class BreakEx01 {
	/*
	 * 무한반복문
	 * - 반복문의 횟수를 정확히 모를 때 주로 사용하고
	 * 		자바에서는while(true) 문장을 많이 사용
	 */
	public static void main(String[] args) {
		int i=1;
		while(true) {
			if(i==15)
				break;
			System.out.println(i);
			i++;

		}
	}
}
