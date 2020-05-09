import java.util.Random;
import myobj.Student;

public class C01_OOP {

	// 객체지향 프로그래밍 (OOP: Object Oriented Programming)
	//  - 세상에 존재하는 모든 객체는 변수와 함수로 표현할 수 있다
	//	- 변수는 객체의 상태를 나타내고 함수(메서드)는 행동 및 기능을 나타낸다 
	
	// ※ 객체 (Object) : 세상에 존재하는 모든 개념 (사물, 개념 등등)

	// 클래스 (class)
	//	- 객체를 프로그래밍 언어로 표현한 것
	//	- 객체의 설계도 (선언하는 시점에서는 실체가 없음)
	//	- 클래스를 통해 생성하는 실제 객체를 인스턴스라고 부른다
	//	- 클래스의 메서드는 객체의 행동, 클래스의 변수는 객체의 상태를 나타낸다
	//	- 클래스는 참조형 변수 타입이다	
	
	public static void main(String[] args) {
		// new : 설계도(클래스)를 이용해 실체(인스턴스)를 찍어낸다
		// new 클래스이름(); 으로 생성자를 호출하면 새로운 인스턴스가 생긴다
		// 인스턴스가 생기는 시점에 메모리에 공간이 할당된다 
		// 참조형 변수의 메모리 해제는 Garbage Collector가 알아서 해준다
		Student minsu = new Student(); 
		Student chulsu = new Student();
		Student choosinsu = new Student();
		
		// 같은 설계도로 만들어졌지만 각 인스턴스가 각자의 name을 가질 수 있다
		minsu.name = "민수";
		chulsu.name = "철수";
		choosinsu.name = "추신수";
		
		// 클래스 타입으로 배열도 만들 수 있다
		Student[] class504 = new Student[4]; 
		class504[0] = minsu;
		class504[1] = chulsu;
		class504[2] = choosinsu;
		class504[3] = new Student();
		
		// 연습문제 : 0 ~ 3번 학생들의 국어, 영어, 수학 점수를 적당히 할당하고 
		//		      각자의 평균 점수를 구한 뒤 반 평균도 구해보세요
		Random ran = new Random();
		double class_total = 0;
		for (int i = 0; i < 4; ++i) {
			class504[i].kor = ran.nextInt(50) + 51;
			class504[i].eng = ran.nextInt(50) + 51;
			class504[i].math = ran.nextInt(50) + 51;	
			double avg = class504[i].getAvg();
			System.out.println(i + "번 학생의 평균 점수 : " + avg);
			class_total += avg;
		}
		System.out.println("반 평균 : " + class_total / 4);
	}
}
















