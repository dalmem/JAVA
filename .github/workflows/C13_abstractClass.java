
public class C13_abstractClass {
	
	// 추상 클래스
	//	구현은 나중으로 미루는 문법
	//	이 클래스를 상속받을 클래스에게 구현을 미룬다
	
	// 	abstract method : 이 메서드는 여기서 구현 안하고 , 상속받은 자식 클래스가 오버라이드 해서 구현 함
	//	abstract class : 추상 메서드를 포함하고 있습니다
	public static void main(String[] args) {
		Fight[] fights = {new WWE(), new UFC()};
		// abstract class를 상속받은 클래스들은
		// abstract method를 오버라이드 하는 것이 강제가 되어있기 때문에
		// 안심하고 abstract method를 사용할 수 있다
		for (Fight f : fights) {
			f.fight();
		}
	}
	// myobj에 abstract class, method를 이용하여 클래스를 정의해 보세요
}

//  이 클래스는 abstract 메서드를 포함하고 있습니다
//	그래서 인스턴스를 생성할 수 없습니다
abstract class Fight{
	int fightMoney;
	
	abstract void fight(); // abstract method는 method body를 만들 수 없다
	
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
		System.out.println("WWE는 대본대로 연기합니다");
		
	}
	
}
class UFC extends Fight{

	public UFC() {
		super(13000);
		
	}

	@Override
	void fight() {
		System.out.println("UFC는 둘중 하나가 죽을때까지 진짜로 싸웁니다");
		
	}
	
}
