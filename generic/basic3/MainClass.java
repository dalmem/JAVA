package generic.basic3;

public class MainClass {
	public static void main(String[] args) {
		
		//ITBank안에 있는 두가지 메서드를 사용.
		
		ITBank i = new ITBank();
		Course<Student> cou = new Course<>();
		cou.setNum("1");
		cou.setStudent(new Student("홍길동",20));
		
		
		
		//매개변수가 제네릭 타입인 메서드 실행
		i.info(cou);
		
		
		//반환유형이 제네릭타입인 메서드를 실행
		Course<Student> c= i.get();
		System.out.println("번호: " +c.getNum() +", 이름 : "+c.getStudent().getName());
		
		
	}
}
