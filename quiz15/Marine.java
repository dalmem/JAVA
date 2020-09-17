package quiz15;

public class Marine extends Unit{
	
	public static int attack;
	public static int armor;
	
	static {
		int attack =6;
		int armor =0;
	}
	public Marine() {
		this.x =0;
		this.y =0;
		this.hp =60;
		
	}

}
class Tank extends Unit{
	
	public Tank() {
		this.x =0;
		this.y =0;
		this.hp =100;
	}
}
class DropShip extends Unit{
	
	public DropShip() {
		this.x =0;
		this.y =0;
		this.hp =60;
	}
}
