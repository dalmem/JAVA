
public class C06_thisSuper {
		// super와 this 모두 현재의 인스턴스를 가리킨다
	
		// super : 무조건 부모의 자원에 접근한다 (오버라이드가 있는 경우라도)
		// this  : 먼저 자식 클래스를 찾고 없으면 부모 클래스에서 찾는다
		
		public static void main(String[] args) {
			Child c = new Child();
			c.execute("super");
			c.execute("this");
			
			c.superName();
			c.thisName();
			c.defaultName();
		}	
	}

	// 모든 클래스는 Object라는 부모를 가지고 있기 때문에 super는 모든 객체에서 사용 가능함
	class Parent {
		String name;
		
		// 부모 객체의 기본 생성자가 사라짐
		public Parent(String name) {
			this.name = name;
		}
		
		void methodA() {
			System.out.println("부모의 메서드 A");
		}
	}

	class Child extends Parent {
		// 변수 오버라이드
		String name;
		
		// 부모 클래스에 아무것도 없는 기본 생성자가 있다면 자식 클래스에도 기본 생성자를 사용할 수 있다
		// 부모 클래스에 기본 생성자가 없다면 자식 클래스도 그에 대한 처리가 필요하다
		
		// ※ 자식 클래스는 부모 클래스의 생성자를 반드시 가장 먼저 호출해야 한다 (기본 생성자는 생략 가능)
		public Child() {
			// super() : 부모 클래스의 생성자 
			// this() : 현재 클래스의 다른 생성자를 부를 때 사용한다
			super("static parent name");		
		}

		// 부모의 메서드를 덮어쓴다 (오버라이드)
		void methodA() {
			System.out.println("자식의 메서드 A");
		}
		
		void thisName() {
			System.out.println(this.name);
		}
		void superName() {
			System.out.println(super.name);
		}	
		void defaultName() {
			// this가 생략된 것
			System.out.println(name);
		}
		
		void execute(String cmd) {
			switch (cmd) {
			case "super":
				// super를 이용하면 오버라이드를 하더라도 부모의 메서드에 접근할 수 있다
				super.methodA();
				break;
			case "this":
				// this를 사용하면 우선 자식 클래스에서 원하는 것을 찾고, 없다면 부모클래스에서 찾는다
				this.methodA();
				break;		
			default:
				// this가 생략된 상태
				methodA();
				break;
			}
		}
	}
