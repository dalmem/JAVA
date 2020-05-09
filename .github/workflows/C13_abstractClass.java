
public class C13_abstractClass {
	
	// �߻� Ŭ����
	//	������ �������� �̷�� ����
	//	�� Ŭ������ ��ӹ��� Ŭ�������� ������ �̷��
	
	// 	abstract method : �� �޼���� ���⼭ ���� ���ϰ� , ��ӹ��� �ڽ� Ŭ������ �������̵� �ؼ� ���� ��
	//	abstract class : �߻� �޼��带 �����ϰ� �ֽ��ϴ�
	public static void main(String[] args) {
		Fight[] fights = {new WWE(), new UFC()};
		// abstract class�� ��ӹ��� Ŭ��������
		// abstract method�� �������̵� �ϴ� ���� ������ �Ǿ��ֱ� ������
		// �Ƚ��ϰ� abstract method�� ����� �� �ִ�
		for (Fight f : fights) {
			f.fight();
		}
	}
	// myobj�� abstract class, method�� �̿��Ͽ� Ŭ������ ������ ������
}

//  �� Ŭ������ abstract �޼��带 �����ϰ� �ֽ��ϴ�
//	�׷��� �ν��Ͻ��� ������ �� �����ϴ�
abstract class Fight{
	int fightMoney;
	
	abstract void fight(); // abstract method�� method body�� ���� �� ����
	
	public Fight(int fightMoney) {
		this.fightMoney = fightMoney;
	}
}
class WWE extends Fight{

	public WWE() {
		super(9999);
		
	}

	@Override
	void fight() {
		System.out.println("WWE�� �뺻��� �����մϴ�");
		
	}
	
}
class UFC extends Fight{

	public UFC() {
		super(13000);
		
	}

	@Override
	void fight() {
		System.out.println("UFC�� ���� �ϳ��� ���������� ��¥�� �ο�ϴ�");
		
	}
	
}
