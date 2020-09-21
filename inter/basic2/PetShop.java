package inter.basic2;

public class PetShop {

	//1. carePet() 메서드 선언
	// 기능 - 모든 ipet 타입을 전달 받을수 있고 , 어떤 펫타입인지 각각 확인하는 메서드

	public void carePet(Ipet ip) {
		if(ip instanceof Dog) {
			Dog d = (Dog)ip;
			d.eat();
		}else if(ip instanceof Cat) {
			Cat c = (Cat)ip;
			c.eat();
		}else if(ip instanceof Tiger) {
			Tiger t = (Tiger)ip;
			t.eat();
		}else if(ip instanceof Shark) {
			Shark s = (Shark)ip;
			s.swim();
		}else if(ip instanceof GoldFish) {
			GoldFish gf = (GoldFish)ip;
			gf.swim();
		}
	}
	//2. IPet 배열을 받아서 pet배열 안에있는 기능을 반복문으로 수행
	public void PetInfo(Ipet[] pets){

		for(Ipet p : pets) {
			p.play();
	}



}
}
