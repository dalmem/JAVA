package quiz;

import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {

		String str = java(3);
		System.out.println(str);
		int sum =sum(4);
		System.out.println("약수의 합 : " +sum);			
		System.out.println("17까지 소수개수 : " + primeNum(17));
		System.out.println("7~9사이의 합 : "+ sumNum(7,9));
		System.out.println("9~7사이의 합 : "+ sumNum(9,7));
		System.out.println("5~5사이의 합 : "+ sumNum(5,5));
	}

	static String java(int a) {// 문자열 출력
//		char[] arr = new char[a];
//		String str = "";
//
//		for (int i = 0; i < arr.length; i++) {
//			if(i%2==0)
//				arr[i]='자';
//			else
//				arr[i]='바';
//		}
//		for (char i =0; i < a ;i++) {
//			str += arr[i];
//		}
//		return str;
		String result = "";
		for (int i = 0; i < a; i++) {
			String str = i%2 ==0?"자":"바";
			result +=str;
		}
		return result;
	}

	static int sum(int a) { //약수 합

//		int sum = 0;
//		for (int i = 1; i <= a; i++) {
//			for (int j = 1; j <=i; j++) {
//				if(j*i==a) {
//					sum += j+i;
//					if(i==j) {
//						sum=sum-i;
//					}
//
//				}
//			}
//		}
//		return sum;
		int sum =0;
		for (int i = 1; i <= a; i++) {
			if(a%i ==0)
				sum+=i;
		}
		return sum;
	}

	static int primeNum(int a) {	//소수개수
		int count = 0;
		int cnt = 0;
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {				
				if(i % j==0) {					
					cnt++;
				}				
			}
			if (cnt == 2){
				count++;
			}cnt=0;
		}
		return count;
	}

	static int sumNum(int a, int b) {
		int sum =0;
		
			for (int i = (a>b? b:a); i <=(a>b? a:b); i++) {

				sum+=i;
			}
		
		
		return sum;
	}
}
