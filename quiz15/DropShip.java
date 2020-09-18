package quiz15;

public class DropShip extends Unit {


	public Unit[] unit = new Unit[8];



	public DropShip() {
		super(0, 0, 200);

	}

	public void location() {
		System.out.println("수송선 현재 위치 x : " +this.getX()+", y : " + this.getY());

	}

	public void	move(int x, int y) {
		Marine m = new Marine();
		//Tank t = new Tank();
		int nx;
		int ny;
		int cx;
		int cy;
		int mdis;

		nx = getX();ny = getY();
		System.out.println("이동전 좌표 : " +nx+","+ny);

		setX(x);
		setY(y);
		cx = getX();cy = getY();
		System.out.println("이동할 좌표 : " +cx+","+cy);

		mdis = (int) Math.sqrt(( ((cx-nx)*(cx-nx)) + ((cy-ny)*(cy-ny))) );			


		System.out.println("이동한 거리 : " + mdis);
		m.move(cx, cy);
		//t.move(cx, cy);
	}
	public void ride(String str, String str2, int a, int b) {
		int space = 0;
		String[] unit = new String[8];
		while(space<9) {
//			if(space==8) {
//				System.out.print("공간이 부족합니다");
//				return;
//			}

			String tank = "tank";
			String marine = "marine";

			for (int i = space; i < a; i++) {
				unit[i]=tank;				
			}
			space+=4;
			for (int j = space; j < b+space; j++) {
				unit[space]=marine;
			}
			space++;
			
			


		}
		for (int i = 0; i < unit.length; i++) {
			System.out.print(unit[i]+ " ");
		}
	}
}


