import java.util.Random;
public class C07_polymorphim {
	// ��ü�� ������
	//	 ��ü�� �������� ���¸� ������ �ִ�
	// 	 ���� ���̱⵵ �ϰ� �����̱⵵ �ϴ�
	
	// ��ĳ����
	//	 �ڽ� Ÿ�Կ��� �θ� Ÿ������ Ÿ��ĳ���� �ϴ°�
	// 	 ������ Ÿ�� ĳ������ �ʿ� ����

	// �ٿ�ĳ����
	//	 �θ� Ÿ�Կ��� �ڽ� Ÿ������ Ÿ�� ĳ���� �ϴ°�
	//	 Ÿ��ĳ������ �ʿ��ϴ� 
	//	 �ڽ� Ÿ���� �θ�Ÿ�Ժ��� ���� ����� ���� ������ ������ �߻��� �� �ִ�
	// 	 Ÿ�� ĳ������ �ʿ��ϴ�
	public static void main(String[] args) {
		// Dog���� Animal�� ���� : ���� ����
		// Animal���� Dog�� ���� : ���� ����
		Dog dog1= new Dog();
		Animal dog2 = new Dog(); // �� ĳ����
		
		// Dog dog3 = (Dog) new Animal();// �������� �ʴ� �ٿ� ĳ����
		Dog dog4 = (Dog) dog2;// �����ϴ� �ٿ� ĳ����(���� Dog���ٰ� ��ĳ���õ� ��ü�� �ٿ�ĳ����

		// ��ĳ������ �ϰ��� �θ�Ŭ������ �����ϴ� ��ɸ� ����Ҽ� �ִ�
		dog1.seat();
		dog1.breath();
		//dog2.seat();// dog2�� ����� Animal�̱� ������ �ɴ� ����� ����� �� ����
		dog2.breath(); // Animal�� ����� breath()�� ����� �� �ִ�
		dog4.seat(); // ��ĳ���� �ƴ� dog2�� �ٽ� Dog�� ���� seat()�� ����� �� �ִ�
	}
}
class Animal{
	String name;
	int oxygen=500000;
	void breath() {
		oxygen +=50;
	}
	void death() {
		if(oxygen<0)
			System.out.println(name+" die");
		else
			System.out.println(name +" no die");
	}
}

class Dog extends Animal{
	boolean seat() {
		return new Random().nextBoolean();
	}
}