
public class C12_local_innerClass {
	
	// ���� ���� Ŭ����
	//	�Լ����ο� �����ϴ� Ŭ����
	
	void method() {
		int data=77;
		
		class Local{
			int data;
			void method() {
				// Ŭ���� �ܺ��� ���� ���� ������ �� �� ������
				// �ٱ����� ������ ���� �̿��� ���� �ν��Ͻ��� �����ؾ� �Ѵ� 
				System.out.println(data);
			}
		}
		Local l =new Local();
		System.out.println("�������� data : " + data);
		System.out.println("���� Ŭ������ ��� data : " +l.data);
		l.method();
	}
	public static void main(String[] args) {
		new C12_local_innerClass().method();
	}
}
