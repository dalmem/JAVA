package day04;

public class ForEx01 {
	//1~ 100 합
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i; 
			
		}
		System.out.println("1~ 100 합 : " + sum);
		for (int i = 10; i >0; i--) {
			System.out.println(i);
			
		}
	}
}
