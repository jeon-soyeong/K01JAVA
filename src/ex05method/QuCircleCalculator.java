package ex05method;

import java.util.Scanner;

/*문제5-2)
 원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 
 이를 호출하는 main 메소드를 정의하라.
메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름
실행예 :
원의 둘레(5.5) : 34.54
원의 넓이(5.5) : 94.985
 */
public class QuCircleCalculator {

	final static double PI = 3.14;
	static double rad ;
	
//	public static void circleArea(double r1){
//		System.out.printf("원의 넓이(%.1f)%.3f : ", r1 ,(PI*r1*r1));
//	}
	
	static double circleArea(double r1){
		return (PI*r1*r1);
	}
	
//	public static void circleRound(double r1){
//		System.out.printf("원의 둘레(%.1f)%.2f : ", r1 ,(2*PI*r1));
//	}
	
	static double circleRound(double r1){
		return (2*PI*r1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		
		System.out.println("원의 둘레:"+circleRound(a));
		System.out.println("원의 넓이:"+circleArea(a));
		
	
	}

}
