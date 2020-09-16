package quiz12;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard k ;
	private Mouse m ;
	private Monitor mo ;
	
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer(){
		this.k =new KeyBoard();
		this.m = new Mouse();
		this.mo = new Monitor();
	}
	
	//모든 멤버변수를 받는 생성자
	public Computer(KeyBoard k, Mouse m, Monitor mo){
		this.k = k;
		this.m = m;
		this.mo = mo;
	}

	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo(){
		System.out.println("==============시스템 정보 =============");
		k.info();
		m.info();
		mo.info();
	}
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getK() {
		return k;
	}

	public void setK(KeyBoard k) {
		this.k = k;
	}

	public Mouse getM() {
		return m;
	}

	public void setM(Mouse m) {
		this.m = m;
	}

	public Monitor getMo() {
		return mo;
	}

	public void setMo(Monitor mo) {
		this.mo = mo;
	}


	

	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
		
	
	
}
