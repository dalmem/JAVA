package quiz14;

public class MainClass {
	public static void main(String[] args) {
		MyCart cart = new MyCart(12000);
		Computer com = new Computer();
		Tv tv = new Tv();
		Radio radio = new Radio();
		cart.buy(com);
		cart.buy(tv);
		cart.buy(radio);
		for (int i = 0; i < 5; i++) {
			cart.buy(new Tv());
		}
	
		
	}
	
	
}
