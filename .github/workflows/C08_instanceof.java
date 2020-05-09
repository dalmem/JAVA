
public class C08_instanceof {
	
	public static void main(String[] args) {
		
		Animal[] animals = {
				new Fish(), 
				new Dog(),
				new Fish(),
				new Dog()
				};
		
		// A instanceof B : A�� Ŭ���� B�� �ν��Ͻ����� �Ǻ����ִ� ������, ����� booleanŸ���̴�
		
		
		for(Animal animal : animals) {
			if(animal instanceof Fish) {
				((Fish) animal).swim();
				
			}else if (animal instanceof Dog) {
				boolean result = ((Dog) animal).seat();
				if(result)
					System.out.println("���� �ɾҽ��ϴ�");
				else
					System.out.println("���� ���� ���� �ʽ��ϴ�");
			}
		}
	}
}

class Fish extends Animal{
	void swim(){
		System.out.println(" ��� ");
	}
}