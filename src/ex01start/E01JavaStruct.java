package ex01start;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E01JavaStruct {

	public static void main(String[] args) {
		
		System.out.println("자바의 간략한 구조");
		
		Date toDayOfDate = new Date();
		//Date클래스로 오늘날짜 출력하기
		System.out.println("오늘날짜:" + toDayOfDate);
		
		SimpleDateFormat simple = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String toDayString = simple.format(toDayOfDate);
		System.out.println("변형된날짜:" + toDayString);
		

	}

}
