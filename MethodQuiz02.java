package quiz;

import java.util.Arrays;

public class MethodQuiz02 {
	public static void main(String[] args) {
		method01();
		
		String str = method02("하이");
		System.out.println("메서드 2번 : " + str);
		
		double m3 = method03(1,2,3.0);
		System.out.println("메서드 3번 : " +m3);
		
		String str2 = method04(3);
		System.out.println("메서드 4번 : " + str2);
		
		method05("가나다라마바사",3);
		
		int max = maxNum(7,6);
		System.out.println("7,6 중 큰 수는 : " +max);
		
		int abs = abs(-1);
		System.out.println("abs : "+abs);
		
		char[] ch = {'a','b','c','d'};
		System.out.println("메서드 06 : " +method06(ch));
		
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println("메서드 07 : "+method07(arr));
		
		String[] m8 = method08("좋은","하루");
		System.out.println("메서드 08 : " +Arrays.toString(m8));
	}
	static void method01() {
		System.out.println("메서드 1번 : 안녕");
	}
	static String method02(String str) {
		
		return str;
	}
	static double method03(int a, int b, double c) {
		return a+b+c;
	}
	static String method04(int a) {
		if(a % 2== 0) {
			return "짝수";
		}else
			return "홀수";
	}
	static void method05(String str, int a) {
		for (int i = 0; i < a; i++) {
			System.out.println("메서드 5번 : " +str);
		}
	}
	static int maxNum(int a, int b) {
		return a > b ? a:b;
	}
	static int abs(int a) {
		return a>=0? a:-a;
	}
	static String method06(char[] ch) {
		String str = "";
		for(char c : ch) {
			str += c;
		}
		return str;		
	}
	static int method07(int[] a){
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	static String[] method08(String str, String str2)
	{
		String[] arr = {str, str2};
		return arr;
	}
	
}
