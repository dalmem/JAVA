package anamymous.basic02;

public class Computer {
	
	private int sound;
	private RmoteControl remote;
	
	public Computer() {
		remote = new RmoteControl() {
			
			@Override
			public void volumeUp() {
				sound++;
				System.out.println("컴퓨터 볼륨 +"+sound);
				
			}
			
			@Override
			public void volumeDown() {

				sound--;
				System.out.println("컴퓨터 볼륨 -"+sound);
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
		};
	}

	public int getSound() {
		return sound;
	}

	public void setSound(int sound) {
		this.sound = sound;
	}

	public RmoteControl getRemote() {
		return remote;
	}

	public void setRemote(RmoteControl remote) {
		this.remote = remote;
	}	
	
		
		
	
}
