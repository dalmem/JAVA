package quiz;

public class test001 {
	public static void main(String[] args) {
		int[] arr = new int[24];
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0)
				arr[i]=0;
			else
				arr[i]=1;			
			System.out.print(arr[i]+ " ");

		}
	}

}

