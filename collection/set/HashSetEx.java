package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		//set계열은 순서x , 중복x
		
		//HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//set의 추가 add()
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA");
		
		//set에 저장된 크기 size()
		System.out.println("set의 크기 : "+set.size());
		System.out.println(set.toString());
		
		
		//set에 저장된 객체를 확인하려면, 반복자를 통해 한번씩 확인합니다.
		Iterator<String> iter =  set.iterator();//set을 반복자 타입으로 변경함
		while(iter.hasNext()) {//다음에 대한 조회
			System.out.print(iter.next()+" ");//다음에 접근
		}
		//set의 검색
		if(set.contains("JSP"))
			System.out.println("JSP가 포함되어 있음");
		//set의 삭제
		set.remove("JAVA");
		System.out.println(set.toString());
		
	}
}
