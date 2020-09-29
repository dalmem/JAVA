package quiz28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	public static void main(String[] args) {
		
		/*
		 * 상품번호 ,GS25,(도시락명), 가격 으로 분리해서 출력,
		 */
		String str = "123123-4564564 GS25(치킨도시락) 4,400원";
		String str2 = "111111-2222222 GS25(마늘햄쌈) 5,500원";
		String str3 = "222222-3333333 MINISTOP(제육볶음) 5,500";
		String pattern = "\\d{6}-\\d{7}";
		String pattern1 = "[A-Z]+\\w+";
		String pattern2 = "(\\W{3,})";
		String pattern3 = "[0-9]+,[0-9]+";
		String str4 =str+str2+str3;
		pattern(pattern,str4);
		pattern(pattern1,str4);
		pattern(pattern2,str4);
		pattern(pattern3,str4);
		
		
		
	}public static void pattern(String pat,String str) {
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		while(m.find()) {
			System.out.print(m.group()+" ");
			
		}System.out.println();
	}
	
}
