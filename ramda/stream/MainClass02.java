package ramda.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClass02 {
	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(r.nextInt(100)+1);//1~100까지 랜덤수
		}
		System.out.println("처음" + list.toString());
		System.out.println("=======================");
		//중복제거 distinct() - stream의 중간처리 메서드는 처리 결과를 다시 stream타입으로 반환합니다
		list.stream().distinct().forEach((s)-> System.out.print(s+" "));
		System.out.println();
		System.out.println("=======================");
		
		//정렬 sort()
		list.stream().distinct().sorted().forEach((s)-> System.out.print(s+" "));
		System.out.println();
		System.out.println("=======================");
		
		//필터링 filter()
		list.stream().distinct().sorted().filter((t)->{
			//....
			return t %3 == 0;
		}).forEach((s)->System.out.print(s+" "));
		System.out.println();
		System.out.println("=======================");
		
		//map() - 람다안에 정의 된 새로운 stream타입으로 반환
		list.stream().distinct().sorted().map((i) -> i%2 == 0? "짝수":"홀수").forEach((t)-> System.out.print(t+" "));
		System.out.println();
		System.out.println("=======================");
		
		//최종처리 - collect() 스트림의 처리된 결과를 list로 반환
		List<Integer> result = list.stream().sorted().filter((t)->t%3==0
		).collect(Collectors.toList());//리스트로 반환받곘다는 의미
		System.out.println(result.toString());
		
		//최종처리 - max() 큰값 찾기
		list.stream().distinct().max((a,b)-> a>b ? a:b);
	}
}
	