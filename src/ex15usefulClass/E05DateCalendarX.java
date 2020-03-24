package ex15usefulClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E05DateCalendarX {

	static Date date;
	
	static String myDateFormat(Calendar cal) {
		
		//메소드의 이름만으로 기능을 유추하기 어렵다.
		date = cal.getTime();//메소드명이 time인데 반환형은 Date이다.
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}
	
	public static void main(String[] args) {
		
		/*
		 날짜 하나를 표현하기 위해 3개의 클래스를 사용해야 한다.
		 번거롭고, 생성비용이 비싸다.
		 */
		Calendar cal = Calendar.getInstance();//싱글톤 패턴->new 불가
		System.out.println("현재날짜 : "+ myDateFormat(cal));
		
		cal.add(Calendar.DATE, 1);
		System.out.println("내일날짜 : "+ myDateFormat(cal));
		
		//애매한 상수가 많이 존재한다.
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.MONDAY, 1);
		System.out.println("월요일에 하루를 더해?? 뭐지?? : "+
		myDateFormat(cal2));
		
		//월을 표현하는 상수가  실제ㅇ 월과 -1 차이가 난다.
		System.out.println("JANUARY는 1월인데.. : "+ Calendar.JANUARY);
		System.out.println("DECEMBER가 11월이었나? : "+
		Calendar.DECEMBER);
	}
}
