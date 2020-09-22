package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Object클래스(최상위 부모)
		 * - equals():동일 객체인지 확인**
		 * - hashcode() : 객체의 숫자값
		 * - toString() : 객체자체를 문자열의 형태로 반환 (오버라이딩 해서 많이 사용)**
		 * - clone() : 객체 복사
		 * - getClass() : 현재 실행되는 클래스를 반환
		 * - finalllize() : 객체가 소멸되기 전에 실행
		 */
		Person park = new Person("박찬호");
		Person kim= new Person("박찬호");
		boolean bool = park.equals(kim);
	
		System.out.println("동일 객체여부: "+bool);
		
		System.out.println(park.toString());
			
		Person clonePerson = new Person("복제인간");
		
		try {
			Person p = (Person)clonePerson.clone();
			System.out.println(p.getName());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		//객체소멸확인
		park = null;
		kim = null;
		clonePerson = null;
		System.gc();//쓰레기 수집기 실행
		
	}
}
