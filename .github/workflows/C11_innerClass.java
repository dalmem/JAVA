
public class C11_innerClass {
	public static void main(String[] args) {
		// AppleBox에서 AppleBox 내부의 Apple에 접근하고 싶은 경우
		AppleBox box1= new AppleBox();
		AppleBox box2= new AppleBox();
		// 클래스 내부의 클래스는 외부 클래스의 인스턴스 마다 각각 다른 값을 지니고 있게된다.
		AppleBox.Apple a = box1.new Apple();
		AppleBox.Apple b = box2.new Apple();
	}
}

// outerclass : 바깥의 클래스
class AppleBox{
	
	// innerclass : 클래스 내부의 클래스
	class Apple{
		int color;
		int size;
		int locale;
		boolean wormEaten;
	}
	Apple[] box;
	
	public AppleBox() {
		// AppleBox 클래스에서 Apple 클래스에 접근하는 것은 아주 쉽다
		
		box = new Apple[10];
		for(int i=0;i<10;++i) {
			box[i] = new Apple();
			
		}
	}
	
}
