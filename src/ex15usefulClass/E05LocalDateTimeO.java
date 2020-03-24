package ex15usefulClass;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class E05LocalDateTimeO {

	public static void main(String[] args) {
		
		//현재 시간의 정보를 담음.. 파일 마지막에서 확인
		Instant start = Instant.now();
		
		//오늘 날짜
		LocalDate nowDate = LocalDate.now();
		System.out.println("오늘 날짜 : "+ nowDate);
		
		//특정날짜 2012년 4월 3일
		LocalDate ofDate = LocalDate.of(2012, 4, 3);
		System.out.println("생년월일 : "+ ofDate);

		//현재 날짜와 시간
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println("지금 이순간 : "+ nowDateTime);
		
		//특정날짜와 시간
		LocalDateTime ofDateTime = LocalDateTime.
				of(2012, 4, 3, 4, 58, 32);
		System.out.println("생년월일과 시간: "+ofDate);
		
		//오늘 날짜의 자정
		DateTimeFormatter formatter=
		DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss.SSS");
		String dateStr= 
		LocalDate.now().atStartOfDay().format(formatter);
		System.out.println("금일자정 :"+ dateStr);
		
		//내일 날짜 가져오기
		LocalDateTime tomorrow = nowDateTime.plusDays(1);
		System.out.println("내일 : "+ tomorrow);
		
		//3일 후의 정오(오전 12시)
		LocalDateTime day3Later =
		LocalDateTime.now().plusDays(3).with(LocalTime.NOON);
		System.out.println("3일 후 12시  :"+ day3Later);
		
		//앞으로 2시간 10분 후
		System.out.println("2시간 10분 후 : "+
		nowDateTime.plusHours(2).plusMinutes(10));
		
		//가장 가까운 요일, N번째 요일 등을 간단한 코드로 가져올 수 있다.
		LocalDateTime nowSunday = 
		LocalDateTime.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println("가장 가까운 다음 일요일 : "+ nowSunday);
		
		LocalDate fourthSunday = LocalDate.of(2020, 3, 1).with(TemporalAdjusters.
				dayOfWeekInMonth(4, DayOfWeek.SUNDAY));
		System.out.println("2018년 3월 기준, 네번째 일요일 :"+fourthSunday);
		
		LocalDate first12Sunday = LocalDate.of(2020, 3, 1)
				.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		System.out.println("2020년 3월 기준, 첫 번째 일요일:" + first12Sunday);
		
		LocalDate xmas = LocalDate.of(LocalDate.now().getYear(), 12, 25);
		Period left = Period.between(nowDate, xmas);
		System.out.println("X-mas까지 앞으로 "+ left.getMonths()+"개월"+
				left.getDays()+"일");
		
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println("클래스 실행 시간 확인(두 시간의 차) : "+
		duration.toMillis());
		
		System.out.println(nowDate.getMonth());
		
	}
}
