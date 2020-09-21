package quiz15;

public class MainClass {

	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		Marine m4 = new Marine();
		
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		DropShip ds = new DropShip();
		ds.ride(m1);ds.ride(m2);ds.ride(m3);ds.ride(m4);
		ds.ride(t1);//ds.ride(t2);
		ds.move(11, 11);
		m2.location();
		
	
			
		
		
	}
}
