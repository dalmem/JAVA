package quiz;

import java.util.Arrays;

public class Quiz20 {

	public static void main(String[] args) {
		
		//금액을 큰 금액부터 거슬러 각가 몇개가 나와야 하는지 처리
		int[] coin = {1000, 500, 100, 50 ,10};
		int money =17780;
		int i = 0;
		int sum = 0;
		int[] count = new int[coin.length];
		while(i < coin.length) {
//				if(i==0) {
//					count[i] = money / coin[i];
//					}else
//						count[i] = (money -(money / coin[i-1])*coin[i-1])/ coin[i];
//				
//			i++;
			System.out.println(coin[i] + "의 개수 : " +money/coin[i]);
			money %= coin[i];
			i++;
			}
			
		
	}
	
}
