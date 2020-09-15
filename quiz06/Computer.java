package quiz06;

public class Computer extends Calculator{

	void Circle(int a) {
		
		result = a*a*Math.PI;
		System.out.println("지름이 " + a + "인 원의 넓이 = " +result);
	}
	void Rect(double a) {
		result = a*a;
		System.out.println("변의 길이가 " + a + "인 정사각형의 넓이 = " + result);
	}
	void Rect(double a, double b) {
		result = a*b;
		System.out.println("가로 = " + a +" 세로 = " + b +"인 직사각형의 넓이 = " +result);
	}
	void Rect(double a, double b, double c) {
		result = ((a*b)+(a*c)+(b*c))*2;
		System.out.println("가로 = " + a +" 세로 = " + b +" 높이 = " + c +"인 직육면체의 넓이는 = " +result);
	}
}
