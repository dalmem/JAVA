package inter.basic;

import java.io.Serializable;

public class MainClass {
	public static void main(String[] args) {
		Basic b = new Basic();
		b.method01();
		b.method02();
		b.method03();
		System.out.println(b.PI);
		System.out.println(b.ABC);
		System.out.println(Inter1.PI);// 더 좋은 사용 방법
		System.out.println(Inter2.ABC);
		
		System.out.println("===============================");
		/*
		 * 인터페이스도 하나의 데이터 타입이 될 수 있습니다.
		 * 인터페이스를 부모형 타입으로 사용할 때, 다형성의 형태와 동일하게 실행
		 * 
		 */
		Inter1 i1 = b;// Inter i1 = new Basic();
		i1.method01();
//		i1.method02();
//		i1.method03();
		
		Inter2 i2 = b;
//		i2.method01();
		i2.method02();
//		i2.method03();
		//인터페이스에서도 클래스 캐스팅을 사용 할 수 있습니다.
		Basic bb = (Basic)i1;
		
		String s =new String("홍길동");
		//Serializable ss =new String("홍길동");
		
		
	}
}
