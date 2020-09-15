package quiz02;

public class MainClass {
	
	public static void main(String[] args) {
//		Person p1 = new Person("홍길동",20,180);
//		p1.info();
//		
//		System.out.println("--------------------");
//		
//		Person p2 = new Person();
//		p2.age = 40;
//		p2.name = "김길동";
//		p2.tall = 170;
//		
//		p2.info();
		
//		Account myAcc = new Account("홍길동","1234",3600);
//		
//		myAcc.deposit(800);
//		myAcc.withDrwa(1900);
//		
//		int bal = myAcc.getbalance();
//		System.out.println(myAcc.name +"님의 계좌 잔액은 : "+ bal + "원 입니다.");
		
		Student chul = new Student("철수",1,30,40,60);
		System.out.println("합계 : " +chul.getTotal());
		System.out.println("평균 : " +chul.getAvg());
		
		
		Student min = new Student("민수",1,31,44,65);
		System.out.println("합계 : " +min.getTotal());
		System.out.println("평균 : " +min.getAvg());
		
	}
}
