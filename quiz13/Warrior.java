package quiz13;

public class Warrior extends Player{
	// 1. 생성자: name만 전달받아서 hp = 1000, mp = 500, attack = 10초기화
	// 2. bash스킬은 player 타입을 받아서 각가의 직업에 따라 해당 객체의 hp를 다르게 감소.

	Warrior(String name){
		this.name =name;
		this.hp = 1000;
		this.mp = 500;
		this.attack = 10;
	}
	void bash(Player p) {
		System.out.println(p.name + "님 때리기 스킬 적중");
		if(p instanceof Warrior) {
			p.hp -=100;
			this.mp -=100;
		}else if(p instanceof Wizard) {
			p.hp -=200;
			this.mp -=100;
		}
		if(this.mp<50) {
			System.out.println("mp가 부족합니다");
		}


	}

}
