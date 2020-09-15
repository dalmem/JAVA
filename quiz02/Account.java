package quiz02;

public class Account {
	
	String name;
	String password;
	int balace;
	
	Account(){
		
	}
	Account(String pName, String pPassword,int pBalace){
		
		name = pName;
		password = pPassword;
		balace = pBalace;
	}
	void deposit(int price) {
		balace += price;
	}
	void withDrwa(int price) {
		if(balace > price)
			balace -=price;
		else
			System.out.println("잔액부족");
	}
	int getbalance() {
		return balace;
	}
	
}
