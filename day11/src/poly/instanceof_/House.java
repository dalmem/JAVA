package poly.instanceof_;

import java.util.Arrays;

public class House {
//	private Student[] students;
//	private Teacher[] teachers;
//	private Employee[] employees;
//	private int count1 =0;
//	
//	public House() {
//		students = new Student[100];
//		teachers = new Teacher[100];
//		employees = new Employee[100];
//		
//	}
//	public void setIn(Student s) {
//		students[count1] = s;
//		count1++;
//	}
	
	/*
	 * 1. 300개 크기의 Person배열 생성
	 * 2. count 변수 선언
	 * 3. setIn() 모든 자식클래스를 받아서 Person배열에 저장되도록 선언
	 * 4. 메인클래스에서 6명의 Person을 전달
	 * 
	 */
	private Person[] persons = new Person[300];
	 private int count=0;
	 	 
	 public void setIn(Person p) {
		 persons[count]= p;
		 count++;
		 System.out.println(Arrays.toString(persons));
	 }
}
