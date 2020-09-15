package this_basic;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Person p = new Person("홍길동", 20);
//		System.out.println(p);
//		
//		Person p2 = new Person("홍길동");
//		System.out.println(p2);
//		
//		Person p3 = new Person();
//		System.out.println(p3);
		
		Student s = new Student("이순신",30,"123");
		System.out.println(s.info());
		
	}
}
