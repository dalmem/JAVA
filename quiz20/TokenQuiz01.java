package quiz20;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1. nextLine()문장을 받습니다
		 * 2. 토크나이저를 이용해서 공백기준으로 분리
		 * 3. 토큰개수를 확인
		 * 4. 분리된 토큰을 숫자를 붙여서 세로 형태로 출력
		 * 1. 안녕
		 * 2. 하세요.
		 * 3. 오늘은
		 * 
		 * 5. 분리된 문자열을 배열에 저장
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		String str = scan.nextLine();
		int a=0;
		StringTokenizer token = new StringTokenizer(str," ");//공백을 기준으로 자름
		String[] arr = new String[token.countTokens()];//잘린 토큰 개수만큼 크기지정
		while(token.hasMoreTokens()) {
			String word = token.nextToken();
			arr[a] = word;
			
			System.out.println(a+1 + ". " +word);
			a++;
					
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
}
