package modi.constructor.pac2;

import modi.constructor.pac1.A;

public class C {

	//멤버변수
	A a1 = new A(1); //public (o)
	
	//A a2 = new A(true);//default (x) default는 다른 패키지에서 사용 불가
	//A a3 = new A("가");//private (x)
}
