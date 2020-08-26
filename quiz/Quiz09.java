package quiz;

public class Quiz09 {
	public static void main(String[] args) {
		/*
		 * 1~20까지 랜덤한 정수를 생성해서 만약 10보다 작고 , 3의배수이거나, 4의배수라면  "10 보다 작은 3또는 4의 배수 " 출력
		 * 반대의 경우에는 " 10보다 작지 않거나 3또는 4의배수가 아닙니다 출력
		 */
		int num = (int)(Math.random()*20+1);
		System.out.println("랜덤한 정수 : " + num);
		if((num%3==0 || num%4==0) && num < 10) {
			
			System.out.println("10보다 작은 3또는 4의 배수");
			
		}else
			System.out.println("10보다 작지 않거나 3또는 4의 배수가 아닙니다");
	}
}
