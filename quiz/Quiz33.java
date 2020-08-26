package quiz;

import java.util.Scanner;

public class Quiz33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count=0;
		int count2=0;
		
		while(true) {
			int que = (int)(Math.random()*100)+1;
			int stion =(int)(Math.random()*100)+1;
			String[] pm = {"+","-"};
			int p_m =(int)(Math.random()*2);
			
			System.out.println(que + pm[p_m] + stion + " = ?");
			System.out.print("> ");
			int answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println("정답 : "+ count + "\n"+ "오답 : "+count2);
				break;
			}
			if(answer == que+stion || answer == que-stion) {
				System.out.println("사람이구나");
				count++;
			}else{
				System.out.println("사람이 아니구나");
				count2++;
			}
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");


		}


	}

}
