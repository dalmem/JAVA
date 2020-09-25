package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		
//		HashMap<String,Integer> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		//map에 저장 put(키,값)
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		
		System.out.println("맵의 크기 : "+map.size());
		System.out.println(map.toString());
		
		//맵에 같은 key를 저장할 경우, key에 있는 value값을 수정합니다
		map.put(4, "신사임당");
		System.out.println(map.toString());
		
		//map에 저장된 value 값 얻기 get(키)
		
		String value = map.get(3);
		System.out.println("3번 키에 저장된 값은 : " + value);
		
		//map의 검색 containsKey(key)
		if (map.containsKey(1)) {
			System.out.println("1번 키가 존재함");//key가 있다면 true, 없다면 false
		}
		//map에 저장된 값을 순서대로 출력하려면, keySet, EntrySet
		Set<Integer> set = map.keySet();
		for(int key : set) {
			System.out.println(map.get(key));
		}
		/////////////////////////반복자////////////////////////
		Set<Integer> keySet= map.keySet();//key만 뽑아서 set으로 변경
		Iterator<Integer> iter = keySet.iterator();//반복자
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(map.get(key));
		}
		/////////////////////////////////////////////
		
		Set<Entry<Integer,String>> entry=map.entrySet();
		for(Entry<Integer,String> e :entry) {
			System.out.println(e.getKey() + " : " +e.getValue());
		}
		
		//map의 데이터 삭제 remove(키)
		map.remove(3);
		System.out.println(map.toString());
	}
}


