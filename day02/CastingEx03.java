package day02;

public class CastingEx03 {
	public static void main(String[] args) {
		
		// 연산에서의 형변환
		char c = 'C';
		int i = 2;
		
		//1. 서로 다른 타입의 연산에서 큰 타입에 맞추어 자동 형변환 됩니다.
		char cc = (char)(c + i);
		int	ii = c + i;
		System.out.println(cc); //E
		System.out.println(ii); //69
		
		int j = 10;
		double d = 3.14;
		int result = (int)(j + d);
		System.out.println(result);
		
		//2. int형보다 작은 타입의 연산 결과는 int가 됩니다.
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2); 
		
		short s1 = 100;
		byte b4 = 10;
		short ss = (short)(s1 + b4); 
		// short, byte는  int보다 작아 둘의 연산은 자동으로 int로 형변환됨. 이 수식이 완료되려면 short로 타입캐스팅 필요
	}
}
