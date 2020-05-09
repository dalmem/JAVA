
public class C12_local_innerClass {
	
	// 지역 내부 클래스
	//	함수내부에 선언하는 클래스
	
	void method() {
		int data=77;
		
		class Local{
			int data;
			void method() {
				// 클래스 외부의 값은 쉽게 가져다 쓸 수 있지만
				// 바깥에서 내부의 값을 이용할 때는 인스턴스를 생성해야 한다 
				System.out.println(data);
			}
		}
		Local l =new Local();
		System.out.println("지역변수 data : " + data);
		System.out.println("지역 클래스의 멤버 data : " +l.data);
		l.method();
	}
	public static void main(String[] args) {
		new C12_local_innerClass().method();
	}
}
