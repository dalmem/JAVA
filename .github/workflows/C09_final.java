
public class C09_final {
	final int mem_int=55;
	// final
	//	변수에 사용 시 : 더 이상 변수의 값을 변경할 수 없게끔 선언한다
	// 	메서드에 사용 시 : 더 이상 이 메서드를 오버라이드 할 수 없게끔 선언한다
	//	클래스에 사용 시 : 더이상 이 클래스를 상속받을 수 없게끔 선언한다
	
	public static void main(String[] args) {
		final int a= 10;
		//a= 123;
		new C09_Child().method();
	}
	
	final void printmsg(String msg) {
		System.out.println(msg);
	}
}
// String은 final클래스라 상속을 받을수 없다
class MyString extends String{
	
}
class MyRandom extends java.util.Random{
	
}
class C09_Child extends C09_final{
	// final int 가 변수 오버라이드 까지 막지는 않는다
	int mem_int=10;
	// final method는 오버라이드를 못하게 한다
	// void printmsg(String msg) {}
	void method() {
		System.out.println(mem_int);
		System.out.println(super.mem_int);
	}
}