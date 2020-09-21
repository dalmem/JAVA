package inter.basic;

public interface Inter1 {
	//상수와 추상메서드가 정의됩니다.
	double PI = 3.14;//인터페이스 변수를 선언하면 자동으로 상수 취급됩니다.
	public void method01();//인터페이스에 메서드를 선언하면 자동으로 추상메서드가 됩니다.
	
	
//	1.8버전 이후에 static메서드도 선언이 가능함
//	public static void method02() {}		

	
}
