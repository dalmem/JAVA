package quiz15;

public class Marine extends Unit{
	
	public Marine() {
		super(0,0,60);
	}
	public void name() {
		System.out.println("marine");
	}
	public void location() {
		
		System.out.println("마린 현재 위치 : " +this.getX()+", " + this.getY());
	}
	public void	move(int x, int y) {
		int nx;
		int ny;
		int cx;
		int cy;
		int mdis;
		/*
		 * 1. 현재좌표값에서 매개변수의 좌표만큼의 이동한 거리를 구한다.
		 * 루트근사값은  Math.sqrt(제곱근)을 이용하면 됩니다.
		 * 2. 현재의 좌표값으로 매개변수의 좌표값으로 변경
		 * 3. 이동한 거리를 정수형으로 출력
		 * 
		 */
		nx = this.getX();ny = this.getY();
		
		
		this.setX(x);
		this.setY(y);
		cx = this.getX();cy = this.getY();
	
		
			mdis = (int) Math.sqrt(( ((cx-nx)*(cx-nx)) + ((cy-ny)*(cy-ny))) );			
		
	
		System.out.println("이동한 거리 : " + mdis);
		
		
	}
	
}
