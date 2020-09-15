package quiz04;

public class MainClass {
	public static void main(String[] args) {
		
		Warrior wa = new Warrior();
		Wizard wi = new Wizard();
		
		System.out.println("------------마법사------------");
		wi.hp = 600;
		wi.mp = 1100;
		wi.name = "Zx썬콜xZ";
		wi.info();
		wi.iceArrow();
		
		
		System.out.println("------------전사------------");
		wa.hp = 1000;
		wa.mp = 300;
		wa.name = "타락파워전사";
		wa.info();
		wa.bash();
		
	}
}
