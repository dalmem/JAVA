import java.util.Random;
public class C07_polymorphim {
	// 객체의 다형성
	//	 객체는 여러가지 형태를 가지고 있다
	// 	 개는 개이기도 하고 동물이기도 하다
	
	// 업캐스팅
	//	 자식 타입에서 부모 타입으로 타입캐스팅 하는것
	// 	 별도의 타입 캐스팅이 필요 없다

	// 다운캐스팅
	//	 부모 타입에서 자식 타입으로 타입 캐스팅 하는것
	//	 타입캐스팅이 필요하다 
	//	 자식 타입은 부모타입보다 가진 기능이 많기 때문에 문제가 발생할 수 있다
	// 	 타입 캐스팅이 필요하다
	public static void main(String[] args) {
		// Dog에서 Animal로 갈때 : 문제 없음
		// Animal에서 Dog로 갈때 : 문제 많음
		Dog dog1= new Dog();
		Animal dog2 = new Dog(); // 업 캐스팅
		
		// Dog dog3 = (Dog) new Animal();// 성립하지 않는 다운 캐스팅
		Dog dog4 = (Dog) dog2;// 성립하는 다운 캐스팅(원래 Dog였다가 업캐스팅된 객체를 다운캐스팅

		// 업캐스팅을 하고나면 부모클래스에 존재하는 기능만 사용할수 있다
		dog1.seat();
		dog1.breath();
		//dog2.seat();// dog2는 현재는 Animal이기 때문에 앉는 기능을 사용할 수 없다
		dog2.breath(); // Animal의 기능인 breath()는 사용할 수 있다
		dog4.seat(); // 업캐스팅 됐던 dog2를 다시 Dog로 만들어서 seat()을 사용할 수 있다
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