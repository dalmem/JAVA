package quiz10;

public class MainClass {

	public static void main(String[] args) {
		MyCartT mc = new MyCartT(3000);
		mc.buy("tv");
		mc.buy("radio");
		mc.buy("com");
		mc.buy("com");
		mc.buy("radio");
		
	}
}
