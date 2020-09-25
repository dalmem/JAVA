package api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		double d = Math.random();
		System.out.println(d);
		
		double d1 = Math.ceil(1.1);//올림
		System.out.println(d1);
		
		d1 = Math.floor(1.5);//내림
		System.out.println(d1);
		
		d1 = Math.round(1.5);//반올림
		System.out.println(d1);
		
		d1 = Math.abs(-10);
		System.out.println(d1);//절대값
		
		d1 =Math.max(5, 10);
		System.out.println(d1);
		
				
	}
}
