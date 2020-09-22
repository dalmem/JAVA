package exception.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {
	
	public static void main(String[] args) {
		/*
		 * throws
		 * 메서드나, 생성자에서 발생되는 예외를 떠넘기는 코드가 throws입니다
		 * throws구문이 붙어있는 메서드, 생성자를 호출 할때는, 예외처리를 대신 진행해야 합니다.
		 * 즉, **예외처리를 강요할 때 사용합니다.
		 */
		try {
			
			greet(10);
		} catch (Exception e) {
			System.out.println("배열의 범위를 벗어났습니다");
		}
		
		//대표적인 thorws메서드
		try {
			Class.forName("#%$");
		} catch (ClassNotFoundException e) {//ClassNotFound 예외를 핸들링 후 사용
			System.out.println("클래스를 찾을 수 없습니다.");
			
		}
		//대표적인 throws 생성자
		try {
			new FileInputStream("#@&$^");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");			
		}
		
	}
	
	
	private static String[] greeting = {"헬로","안녕","니하오"};
	public static void greet(int index) throws Exception{
		System.out.println(greeting[index]);
	}
}
