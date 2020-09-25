package quiz22;

import java.util.Scanner;

public class Student {
	
	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;
	private Scanner scan = new Scanner(System.in);
	
	public String inputStuinfo(){
		/*
		 * 학번, 이름 국영수 점수를 입력받음
		 * 국영수는 문자열 입력시 다시 받을 수 있도록 예외 처리 
		 */
		
		System.out.print("학생 id 입력 > ");
		setStuId(getScan().next()); 
		System.out.print("학생 이름 > ");
		setName(getScan().next());
		try {
		System.out.print("국어 점수 > ");
		setKor(getScan().nextInt());
		System.out.print("영어 점수 > ");
		setEng(getScan().nextInt());
		System.out.print("수학 점수 > ");
		setMath(getScan().nextInt());
		}catch(Exception e) {
			System.out.println("숫자만 입력하세요");
		}
		
		return stuId;
	}
	//총점, 평균, 학점을 계산 하는 메서드
	public void calcToAvg() {
		setTotal(getKor()+getEng()+getMath());
		setAvg(getTotal()/3.0);
		if(getAvg()>=90) {
			setGrade("A학점");
		}else if(getAvg()>=80) {
			setGrade("B학점");
		}else if(getAvg()>=70) {
			setGrade("C학점");
		}else if(getAvg()>=60) {
			setGrade("D학점");
		}else{
			setGrade("F학점");
		}
	}
	//학생정보 출력 메서드
	public void outputInfo() {
		System.out.printf("%4s%6s%11d점%11d점%11d점%11d점%11.2f점%10s"
				,stuId, name, kor, math, eng, total, avg, getGrade());		
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	
}
