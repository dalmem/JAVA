package exception.myexception;

import java.util.Scanner;

public class Account {
	/*
	 * 1. 잔액(balance:long)타입으로  멤버변수
	 * 2. deposit:입금기능
	 * 3. withDraw : 출금기능
	 * 4. getBalance(): 잔액확인기능
	 * 단, withDraw() 메서드에서 잔액이 출금보다 작다면 MyException을 발생시키는 코드를 작성
	 * 
	 */
	
	private long balance;
	
	public Account(long balance) {
		this.balance = balance;
	}
	public void deposit(long money){
		this.balance+=money;
		System.out.println(money+"원 입금 완료");
	}
	public void withDraw(long money) throws MyException{
		
//		try {
//		if(money <= this.balance) {
//			
//			System.out.println(money+"원 출금하시겠습니까?");
//			System.out.println("Y/N");
//			Scanner scan = new Scanner(System.in);
//			String anw = scan.next();
//			if(anw =="Y")
//				this.balance-=money;
//			else {
//				System.out.println("거래를 종료합니다.");
//			}
//		}else
//			throw new MyException();
//				
//		} catch (MyException e) {
//			System.out.println("잔액이 부족합니다");		
//		}
		if(money > balance) {
			throw new MyException("잔액이 부족합니다.");
		}else
			balance -= money;
	}
	public void getBalance() {
		System.out.println("현재 잔액 : "+this.balance);
	}
	
	
}
