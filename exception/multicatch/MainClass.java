package exception.multicatch;

public class MainClass {

	public static void main(String[] args) {


		/*
		 * main메서드 실행 매개값을 주는 방법,
		 * run탭 ->run configuration -> arguments ->${string_prompt}{인자를 입력받아 실행 하는 명령어}
		 */
		try {

			String data1 = args[0];
			String data2 = args[1];

			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);

			System.out.println("두 수의 합: " +(num1 + num2));
			String s = null;
			s.charAt(0);
		} catch (ArrayIndexOutOfBoundsException  | ClassCastException e) {
			System.out.println("매개값은 반드시 2개를 전달해주세요");
		} catch(NumberFormatException e) {
			System.out.println("매개값은 반드시 숫자형태로 전달하세요");
		}catch(Exception e) {
			//Exception은 모든 실행 예외의 부모클래스이기 때문에 모든 예외를 처리
			System.out.println("기타 예외 입니다");
		}
	}
}
