package quiz10;

public class MyCartT extends Cart{

	MyCartT(int money){
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;		
	}

	void buy(String product) {
		if(this.money < 300) {
			System.out.println("금액부족");
			return;
		}else if( !(product.equals("tv")||product.equals("com")||product.equals("radio")) ) {
			System.out.println("상품없음");
			return;
		}else {
			switch (product) {
			case "tv":
				money -= tv;
				break;
			case "com":
				money -= com;
				break;
			case "radio":
				money -= radio;
				break;
			default:
				break;
			}
			add(product);//상품 추가 메서드 호출
		}
	}
	void add(String product) {
		if(this.i >= cart.length) {
			String[] newCart = new String[cart.length*2];
			
			for (int i = 0; i < cart.length; i++) {
				newCart[i]=cart[i];
			}
			cart = newCart; //장바구니 교체 
			
		}
		cart[i] = product; //상품을 담는 작업
		i++; //개수 증가
		info();
	}
	void info() {
		System.out.print("장바구니 목록 : ");
		for (int j = 0; j < this.i; j++) {
			System.out.print(cart[j]+" ");
		}System.out.println("\n남은금액 : "+money);
	}
}
