package poly.basic2;

public class MainClass {

		public static void main(String[] args) {
			
			
			Child c= new Child();
			c.method01();
			c.method02();
			c.method03();
			Parent p = c;
			p.method01();
			p.method02();
//			p.method03();
			
			System.out.println(p);
			System.out.println(c);
			System.out.println(p==c);//동일한 주소값
			System.out.println("==================클래스 캐스팅 ===============");
			/*
			 * 다형성 적용시 자식이 원래 가지고 있던 멤버에 접근 할 수 없는 문제가 발생하는데
			 * 클래스 캐스팅으로 본래의 형태로 변경이 가능합니다
			 * 단, 다형성이 일어나지 않은 객체를 대상으로 캐스팅을 실행하면
			 * 에러가 발생합니다.
			 */
			Child cc = (Child)p;
			cc.method01();
			cc.method02();
			cc.method03();
			
			//Parent pp = (Parent)new Object(); //(x)
		}
}
