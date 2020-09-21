package inter.basic3;

public class Samsung implements Printed{

	@Override
	public void turnOn() {
		System.out.println("삼성이다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("다신 보지말자");
		
	}

	@Override
	public void Print(String document) {
		System.out.println(document);
		
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(document + "("+color+")");
		
	}

	@Override
	public int copy(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i+"장째 출력합니다");
		}
		return n;
	}

}
