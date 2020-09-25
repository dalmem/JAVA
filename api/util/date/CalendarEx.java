package api.util.date;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		
		//Calendar 컴퓨터 운영체제에 있는 달력관련 기능을 사용
		//Calendar cal = new Calendar();
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second= cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d일 %d시 %d분 %d초",year,month,date,hour,minute,second);
		
	}
}
