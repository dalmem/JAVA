package exception.throws_;

public class MainClass {
	public static void main(String[] args) {

		try {

			new ThrowsEx02();
		} catch (Exception e) {
			
			System.out.println("예외발생");			
		}
	}
}
