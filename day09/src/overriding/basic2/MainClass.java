package overriding.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.age =10;
		s.name = "홍길동";
		s.studentId = "111";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.age =20;
		t.name = "홍길자";
		t.subject = "수학";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.age = 32;
		e.name = "박소심";
		e.department = "영업부";
		System.out.println(e.info());
		
	}
}
