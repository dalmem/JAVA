package final_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person park = new Person("900000-1000000","박한국");
		Person kim = new Person("900000-2000000","김한국");
		System.out.println(park.nation+" " +park.name + " " + park.ssn);
		System.out.println(kim.nation+" " +kim.name + " " + kim.ssn);
		
	}
}
