package encap.good;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private String ssn;
	/*
	 * 은닉된 변수에 접근할 때는 클래스 설계자가 미리 만들어 놓은
	 * getter/setter를 이용합니다.
	 * 
	 * setter 메서드 선언
	 * 1. 은닉변수에 값을 저장하기 위한 메서드
	 * 2. 접근제어자를 public으로 선언하고 이름은 (set + 멤버변수명) 으로 지정
	 */
	
	public void setYear(int year) {
		if(year <1 || year >2020) {
			System.out.println("잘못된 값 입력입니다");
		}else
			this.year = year;
	}
	/*
	 * getter메서드 선언
	 * 1. 은닉변수에 값을 조회하는 메서드
	 * 2. setter와 마찬가지로 접근제어자는 public으로 선언하고 이름은 get+멤버변수명으로 지정
	 */
	public int getYear() {
		return year;
	}
	/*
	 * 1. month, day, ssn에 getter, setter를 생성
	 * month = 1~12까지
	 * day = 1~31 까지
	 * ssn = 13자리만 저장가능
	 */
	//=========================================================
	public void setMonth(int month) {
		if(month <1 || month >12) {
			System.out.println("잘못 입력된 값입니다");
		}else
			this.month = month;
	}
	public int getMonth() {
		return month;		
	}
	//=========================================================
	
	public void setDay(int day) {
		if(day < 1|| day>31)
			System.out.println("잘못 입력된 값입니다");
		else
			this.day = day;
	}
	public int getDay() {
		return day;		
	}
	//=========================================================
	public void setSsn(String ssn) {
		if(ssn.length() != 13) {
			System.out.println("잘못된 입력 값 입니다");
		}else
			this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
}
