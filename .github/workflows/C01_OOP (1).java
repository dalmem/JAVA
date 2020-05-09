import java.util.Random;
import myobj.Student;

public class C01_OOP {

	// ��ü���� ���α׷��� (OOP: Object Oriented Programming)
	//  - ���� �����ϴ� ��� ��ü�� ������ �Լ��� ǥ���� �� �ִ�
	//	- ������ ��ü�� ���¸� ��Ÿ���� �Լ�(�޼���)�� �ൿ �� ����� ��Ÿ���� 
	
	// �� ��ü (Object) : ���� �����ϴ� ��� ���� (�繰, ���� ���)

	// Ŭ���� (class)
	//	- ��ü�� ���α׷��� ���� ǥ���� ��
	//	- ��ü�� ���赵 (�����ϴ� ���������� ��ü�� ����)
	//	- Ŭ������ ���� �����ϴ� ���� ��ü�� �ν��Ͻ���� �θ���
	//	- Ŭ������ �޼���� ��ü�� �ൿ, Ŭ������ ������ ��ü�� ���¸� ��Ÿ����
	//	- Ŭ������ ������ ���� Ÿ���̴�	
	
	public static void main(String[] args) {
		// new : ���赵(Ŭ����)�� �̿��� ��ü(�ν��Ͻ�)�� ����
		// new Ŭ�����̸�(); ���� �����ڸ� ȣ���ϸ� ���ο� �ν��Ͻ��� �����
		// �ν��Ͻ��� ����� ������ �޸𸮿� ������ �Ҵ�ȴ� 
		// ������ ������ �޸� ������ Garbage Collector�� �˾Ƽ� ���ش�
		Student minsu = new Student(); 
		Student chulsu = new Student();
		Student choosinsu = new Student();
		
		// ���� ���赵�� ����������� �� �ν��Ͻ��� ������ name�� ���� �� �ִ�
		minsu.name = "�μ�";
		chulsu.name = "ö��";
		choosinsu.name = "�߽ż�";
		
		// Ŭ���� Ÿ������ �迭�� ���� �� �ִ�
		Student[] class504 = new Student[4]; 
		class504[0] = minsu;
		class504[1] = chulsu;
		class504[2] = choosinsu;
		class504[3] = new Student();
		
		// �������� : 0 ~ 3�� �л����� ����, ����, ���� ������ ������ �Ҵ��ϰ� 
		//		      ������ ��� ������ ���� �� �� ��յ� ���غ�����
		Random ran = new Random();
		double class_total = 0;
		for (int i = 0; i < 4; ++i) {
			class504[i].kor = ran.nextInt(50) + 51;
			class504[i].eng = ran.nextInt(50) + 51;
			class504[i].math = ran.nextInt(50) + 51;	
			double avg = class504[i].getAvg();
			System.out.println(i + "�� �л��� ��� ���� : " + avg);
			class_total += avg;
		}
		System.out.println("�� ��� : " + class_total / 4);
	}
}
















