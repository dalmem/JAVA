package quiz15;

public class DropShip extends Unit {


	public Unit[] unit = new Unit[8];
	int index =0;


	public DropShip() {
		super(0, 0, 200);

	}

	public void location() {
		System.out.println("수송선 현재 위치 x : " +this.getX()+", y : " + this.getY());

	}

	public void move(int x, int y) {
		Marine m = new Marine();
		//Tank t = new Tank();
		int nx;
		int ny;
		int cx;
		int cy;
		int mdis;

		nx = getX();ny = getY();
		

		setX(x);
		setY(y);
		cx = getX();cy = getY();
		

		mdis = (int) Math.sqrt(( ((cx-nx)*(cx-nx)) + ((cy-ny)*(cy-ny))) );			
		
		for (int i = 0; i < unit.length; i++) {
			if(unit[i] != null) {
				unit[i].setX(x);
				unit[i].setY(y);
			}
		}

		System.out.println("이동한 거리 : " + mdis);
		m.move(cx, cy);
		//t.move(cx, cy);
	}
	public void ride(Unit unit) {
		
		if(unit instanceof Marine && index<=7) {
			this.unit[index] = unit;
			index++;//배열 위치 하나 증가
		}else if(unit instanceof Tank && index <=4) {
			this.unit[index] = unit;
			index+=4;
		}else {
			System.out.println("수송선 공간이 부족합니다");
			return;
		}
		//수송선 정보 출력
		System.out.print("수송선 정보 [");
		for (int i = 0; i < this.unit.length; i++) {
				if(this.unit[i] instanceof Marine)
				{
					System.out.print("Marine"+" ");
				}else if(this.unit[i] instanceof Tank)
					System.out.print("Tank"+" ");
		}
		System.out.println("]");
		
		
	}
	
	
	
	
	
	
	
}