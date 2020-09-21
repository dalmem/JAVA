package inter.basic2;

public class Dog extends Animal implements Ipet{

	@Override
	public void eat() {
		System.out.println("멍멍이는 사료를 좋아해요");
		
	}

	@Override
	public void play() {
		System.out.println("멍멍이는 멍멍");		
	}

}
