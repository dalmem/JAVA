package quiz15;

public abstract class Unit{
	//변수 선언 	//=======================
	private int x;
	private int y;
	private int hp;
	//=============================================
	//생성자 =============================================
	public Unit(int x, int y, int hp) {
		this.x =x;
		this.y = y;
		this.hp = hp;
	}
	//=============================================
	
	//각각 오버라이딩 해야하는 메서드는 추상메서드로 선언
	//메서드=======================
	public abstract void location();
	public abstract void move(int x, int y);
	public void stop() {
		System.out.println("정지");
	}
	//=======================
	//게터,세터 
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	//-=======================
	
	
	 
}


