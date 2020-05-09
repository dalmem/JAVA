import java.util.ArrayList;

public class D01_ArrayList {
	
	// JAVA Collections : 자바에서 제공하는 자료구조 클래스
	
	// ArrayList
	//	크기가 자동으로 조절되는 배열
	//	중간에 내용을 끼워 넣을 수도 있다
	//	배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근 할 때 가장 유리하다
	
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		// add() : 리스트의 마지막에 요소를 추가
		list1.add("홍길동");
		list1.add(30);
		list1.add("010-1234-5869");
		list1.add("C등급");
		
		// 데이터가 넣은 순서대로 들어가 있음
		System.out.println(list1);
		
		// get(int index) : 해당 번째의 데이터를 가져온다
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		// add(index, element) : 원하는 위치에 요소를 추가한다
		list1.add(1, true);
		System.out.println(list1);
		
		// get으로 가져오는 데이터는 리턴타입이 Object다 (사용을 하기 위해서 다운캐스팅이 필요함)
		System.out.println("++++++반복문으로 출력++++++++");
		for(Object obj : list1) {
			if(obj instanceof Integer) {
				System.out.println((int)obj-10);
			}else
				System.out.println(obj);
			
		}
		// remove(int index): 해당 위치의 값을 삭제하면서 반환
		// contains():해당 값을 포함 하고 있는지에 대한 여부를 반환
		
		// 예전에 배열로 하던 모든 것들을 ArrayList로 할 수 있다
		ArrayList Rand = new ArrayList();
		for(int i=0; i<6;++i) {
		Rand.add((int)(Math.random()*45+1));
			for(int j=0;j<i;++j) {
				if(Rand.indexOf(i)==Rand.indexOf(j)) {
					Rand.remove(i);
					Rand.add(i,(int)(Math.random()*45+1));
					continue;
					
				}
				
				
			}
		}
		System.out.println(Rand);
	}
}
