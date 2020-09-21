package quiz15;

public class Tank extends Unit{

	public Tank() {
		super(0, 0, 220);
		// TODO Auto-generated constructor stub
	}
	public void location() {
		
		System.out.println("탱크 현재 위치 : " +this.getX()+",  " + this.getY());
	}
	public void	move(int x, int y) {
		int nx;
		int ny;
		int cx;
		int cy;
		int mdis;
	
		nx = this.getX();ny = this.getY();
		
		
		this.setX(x);
		this.setY(y);
		cx = this.getX();cy = this.getY();
		
		
			mdis = (int) Math.sqrt(( ((cx-nx)*(cx-nx)) + ((cy-ny)*(cy-ny))) );			
		
	
		System.out.println("이동한 거리 : " + mdis);
		
		
	}

}
