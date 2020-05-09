
public class C05_accessModifier extends myobj.C05_publicClass
{
	// 다른 패키지에서 상속받은 클래스의 접근 범위
	public C05_accessModifier() {
		// super : 무조건 부모의 자원에 접근한다 (오버라이드가 있는 경우라도)
		// this  : 먼저 자식 클래스를 찾고 없으면 부모클래스에서 찾는다
		super._protected_int=10;
		super._public_int=10;
		
		super._protected_method();
		super._public_method();
	}
	public void public_method() {
		System.out.println("자식의 퍼블릭 메서드");
	}
	
	// 접근제어자 (접근지정자)
	
		// 다른 클래스와 그 자원을 사용할 때의 범위를 지정할 수 있다
		// (※ default package는 다른 패키지에서 접근할 수 없다, import 불가능) 
		// 	public			: 다른 패키지에서 접근할 수 있음 (같은 패키지도 가능) 
		// 	protected		: 상속 받으면 다른 패키지에서 접근할 수 있음 (같은 패키지도 가능)
		//	default(안적음)	: 같은 패키지 내부에서만 접근할 수 있음
		//	private			: 같은 클래스 내부에서만 접근할 수 있음
		
		public static void main(String[] args) {
			// 같은 패키지 내부에서 접근할 때는 private을 제외하면 모두 접근할 수 있다
			C05_publicClass samePackage = new C05_publicClass();
			
			int a = 0;		

			a = samePackage._default_int;
			a = samePackage._protected_int;
			a = samePackage._public_int;		
			
			samePackage._default_method();
			samePackage._protected_method();
			samePackage._public_method();	
			
			// 다른 패키지의 클래스에 접근하는 경우 public만 보인다
			myobj.C05_publicClass diffPackage = new myobj.C05_publicClass();
			a=diffPackage._public_int;
			diffPackage._public_method();
			
			// 다른 패키지의 DefaultClass는 접근할수 없기 때문에 내부의 자원에 접근할 수 없다
			// myobj.DefaultClass diffPackageDefalutClass = new myobj.DefaultClass();
		}
}