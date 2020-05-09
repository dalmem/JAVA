
public class C10_singleton {
	// 싱글톤 패턴
	//	접근제어자를 이용하여 인스턴스가 딱 하나만을 생성되는 것을 보장하는 패턴
	//	생성자를 사용할 수 없도록  private을 걸어 놓는다
	//	인스턴스는 static으로 단 한번만 생성한다
	//	생성해놓은 static 인스턴스를 반환하는 메서드를 정의해 놓는다 
	public static void main(String[] args) {
		// private 생성자로는 더 이상 인스턴스를 찍어낼 수 없다 
		// new SingletonClass();
		
		// singletonclass 사용하기
		SingletonClass instance = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance();
		if(instance == instance2) {
			System.out.println("같은 인스턴스");}
		else {
			System.out.println("다른 인스턴스");}
		// 인스턴스 변수 a,b,c가 static처럼 동작한다
		instance.printABC();
		instance.changeABC(99, 98, 97);
		
		instance2.printABC();
		
	}
}
class SingletonClass{
	// SingletonClass는 인스턴스가 여러개일 수 없기 때문에
	// 인스턴스 변수를 선언해도 static 처럼 사용해야 한다
	private int a,b,c;
	
	// 클래스 내부이기 때문에 private 생성자에 접근할 수 있다
	private static SingletonClass instance = new SingletonClass();
	
	// 외부에서 이 클래스의 내용을 사용하고 싶다면 getInstance()로 인스턴스를 가져간다
	public static SingletonClass getInstance() {
		return instance;
	}
	// private : 클래스 외부에서는 보이지 않게 만든다
	
	private SingletonClass() {
		a=10;
		b=20;
		c=30;
	}
	public void changeABC(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	public void printABC() {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
	}
}
