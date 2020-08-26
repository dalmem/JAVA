package quiz;

public class Quiz05 {
	//-5 ~ 5 까지 랜덤값을 만들고 0이라면 0출력, 양수라면 양수 , 음수라면 음수출력
	public static void main(String[] args) {
		char run = 'r';
		
		while(run == 'r') {
		
			int rand = (int)(Math.random() * 11) - 5;
			System.out.println("랜덤값 : " + rand + "\n"+(rand > 0? "양수" : rand == 0? "0" :"음수"));
		
		
			if(rand == 5)run ='s';
		}
	}
	
	
}
