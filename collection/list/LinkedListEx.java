package collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
	public static void main(String[] args) {
		//링크리스트는 큐와 리스트를 동시에 구현하고 있기 때문에,
		//Queue에 저장하면 큐처럼 동작, 리스트에 저장하면 리스트 처럼 동작
		//FIFO - first in first out
		
		
		Queue<String> list = new LinkedList<>();
		list.add("홍길동");
		list.add("홍길자");
		
		//System.out.println(list.peek());//값을 꺼냄
		System.out.println(list.poll());//값을 꺼내고 지움
		System.out.println(list.size());
		
		//리스트와 동일하게 동작
		//List<String> list2 = new LinkedList<>();
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("홍길동");
		list2.add("홍길자");
		list2.add("김길동");
		list2.addFirst("이순신");
		list2.addLast("김유신");
		System.out.println(list2.toString());
		
		System.out.println("2번째 인덱스에 있는 값 : "+list2.get(1));
		
	}
}
