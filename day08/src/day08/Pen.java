package day08;

//설계도 클래스는 메인이 없습니다.
public class Pen {
	
	//클래스의 속성을 나타내는 것을 멤버변수라고 부릅니다.
	String color;
	int price;
	String company;
		
	//클래스 안의 기능을 나타내는 것을 메서드 라고 부릅니다.
	void write() {
		System.out.println(color + "색상 글씨를 씁니다");
	}
	void info() {
		System.out.println("---------Pen's information-------");
		System.out.println("색상 : "+color);
		System.out.println("가격 : "+price);
		System.out.println("회사 : "+company);
	}
	
}

