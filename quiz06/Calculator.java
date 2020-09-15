package quiz06;

public class Calculator {
	double result;
	double pi = 3.14;
	
	
	void Add(int a) {
		result +=a;
		System.out.println(result);
	}
	void Sub(int a) {
		result -=a;
		System.out.println(result);
	}
	void Multi(int a) {
		result*=a;
		System.out.println(result);
	}
	void Div(int a) {
		result /=a;
		System.out.println(result);
	}
	void Circle(int a) {
		result = a*a*pi;
		System.out.println(result);
	}
}
