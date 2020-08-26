package quiz;

public class Quiz21 {
	
	public static void main(String[] args) {
		
		//Math.random()을 이용해 2~9까지 랜덤수를 만들고 해당단수에 대한 구구단을 출력
		int gu =(int)(Math.random() * 8) + 2;
		
		for (int i = 1; i < 10; i++) {
			//System.out.println(gu +" x "+ i+" = " + gu*i);
			System.out.printf("%d x %d = %d\n",gu,i,gu*i);
		}
	}
}
