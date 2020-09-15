package day08;

public class Phone {
	
	String model;
	int price;
	String color;
	
	//생성자: 생성자는 클래스 이름과 대/소문자 까지 동일
	Phone(){
		System.out.println("생성자 호출");
		model = "롤리팝";
		price = 200000;
		color = "검정";
	}
	
	//생성자는 중복해서 여러개 선언할 수 있습니다.
	//단, 매개변수의 종류나 개수가 달라야함
	Phone(String pColor){
		color = pColor;
		price = 300000;
		model = "애니콜";
	}
	Phone(String pColor, int pPrice){
		color = pColor;
		price = pPrice;
		model = "가로본능";
	}
	Phone(String pColor, int pPrice , String pModel){
		color = pColor;
		price = pPrice;
		model = pModel;
	}
	
	void info() {
		System.out.println("---------폰의 정보 ---------");
		System.out.println("기종: "+model);
		System.out.println("가격: "+price);
		System.out.println("색상: "+color);
	}
}
