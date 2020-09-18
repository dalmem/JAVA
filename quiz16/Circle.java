package quiz16;

public class Circle extends Shape{
	/*
	 * 원은 radius 변수를 가지고 
	 * 생성될떄 이름과, 변의 길이를 받아서 생성됩니다.
	 * 상수 PI를 멤버변수로 가집니다
	 */
	private int radius;
	
	public static final double PI = 3.141592;
	
	public Circle(int radius, String name) {
		super(name);
		this.radius = radius;
	}
	
	public double getArea() {
		System.out.print(getName()+ "\n넓이 : ");
		
		return PI * radius*radius;
	}	
	
}
