package exception.trycatch;

public class TryCatchEx02 {
	public static void main(String[] args) {
		//반복문에서 예외처리
		String[] arr = {"홍길동","이순신","강감찬"};
		int i = 0;
		while(i < 4) {//4번째에서 에러
			try {
				System.out.println(arr[i]);
				
			} catch (Exception e) {
				System.out.println("배열의 범위를 벗어났습니다.");
			}finally {
				System.out.println("이 문장은 예외와 상관없이 항상 출력");
			}
			
			i++;
			
			
		}
	}
}
