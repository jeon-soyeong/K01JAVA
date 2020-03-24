package ex06array;

/*
 Call by value(값에 의한 호출)
 	메소드 호출과 관련된 개념으로 매개변수를 통해 값을 전달할 때
 	메모리의 "복사"를 통해 값이 전달된다.
 	그래서 다른 메소드(지역)에서 값의 변경이 있더라도 호출한
 	메소드의 값에는 전혀 영향을 미치지 않는다.
 	
 	메모리적 관점에서 보면 스택영역만 사용하는 케이스로
 	main과 호출된 메소드는 서로 다른 지역이므로 서로에게
 	영향을 미치지 않는 것이 특징이다.
 */
public class E03CallByValue {

	public static void main(String[] args) {
		int first=100, second=200;
		
		System.out.println("[main메소드안-호출전]"+
				"first="+first+", second="+second);
		callByValue(first, second);
		
		System.out.println("[main메소드안-호출후]"+
				"first="+first+", second="+second);
	}
	
	public static void callByValue(int fNum, int sNum) {
		int temp;
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		
		System.out.println("[callByValue메소드안]"
				+ "first="+fNum+",second="+sNum);
	}

}
