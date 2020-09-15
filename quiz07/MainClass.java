package quiz07;

public class MainClass {
	public static void main(String[] args) {
		
		ArrayPrint ap = new ArrayPrint();
		
		String[] a = {"한국","미국","영국"};
		int[] b = {1,2,3,45,72};
		
		System.out.println(ap.printArray(a));
		System.out.println(ap.printArray(b));
	}
}
