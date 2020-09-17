package quiz13;

public class Wizard extends Player{
	
	Wizard(String name){
		this.name =name;
		this.hp = 500;
		this.mp = 1000;
		this.attack = 10;
	}
	
	void iceArrow(String name) {
		System.out.println("얼음화살 사용");
		
	}
	public void blizzard(Player[] plys) {
		System.out.println("---------------------");
		System.out.println(name + "님이 눈보라를 사용");
		for(Player p :plys) {//길이만큼 회전
			int damage =(int)(Math.random()*6)+10;
			p.hp -= damage;
			System.out.println(p.name + "님이 " +damage+"만큼의 피해를 입었습니다");
		}
	}
}
