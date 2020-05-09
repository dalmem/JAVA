
public class C14_interface {
	//JAVA�� �������̽� 
	//	abstract class�� ���������� ������ ��ӹ��� �� �ִ� ��
	//  �⺻������ ����� 1�� �ۿ� ���� ���Ѵ�
	// 	�������̽��� ���Ե� �޼������ ��� abstract method �̴�
	// 	extends ��� implements�� ����Ѵ�
	// 	abstract class�ƴ� �ٸ��� �ν��Ͻ� ������ ������ �� ����
	// 	��� �������̽����� �������� ����� static ���� , �޼���� ������ �� ����
	// 	�ڵ����� final�� �ȴ�
	public static void main(String[] args) {
		// �ڵ�����  Hover�� Dog�� RecueDog�� Swim �������̽��� ���� �� �ִ�
		Swim[] swimmers = {
				new Hover(), 
				new RecueDog(),
				new BeerBottle(),
		};
		for(Swim s : swimmers) {
			s.swim();
		}
	}
}
interface Swim {
	static double water_regist = 8.8;
	
	static double get_swim_distance(int swim_power) {
		return water_regist * swim_power / 100;
	}
	
	abstract void swim();
}

class Car {}

class Hover extends Car implements Swim {
	int swim_power = 100; 
	
	@Override
	public void swim() {
		System.out.println("ȣ���� ���� ���׷��� ������ ���� �ʽ��ϴ�.");
		System.out.println("�ʴ� " + swim_power + "��ŭ �̵��մϴ�.");
	}
	
}

class RecueDog extends Dog implements Swim {

	int swim_power = 10;
	
	@Override
	public void swim() {
		System.out.println("�������� ������ ����� Ĩ�ϴ�.");
		System.out.println("�ʴ� " + Swim.get_swim_distance(swim_power)
				+ "��ŭ �̵��մϴ�.");
	}
	
}
class BeerBottle implements Swim{
	boolean hasTube = false;
	
	void getTube() {
		hasTube = true;}
	void loseTube() {
		hasTube = false;}
	
	@Override
	public void swim() {
		if(hasTube) {
			System.out.println("Ʃ�긦 ��� ������ �մϴ�");}
			else {
				System.out.println("���� ���� ���� �Ծ����ϴ�");}
		}
	}




