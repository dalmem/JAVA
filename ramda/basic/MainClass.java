package ramda.basic;

public class MainClass {
	public static void main(String[] args) {
		//1. say01인터페이스를 구현하는 클래스를 만들고 실행
		//2. 익명객체
		
		Person p = new Person();
		p.greating(new Say01() {
			
			@Override
			public void talking() {
				// TODO Auto-generated method stub
				System.out.println("한국말 : 안녕");
			}
		});
		
		//3. 람다 표현식
		p.greating(()->{System.out.println("한국말(람다식): 안녕");});
		
		System.out.println("--------------------------------------");
		//매개변수가 있는유형
		p.greating(new Say02() {
			
			@Override
			public void talking(String word) {
				// TODO Auto-generated method stub
				System.out.println(word);
			}
		});
		p.greating((word) ->{System.out.println(word+"(람다식)");});
		System.out.println("--------------------------------------");
		//반환유형이 있는 유형
		p.greating(new Say03() {
			
			@Override
			public String talking() {
				System.out.println("finish");
				return "finish";
			}
		});	
		p.greating(() -> {
			System.out.println("finish(람다식)");
			return "finish";
		}).greating(()->{
			return "finish";
		}).greating(()->{System.out.println("안녕");});
	}
}
