package inter.basic2;

public class MainClass {
	public static void main(String[] args) {
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		// 1. Animal 배열을 생성하고 baduk nabi hodol 저장하고, Animal의 공통기능 출력
		Animal[] ani = {baduk, nabi, hodol};
		
		
		for(Animal a : ani) {
			a.eat();
		}
		//2. Ipet 배열을 생성한 후에 baduk, nabi, goldfish 저장하고 향상된 포문으로 Ipet의 기능 사용
		// baduk이는 Animal 타입이지만 , 하위클래스가 상호연관이 있다면 형변환이 가능함	
		
		Ipet[] i = {(Ipet)baduk, (Ipet)nabi, new GoldFish()};
		for(Ipet a : i) {
			a.play();
		}
		
		
		
		System.out.println("-------------------");
		//3. 
		PetShop shop = new PetShop();
		shop.carePet(i[0]);
		shop.carePet((Ipet)nabi);
		shop.carePet(new GoldFish());
		shop.PetInfo(i);
	}
}
