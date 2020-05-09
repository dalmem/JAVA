
public class C14_interface {
	//JAVA의 인터페이스 
	//	abstract class와 유사하지만 여러개 상속받을 수 있는 것
	//  기본적으로 상속은 1개 밖에 받지 못한다
	// 	인터페이스가 포함된 메서드들은 모두 abstract method 이다
	// 	extends 대신 implements를 사용한다
	// 	abstract class아는 다르게 인스턴스 변수는 생성할 수 없다
	// 	모든 인터페이스에서 공통으로 사용할 static 변수 , 메서드는 정의할 수 없다
	// 	자동으로 final이 된다
	public static void main(String[] args) {
		// 자동차인  Hover와 Dog인 RecueDog가 Swim 인터페이스로 묶일 수 있다
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
		System.out.println("호버는 물의 저항력의 영향을 받지 않습니다.");
		System.out.println("초당 " + swim_power + "만큼 이동합니다.");
	}
	
}

class RecueDog extends Dog implements Swim {

	int swim_power = 10;
	
	@Override
	public void swim() {
		System.out.println("구조견이 열심히 헤엄을 칩니다.");
		System.out.println("초당 " + Swim.get_swim_distance(swim_power)
				+ "만큼 이동합니다.");
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
			System.out.println("튜브를 잡고 수영을 합니다");}
			else {
				System.out.println("물에 빠져 물을 먹었습니다");}
		}
	}




