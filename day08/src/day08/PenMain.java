package day08;

public class PenMain {

	public static void main(String[] args) {
		
		//Pen의 기능을 사용하려면 설계용클래스를 객체로 생성해야 합니다.
		Pen black = new Pen();
		black.color = "black";
		black.price = 1000;
		black.company = "모나미";
		black.write();
				
		Pen red = new Pen();
		red.color = "red";
		red.price  =2000;
		red.company = "하이테크";
		red.write();
		black.info();
		red.info();
	}
}
