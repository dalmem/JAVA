package day07;

public class MethodEx01 {

	//메서드 == 함수랑 비슷
	/*
	 * 메서드는 메서드 내부에 선언할수 없습니다 ( 메인도 메서드이기 떄문에 불가능 )
	 * main밖에, 클래스 안 어디서든 선언가능
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("1 ~ 50까지 합 : " +calSum());
		System.out.println("1 ~ 50까지 합 : " +calSum());
		System.out.println("1 ~ 50까지 합 : " +calSum());
		
		int result = calSum();
		System.out.println("1 ~ 50까지 합 : " + result);
		String result2 = randomStr();
		System.out.println("결과 : "+result2);
		
		String result3 = randomStr2();
		System.out.println("결과: "+result3);
		
	}//main

	static int calSum() {
		int sum =0;
		for (int i = 1; i <= 50; i++) {
			sum += i;
		}

		return sum;
	}
	
	static String randomStr() {

		
		String str = "";//공백
		for (char i = 'A'; i < 'Z'; i++) {
			str += i;
		}
		return str;
		
	}

	static String randomStr2() {
		 double d = Math.random();
		 
		 if(d > 0.66) {
			 return "가위";
		 }else if(d > 0.33) {
			 return "바위";
		 }else {
			 return "보";
		 }
		 
		 
	}
}
