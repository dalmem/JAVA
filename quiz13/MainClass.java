package quiz13;

public class MainClass {
	public static void main(String[] args) {
		Warrior me = new Warrior("나");
		
		Warrior p1 = new Warrior("전사");
		Wizard p2 = new Wizard("마법사");
		
//		System.out.println("----------나의 캐릭터 배쉬 사용-------------");		
//		me.bash(play2);
//		me.bash(play3);
//		
//		me.bash(play2);
//		me.bash(play3);
//		
//		play2.info();
//		play3.info();
//		play3.blizzard(me);
//		play3.blizzard(play2);
		me.bash(p1);
		me.bash(p2);
		me.bash(p1);
		me.bash(p2);
		me.bash(p1);
		me.bash(p2);
		p1.info();
		p2.info();
		Player[] arr = {me,p1};
		p2.blizzard(arr);
		p2.blizzard(arr);
	}
}
