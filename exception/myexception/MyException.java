package exception.myexception;

public class MyException extends Exception{
	
	private static final long serialVersionUID =1L;
	
	//사용자 예외클래스는 기본생성자, 메시지를 받는 생성자를 만듭니다
	public MyException() {
		
	}
	public MyException(String message) {
		super(message);
	}
	
}
