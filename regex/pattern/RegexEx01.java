package regex.pattern;

public class RegexEx01 {
	
	public static void main(String[] args) {
		
		String info = "홍길자|30세|서울시 강남구|010-9999-1234";
		
		//매개변수에 regex인 메서드는 정규표현 패턴을 적용할 수 있다는 뜻 입니다.
		String pattern ="\\d{3}-\\d{3,4}-\\d{4}";
		
		String result = info.replaceAll(pattern, "***-****-****");
		
		System.out.println(result);
	}
}
