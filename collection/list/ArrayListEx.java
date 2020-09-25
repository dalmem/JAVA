package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		//ArrayList객체 생성
		//ArrayList<String> list = new ArrayList<>();
		//Collection<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		//list의 값 추가 add()
		list.add("JAVA");
		list.add("DataBase");
		list.add("JSP");
		list.add("SPRING");
		list.add("JAVA");
		
		//list의 크기 size()
		
		System.out.println("list의 크기 : " +list.size());
		
		//list의 저장된 객체를 문자열로 확인 toString()
		System.out.println(list.toString());
		
		//list의 중간에 추가 add(index, 값)
		list.add(2, "ORACLE");
		System.out.println(list.toString());
		
		//list의 값 얻기 get(index)
		String value = list.get(2);
		System.out.println("list의 2번째 인덱스 값: " +value);
		
		//list의 특정값 포함여부 contains(값)
		if(list.contains("JSP")){//값이 있으면 true, 없으면 false
			System.out.println("JSP가 포함 되어 있음");
		}
		
		//list 삭제 remove(값),remove(index)
		list.remove(0);
		System.out.println(list.toString());
		
		//addAll(리스트)
		String[] arr = {"React","AWS"};
		List<String> list2 = Arrays.asList(arr);
		
		list.addAll(list2);
		
		System.out.println(list.toString());
	}
}
