package exception.throws_;

public class ThrowsEx02 {
	
	
	public void bbb(int i) throws Exception {
		
		System.out.println("bbb호출");
		
		System.out.println(10/i);		
		
		System.out.println("bbb종료");
	}
	public void aaa() throws Exception{
		System.out.println("aaa호출");
		bbb(0);
		System.out.println("aaa종료");
	}
	//생성자
	public ThrowsEx02() throws Exception{
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
		
	}
}
