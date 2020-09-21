package inter.basic2;
//implements 키워드는 extends보다 뒤에 있어야 합니다
public class Cat extends Animal implements Ipet{

	@Override
	public void eat() {
		System.out.println("고양이는 x냥이..");		
	}

	@Override
	public void play() {
		System.out.println("고양이는 주인이에요.");
	}
	

}
