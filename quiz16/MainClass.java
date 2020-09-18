package quiz16;

public class MainClass {

	public static void main(String[] args) {
		Shape r = new Rect(3,5,"사각형");
		System.out.println(r.getArea());
		
		Shape c = new Circle(4,"원");
		System.out.println(c.getArea());
	}
	
}
