package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		
		//1~100까지 랜덤한 정수를 발생시킨다음에 짝수인지 홀수인지 
		int rand = (int)(Math.random() * 100) + 1;
		System.out.println("Random값 : "+rand);
		System.out.println(rand % 2 == 0? "짝수입니다." : "홀수입니다"); 
	}
}
