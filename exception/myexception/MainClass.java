package exception.myexception;

public class MainClass {
	public static void main(String[] args) {
		try {
			Account ac = new Account(20000);
			ac.deposit(10000);
			ac.withDraw(300000);

			ac.getBalance();

		} catch (MyException e) {
			System.out.println(e.getMessage());
			//System.out.println(e.getClass());
		}

		
	}
}
