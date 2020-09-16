package quiz10;

import java.util.Arrays;

public class MyCart extends Cart{
	int sum;
	//1. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액을 초기화합니다. tv=300원, com=400원, radio=500원 으로 초기화
	MyCart(int price){
		this.money = price;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
		
	}
	//2. buy(), add(), info() 메서드를 오버라이딩 합니다.
	void buy(String product) {
	/*
	 * buy()의 기능
	 * 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료.
	 *    매개변수가 tv, com, radio가 아니더라도 "상품없음" 출력 후 종료
	 * 2. 매개변수 tv라면 금액에서 tv가격을 빼고 add(상품)을 호출
	 *    매개변수 com라면 금액에서 com가격을 빼고 add(상품)를 호출
	 *    매개변수 radio라면 금액에서 radio를 빼고 add(상품)을 호출
	 */
		if(this.money <300) {
			System.out.println("금액부족");
			return;
		}
		if(product=="tv") {
			money = money - tv;
			add("tv");
			sum +=300;
		}else if(product=="com") {
			money = money - com;
			add("com");
			sum +=400;
		}else if(product=="radio") {
			money = money - radio;
			add("radio");
			sum +=500;
		}else {
			System.out.println("상품없음");
		}
		
		
	}
	void add(String product) {
		
	/*
	 * add()의 기능
	 * 1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 *    -기존의 장바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장구니에 담는다.
	 * 3. info() 메서드를 호출
	 */
		for (int i = 0; i < cart.length; i++) {
			if(i >= cart.length) {
				cart = new String[cart.length *2];
			}
			if(product == "tv"||product =="com"||product =="radio")
				{cart[i]= product;
					
			}
			
		}info();
		
	}
	

	/*
	 * info()의 기능
	 * 
	 * 2. 장바구니에 담긴 물건 목록을 + 금액을 더해서 출력
	 * 3. 메인에서 buy()를 실행 시킨다.
	 */
	void info() {
		
		String[] print = new String[cart.length];
		for (int i = 0; i < cart.length; i++) {
			
			System.out.print(cart[i]+ " ");
			
		}
		
	}


	
}
