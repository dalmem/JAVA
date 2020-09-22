package quiz19;


import java.util.Scanner;

public class Calculator {

	
	public int input() throws Exception{
		/*
		 * 1. 정수를 2개 받습니다
		 * 2. 입력한 값이 정수라면 합계를 반환하면 됩니다.
		 * 3. 예외가 발생할 수 있는 상황이라면 메서드를 종료하고 예외메서지를 전달해주면 됩니다
		 * 4. scan.close() 또한 적절하게 처리해주세요.
		 */
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			System.out.print("정수 입력 > ");
			int a = scan.nextInt();
			System.out.print("정수 입력 > ");
			int b = scan.nextInt();
			
			return a+b;
					
		}catch(Exception e) {
			throw new Exception("숫자 값을 전달하세요");

			
		}finally {
			scan.close();
		}
	
		
		
	}
}
