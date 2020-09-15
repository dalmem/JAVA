package day08;

public class PhoneMain {
	
	public static void main(String[] args) {
		
		Phone black = new Phone();
		black.info();
		
		Phone white = new Phone("white");
		white.info();
		
		Phone red = new Phone("red",500000);
		red.info();
		
		Phone green = new Phone("green",1000000,"아이폰");
		green.info();
		
		//Phone에 모든 멤버변수를 받는 생성자를 생성
		//green, 1000000, 아이폰으로 객체를 생성
	}
}
