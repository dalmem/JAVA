package quiz22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point extends Student implements InterPoint{

	@Override
	public void showPointUI() {

		System.out.println("===========================================================");
		System.out.printf("%4s%10s%10s%10s %11s%11s%11s %11s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점"
				, "평균", "학점");
		System.out.println("===========================================================");
	}

	@Override
	public void input(List<Student> students) {
		Student stu =new Student();
		stu.inputStuinfo();
		stu.calcToAvg();
		students.add(stu);
	}

	@Override
	public void showAll(List<Student> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			list.get(i).outputInfo();
			System.out.println();
			sum += list.get(i).getAvg();
		}System.out.println("반 평균 점수: "+sum/list.size());

	}

	@Override
	public void search(List<Student> students) {
		System.out.println("학번 > ");
		String name = getScan().next();
		int index =0;
		String s = null ;
		for (int i = 0; i < students.size(); i++) {
			if(students.get(i).getName().equals(name)){
				index = i;
				
			}
			if(!(students.get(i).getName().equals(name)))
				s="no";
		
		}System.out.println("이름: " +students.get(index).getName());
		System.out.println("학번: " +students.get(index).getStuId());
		System.out.println("평균: " +students.get(index).getAvg());
		
		if(s.equals("no")) {
			System.out.print("그런 애 없어요 !");
		}

	}

	@Override
	public void modify(List<Student> students) {
		System.out.println("학번 > ");
		String name = getScan().next();
		for (int i = 0; i < students.size(); i++) {
			if(name.equals(students.get(i).getStuId())){
				System.out.print("국어 점수 수정 > ");
				students.get(i).setKor(getScan().nextInt());
				System.out.print("영어 점수 수정 > ");
				students.get(i).setEng(getScan().nextInt());
				System.out.print("수학 점수 수정 > ");
				students.get(i).setMath(getScan().nextInt());
				calcToAvg();

			}else
				System.out.println("찾는 학번이 없습니다.");
		}

	}

	@Override
	public void delete(List<Student> students) {
		System.out.println("학번 > ");
		String name = getScan().next();
		for (int i = 0; i < students.size(); i++) {
			if(name.equals(students.get(i).getStuId())) {
				students.remove(students.get(i));
			}else {
				System.out.println("찾는 학번이 없습니다.");
			}

		}

	}
}
