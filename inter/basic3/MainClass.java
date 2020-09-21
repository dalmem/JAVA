package inter.basic3;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		Printed p = new LG();
		p.turnOn();
		p.Print("가나다");
		p.colorPrint("라마바","빨강");
		p.copy(10);
		p.turnOff();
	}
}
