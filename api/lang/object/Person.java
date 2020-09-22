package api.lang.object;

public class Person implements Cloneable{
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//오버라이딩
	@Override
	public boolean equals(Object obj) {
		//Person의 이름이 같은지 확인해서 같다면 true
		if(obj instanceof Person) {
			
			Person p = (Person)obj;
			if(p.getName().equals(this.name)) {
				System.out.println("이름이 같음");
				return true;//이름이 같다
				
			}
		}
		return false;//이름이 같지않다
	}
	
	@Override
	public String toString() {
		
		return "멤버변수:" + name;
	}
	
	//객체복사메서드
	//protected이기 떄문에, 사용시 오버리이딩을 통해 생성해야 합니다
	//또한 cloneable 인터페이스를 구현해서 사용해야 합니다.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	//메모리에서 사라지는 시점에 동작
	@Override
	protected void finalize() throws Throwable {

		System.out.println(this.name +"님 소멸했습니다");
	}
	
	
	

}
