
public class C09_final {
	final int mem_int=55;
	// final
	//	������ ��� �� : �� �̻� ������ ���� ������ �� ���Բ� �����Ѵ�
	// 	�޼��忡 ��� �� : �� �̻� �� �޼��带 �������̵� �� �� ���Բ� �����Ѵ�
	//	Ŭ������ ��� �� : ���̻� �� Ŭ������ ��ӹ��� �� ���Բ� �����Ѵ�
	
	public static void main(String[] args) {
		final int a= 10;
		//a= 123;
		new C09_Child().method();
	}
	
	final void printmsg(String msg) {
		System.out.println(msg);
	}
}
// String�� finalŬ������ ����� ������ ����
class MyString extends String{
	
}
class MyRandom extends java.util.Random{
	
}
class C09_Child extends C09_final{
	// final int �� ���� �������̵� ���� ������ �ʴ´�
	int mem_int=10;
	// final method�� �������̵带 ���ϰ� �Ѵ�
	// void printmsg(String msg) {}
	void method() {
		System.out.println(mem_int);
		System.out.println(super.mem_int);
	}
}