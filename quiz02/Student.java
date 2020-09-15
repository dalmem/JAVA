package quiz02;

public class Student {

	/*
	 *   멤버변수
	 *   name - 이름
	 *   no - 번호
	 *   kor - 국어
	 *   eng - 영어
	 *   math - 수학
	 *   생성자
	 *   멤버변수 5개를 초기화하는 생성자
	 *   
	 *   getTotal() - 국, 영, 수 점수의 합계를 반환
	 *   getAvg() - 총점을 나눈 평균을 (소수점 2자리까지)반환
	 *   main에서 학생 2명을 생성해서 각각확인
	 */
	String name;
	int no;
	int kor,eng,math;
	Student(){
		
	}
	Student(String gName, int gNo, int gKor, int gEng, int gMath ){
		name = gName;
		no = gNo;
		kor = gKor;
		eng = gEng;
		math = gMath;
		
	}
	int getTotal() {
		return kor + eng + math;
	}
	double getAvg() {
		
		int sum = getTotal();
//		return (double)(sum/3.0);
		return (int)(sum /3.0 * 100)/100.0;
	}
	
}
