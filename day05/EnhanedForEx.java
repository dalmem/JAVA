package day05;

public class EnhanedForEx {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		for(int i : arr) {//값
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("====================================================");
		String[] arr2 = {"월","화","수","목","금","토","일"};
		
		for(String j : arr2) {
			System.out.print(j+ " ");
		}
		System.out.println();
		System.out.println("====================================================");
		
		//향상된 for문을 이용해서 합계와 평균
		int[] score = {33,55,45};
		int sum =0;
		
		for(int k : score ) {
			sum +=k;
			
		}
		double avg = (double)sum/score.length;
		System.out.println("합계 = " + sum);
		System.out.printf("평균 = %.2f",avg);
		
	}
}
