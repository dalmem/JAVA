package quiz;

public class Quiz27 {
	
	public static void main(String[] args) {
		for (int i = 1; i <=9; i+=3) {
			
			for (int j = 1; j <=9; j++) {
									
				System.out.println(i + " x " + j + " = " + j*i+"\t"+(i+1) + " x " + j + " = " + j*(i+1)+"\t"+(i+2) + " x " + j + " = " + j*(i+2)+"\t");
				
			}
			System.out.println();
			
		}
	}
}
