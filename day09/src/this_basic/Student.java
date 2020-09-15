package this_basic;

public class Student extends Person{
	
	String studentId;
	
	Student(String name, int age, String studentId){
		 
//		this.name = name;
//		this.age = age;
		super(name,age);
		this.studentId = studentId;
		
	}
	Student(String name, int age){
		this("홍길동",20,"0");
	}
	
	Student(){
		this("이름미정",0,"0");
	}
	
	
	String info() {
		return "이름 : " +name + ", 나이 : " + age + ", 학번 : " + studentId;
	}
	
}
