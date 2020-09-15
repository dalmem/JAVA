package quiz05;

public class DmbPhone extends Phone  {
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	int channel;
	
	DmbPhone(){
		
	}	
	DmbPhone(String dModel, String dColor, int dChannel){
		color= dColor;
		model = dModel;
		channel = dChannel;
	}
	
	void turnOnDmb() {
		System.out.println("TV를 켭니다");//기능: TV를 켭니다 출력
	}
	
	void changeChannel(int tChannel) {
		channel = tChannel;
		System.out.println("채널 : "+ channel);//기능: channel변수를 전달받은 변수로 변경후 출력
	}
	
	void turnOffDmb() {
		System.out.println("TV를 끕니다");//기능: TV를 켭니다 출력
	}

}
