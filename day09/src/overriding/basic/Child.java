package overriding.basic;

public class Child extends Parent{

	//오버라이딩 : 부모클래스 한테 물려받은 메서드를 내용물을 바꿔서 재정의 하는 것.
	void method02() {
		System.out.println("자식의 3번 메서드 실행");
	}
}
