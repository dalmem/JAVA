package anamymous.basic02;

public class Tv {
	private int volume;
	private String power;
	private RmoteControl r;
		public Tv(){
		
			r = new RmoteControl() {
				
				@Override
				public void volumeUp() {
					if(volume == 100)return;
					volume++;
					System.out.println("volume "+volume);
					
				}
				
				@Override
				public void volumeDown() {
					// TODO Auto-generated method stub
					if(volume == 0)return;
					volume--;
					System.out.println("volume "+volume);
					
				}
				
				@Override
				public void turnOn() {

					power ="ON";
					System.out.println(power);
					
				}
				
				@Override
				public void turnOff() {
					power ="OFF";
					System.out.println(power);
					
				}
			};
			
		}
		public int getVolume() {
			return volume;
		}
		public void setVolume(int volume) {
			this.volume = volume;
		}
		public String getPower() {
			return power;
		}
		public void setPower(String power) {
			this.power = power;
		}
		public RmoteControl getR() {
			return r;
		}
		public void setR(RmoteControl r) {
			this.r = r;
		}
		
}
