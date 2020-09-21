package inter.basic2;

public class GoldFish extends Fish implements Ipet{

	@Override
	public void swim() {
		System.out.println("금생선");
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("금붕어는 금생선");
	}

}
