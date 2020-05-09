
public class C06_thisSuper {
		// super�� this ��� ������ �ν��Ͻ��� ����Ų��
	
		// super : ������ �θ��� �ڿ��� �����Ѵ� (�������̵尡 �ִ� ����)
		// this  : ���� �ڽ� Ŭ������ ã�� ������ �θ� Ŭ�������� ã�´�
		
		public static void main(String[] args) {
			Child c = new Child();
			c.execute("super");
			c.execute("this");
			
			c.superName();
			c.thisName();
			c.defaultName();
		}	
	}

	// ��� Ŭ������ Object��� �θ� ������ �ֱ� ������ super�� ��� ��ü���� ��� ������
	class Parent {
		String name;
		
		// �θ� ��ü�� �⺻ �����ڰ� �����
		public Parent(String name) {
			this.name = name;
		}
		
		void methodA() {
			System.out.println("�θ��� �޼��� A");
		}
	}

	class Child extends Parent {
		// ���� �������̵�
		String name;
		
		// �θ� Ŭ������ �ƹ��͵� ���� �⺻ �����ڰ� �ִٸ� �ڽ� Ŭ�������� �⺻ �����ڸ� ����� �� �ִ�
		// �θ� Ŭ������ �⺻ �����ڰ� ���ٸ� �ڽ� Ŭ������ �׿� ���� ó���� �ʿ��ϴ�
		
		// �� �ڽ� Ŭ������ �θ� Ŭ������ �����ڸ� �ݵ�� ���� ���� ȣ���ؾ� �Ѵ� (�⺻ �����ڴ� ���� ����)
		public Child() {
			// super() : �θ� Ŭ������ ������ 
			// this() : ���� Ŭ������ �ٸ� �����ڸ� �θ� �� ����Ѵ�
			super("static parent name");		
		}

		// �θ��� �޼��带 ����� (�������̵�)
		void methodA() {
			System.out.println("�ڽ��� �޼��� A");
		}
		
		void thisName() {
			System.out.println(this.name);
		}
		void superName() {
			System.out.println(super.name);
		}	
		void defaultName() {
			// this�� ������ ��
			System.out.println(name);
		}
		
		void execute(String cmd) {
			switch (cmd) {
			case "super":
				// super�� �̿��ϸ� �������̵带 �ϴ��� �θ��� �޼��忡 ������ �� �ִ�
				super.methodA();
				break;
			case "this":
				// this�� ����ϸ� �켱 �ڽ� Ŭ�������� ���ϴ� ���� ã��, ���ٸ� �θ�Ŭ�������� ã�´�
				this.methodA();
				break;		
			default:
				// this�� ������ ����
				methodA();
				break;
			}
		}
	}
