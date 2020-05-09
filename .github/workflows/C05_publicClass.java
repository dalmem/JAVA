
// class는 public과 default만 존재한다
//	public class : 	파일 이름과 동일한 클래스 
//					다른 파일이나 패키지에서 접근할 때 사용하는 대외적인 클래스
//	default class : 같은 파일 내에 존재하는 그 외의 모든 클래스
//					다른 패키지에서는 접근할 수 없다
public class C05_publicClass {
	public int _public_int;
	protected int _protected_int;
	int _default_int;
	private int _private_int;
	
	public void _public_method() {}
	protected void _protected_method() {}
	void _default_method() {}
	private void _private_method() {} 
}

class DefaultClass {
	public int _public_int;
	protected int _protected_int;
	int _default_int;
	private int _private_int;
	
	public void _public_method() {}
	protected void _protected_method() {}
	void _default_method() {}
	private void _private_method() {} 
}
