
public class C08_instanceof {
	
	public static void main(String[] args) {
		
		Animal[] animals = {
				new Fish(), 
				new Dog(),
				new Fish(),
				new Dog()
				};
		
		// A instanceof B : A가 클래스 B의 인스턴스인지 판별해주는 연산자, 결과는 boolean타입이다
		
		
		for(Animal animal : animals) {
			if(animal instanceof Fish) {
				((Fish) animal).swim();
				
			}else if (animal instanceof Dog) {
				boolean result = ((Dog) animal).seat();
				if(result)
					System.out.println("개가 앉았습니다");
				else
					System.out.println("개가 말을 듣지 않습니다");
			}
		}
	}
}

class Fish extends Animal{
	void swim(){
		System.out.println(" 헤엄 ");
	}
}