package quiz28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 가격 형식만 찾아서 순서대로 출력 4, 500, 6000.....
		 */
		
		String str = "헠4,500원 헬~1,200원 엏? 6000원윀 120000원";
		String pattern = "[0-9]+,*[0-9]+원";
		
		
		Pattern p = Pattern.compile(pattern);		
		Matcher m = p.matcher(str);
		
		
				
		while(m.find()) {
			System.out.print(m.group()+" ");
			
			
		}
		
	}
}
