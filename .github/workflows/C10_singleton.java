
public class C10_singleton {
	// �̱��� ����
	//	���������ڸ� �̿��Ͽ� �ν��Ͻ��� �� �ϳ����� �����Ǵ� ���� �����ϴ� ����
	//	�����ڸ� ����� �� ������  private�� �ɾ� ���´�
	//	�ν��Ͻ��� static���� �� �ѹ��� �����Ѵ�
	//	�����س��� static �ν��Ͻ��� ��ȯ�ϴ� �޼��带 ������ ���´� 
	public static void main(String[] args) {
		// private �����ڷδ� �� �̻� �ν��Ͻ��� �� �� ���� 
		// new SingletonClass();
		
		// singletonclass ����ϱ�
		SingletonClass instance = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance();
		if(instance == instance2) {
			System.out.println("���� �ν��Ͻ�");}
		else {
			System.out.println("�ٸ� �ν��Ͻ�");}
		// �ν��Ͻ� ���� a,b,c�� staticó�� �����Ѵ�
		instance.printABC();
		instance.changeABC(99, 98, 97);
		
		instance2.printABC();
		
	}
}
class SingletonClass{
	// SingletonClass�� �ν��Ͻ��� �������� �� ���� ������
	// �ν��Ͻ� ������ �����ص� static ó�� ����ؾ� �Ѵ�
	private int a,b,c;
	
	// Ŭ���� �����̱� ������ private �����ڿ� ������ �� �ִ�
	private static SingletonClass instance = new SingletonClass();
	
	// �ܺο��� �� Ŭ������ ������ ����ϰ� �ʹٸ� getInstance()�� �ν��Ͻ��� ��������
	public static SingletonClass getInstance() {
		return instance;
	}
	// private : Ŭ���� �ܺο����� ������ �ʰ� �����
	
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
