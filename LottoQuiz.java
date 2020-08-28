package quiz;

import java.util.Arrays;

public class LottoQuiz {


	public static void main(String[] args) {
		int[] arr = LottoNum();
		System.out.println("내가 찍은 번호 : "+Arrays.toString(arr));
		long money = LottoRun(arr);
		System.out.println("당첨되기까지 사용금액 = "+money+"원 " + "\n"+"총 횟수 : "+money/1000+"회");
	}//Arrays.equals(arr,arr2)

	static int[] LottoNum() {

		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			lotto[i]=(int)(Math.random() * 45)+1;
			for (int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j])
					i--;
			}
		}Arrays.sort(lotto);

		return lotto;
	}

	static long LottoRun(int[] arr) {
		char run = 'r';
		long sum =0;
		while(run == 'r') {

			int[] lottoRun=new int[6];
			for (int i = 0; i < 6; i++) {
				lottoRun[i]=(int)(Math.random() * 45)+1;
				for (int j = 0; j < i; j++) {
					if(lottoRun[i]==lottoRun[j])
						i--;
				}
			}Arrays.sort(lottoRun);
			sum+=1000;
			
			if(Arrays.equals(arr, lottoRun)) {
				System.out.println("당첨번호 : " +Arrays.toString(lottoRun));
				run ='s';}
			
		}
		return sum;
	}
}
