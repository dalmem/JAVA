package poly.basic;

//자바에서  하나의 클래스 파일에 여러 클래스 선언이 가능하다
//단, 파일명과 동일한 클래스가 존재해야 하고, 해당 클래스면 public이면 됩니다
class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic {
	
	/*
	 * 다형성
	 * 자식 개체가 부모타입을 가질 수 있는 성질, 상속관계를 가지고 있어야 합니다.
	 */
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	int x =1;
	double y = x; // int -> double로 형변환
	A a1 = b; // B -> A타입 형변환
	A a2 = c;
	A a3 = new D();
	A a4 = new E();
	//상속관계가 없다면 다형성 적용이 불가능합니다
	//B b1 = new E();
	
	//Object타입은 뭐든지 담을 수 있습니다.
	Object o1 = a;
	Object o2 = "문자열";
}
