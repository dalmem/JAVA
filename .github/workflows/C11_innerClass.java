
public class C11_innerClass {
	public static void main(String[] args) {
		// AppleBox���� AppleBox ������ Apple�� �����ϰ� ���� ���
		AppleBox box1= new AppleBox();
		AppleBox box2= new AppleBox();
		// Ŭ���� ������ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ� ���� ���� �ٸ� ���� ���ϰ� �ְԵȴ�.
		AppleBox.Apple a = box1.new Apple();
		AppleBox.Apple b = box2.new Apple();
	}
}

// outerclass : �ٱ��� Ŭ����
class AppleBox{
	
	// innerclass : Ŭ���� ������ Ŭ����
	class Apple{
		int color;
		int size;
		int locale;
		boolean wormEaten;
	}
	Apple[] box;
	
	public AppleBox() {
		// AppleBox Ŭ�������� Apple Ŭ������ �����ϴ� ���� ���� ����
		
		box = new Apple[10];
		for(int i=0;i<10;++i) {
			box[i] = new Apple();
			
		}
	}
	
}
