import java.util.ArrayList;

public class D01_ArrayList {
	
	// JAVA Collections : �ڹٿ��� �����ϴ� �ڷᱸ�� Ŭ����
	
	// ArrayList
	//	ũ�Ⱑ �ڵ����� �����Ǵ� �迭
	//	�߰��� ������ ���� ���� ���� �ִ�
	//	�迭�� ������ �����̱� ������ ���������� �����Ϳ� ���� �� �� ���� �����ϴ�
	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		// add() : ����Ʈ�� �������� ��Ҹ� �߰�
		list1.add("ȫ�浿");
		list1.add(30);
		list1.add("010-1234-5869");
		list1.add("C���");
		
		// �����Ͱ� ���� ������� �� ����
		System.out.println(list1);
		
		// get(int index) : �ش� ��°�� �����͸� �����´�
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		// add(index, element) : ���ϴ� ��ġ�� ��Ҹ� �߰��Ѵ�
		list1.add(1, true);
		System.out.println(list1);
		
		// get���� �������� �����ʹ� ����Ÿ���� Object�� (����� �ϱ� ���ؼ� �ٿ�ĳ������ �ʿ���)
		System.out.println("++++++�ݺ������� ���++++++++");
		for(Object obj : list1) {
			if(obj instanceof Integer) {
				System.out.println((int)obj-10);
			}else
				System.out.println(obj);
			
		}
		// remove(int index): �ش� ��ġ�� ���� �����ϸ鼭 ��ȯ
		// contains():�ش� ���� ���� �ϰ� �ִ����� ���� ���θ� ��ȯ
		
		// ������ �迭�� �ϴ� ��� �͵��� ArrayList�� �� �� �ִ�
		ArrayList Rand = new ArrayList();
		for(int i=0; i<6;++i) {
		Rand.add((int)(Math.random()*45+1));
			for(int j=0;j<i;++j) {
				if(Rand.indexOf(i)==Rand.indexOf(j)) {
					Rand.remove(i);
					Rand.add(i,(int)(Math.random()*45+1));
					continue;
					
				}
				
				
			}
		}
		System.out.println(Rand);
	}
}
