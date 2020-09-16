package encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		MyDate me = new MyDate();
		me.setYear(2020);
		System.out.println("년도 " + me.getYear());
		me.setDay(32);
		me.setDay(31);
	}
}
