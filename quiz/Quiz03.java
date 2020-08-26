package quiz;

public class Quiz03 {
	public static void main(String[] args) {
		// -5 ~ 5 절대값
		int rand = (int)(Math.random() * 11) - 5;
		System.out.println("랜덤값 : " + rand);
		System.out.println(rand + "의 절대값 : " + (rand < 0? (rand * -1) :rand));
		
	}
}
