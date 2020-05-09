
public class C05_accessModifier extends myobj.C05_publicClass
{
	// �ٸ� ��Ű������ ��ӹ��� Ŭ������ ���� ����
	public C05_accessModifier() {
		// super : ������ �θ��� �ڿ��� �����Ѵ� (�������̵尡 �ִ� ����)
		// this  : ���� �ڽ� Ŭ������ ã�� ������ �θ�Ŭ�������� ã�´�
		super._protected_int=10;
		super._public_int=10;
		
		super._protected_method();
		super._public_method();
	}
	public void public_method() {
		System.out.println("�ڽ��� �ۺ� �޼���");
	}
	
	// ���������� (����������)
	
		// �ٸ� Ŭ������ �� �ڿ��� ����� ���� ������ ������ �� �ִ�
		// (�� default package�� �ٸ� ��Ű������ ������ �� ����, import �Ұ���) 
		// 	public			: �ٸ� ��Ű������ ������ �� ���� (���� ��Ű���� ����) 
		// 	protected		: ��� ������ �ٸ� ��Ű������ ������ �� ���� (���� ��Ű���� ����)
		//	default(������)	: ���� ��Ű�� ���ο����� ������ �� ����
		//	private			: ���� Ŭ���� ���ο����� ������ �� ����
		
		public static void main(String[] args) {
			// ���� ��Ű�� ���ο��� ������ ���� private�� �����ϸ� ��� ������ �� �ִ�
			C05_publicClass samePackage = new C05_publicClass();
			
			int a = 0;		

			a = samePackage._default_int;
			a = samePackage._protected_int;
			a = samePackage._public_int;		
			
			samePackage._default_method();
			samePackage._protected_method();
			samePackage._public_method();	
			
			// �ٸ� ��Ű���� Ŭ������ �����ϴ� ��� public�� ���δ�
			myobj.C05_publicClass diffPackage = new myobj.C05_publicClass();
			a=diffPackage._public_int;
			diffPackage._public_method();
			
			// �ٸ� ��Ű���� DefaultClass�� �����Ҽ� ���� ������ ������ �ڿ��� ������ �� ����
			// myobj.DefaultClass diffPackageDefalutClass = new myobj.DefaultClass();
		}
}