package quiz;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		 * 1~150까지 랜덤한 정수를 발생, 사과의 개수라고 가정
		 * bucket은 사과를 담을수 있는 바구니 
		 * 
		 * 랜덤한 사과에 따라서 필요한 bucket의 개수를 구하는 3항연산자  
		 */
		int bucket = 10;
		int apple = (int)(Math.random()*150) + 1;
		System.out.println("사과 : "+apple+"개");
		System.out.println("필요한 bucket의 수 : " + (apple % bucket == 0? apple / bucket + "  개" : apple / bucket + 1 + "개"));
	}
}
