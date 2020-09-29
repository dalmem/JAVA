package anomymous.basic01;


interface Car{
	public void run();
}

class Tico implements Car{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("티코~~~~~~~~~~~~");
	}
	
	
}

public class Garage {
	public Car car = new Car() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("익명객체 티코입니다~~~~");
		}
	};
}
