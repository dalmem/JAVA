package anamymous.basic02;

public class MainClass {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		com.getRemote().volumeUp();
		com.getRemote().volumeDown();
		
		Tv tv = new Tv();
		tv.getR().volumeUp();
		tv.getR().volumeUp();
		tv.getR().volumeUp();
		tv.getR().volumeUp();
		tv.getR().volumeUp();
		tv.getR().volumeUp();
		tv.getR().volumeUp();
	}
}
