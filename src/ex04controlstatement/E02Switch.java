package ex04controlstatement;

import java.util.Scanner;

/*
 switch문
 	if문처럼 조건에 따라 분기하는 제어문으로, 정수식의
 	값과 동일한 부분을 찾아 실행하는 형태를 가지고 있다.
 	형식]
 		switch(산술식 or 정수식){
 		case 값1 :  
 			실행문1; break;
 		case 값2 : 
 			실행문2; break;
 		default : 
 			위의 값과 매칭되지 않을 때 실행되는 문장
 			else와 같은 의미라 보면 된다
 		}
 	-switch문 내부에서 break문을 만나게 되면 실행이
 	중지되고 밖으로 탈출하게 된다.
 */
public class E02Switch {

	public static void main(String[] args) {
		
		/*
		 Scanner클래스
		 	: JDK5.0부터 추가된 클래스로 키보드를 통해 사용자로부터
		 	값을 입력받을 때 사용한다.
		 	nextLine() : 문자열을 입력받음
		 	nestInt() : 정수를 입력받음
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는:"+ iNum);
		
		int remain = iNum % 3;
		
		switch (remain) {
		case 0 :
			System.out.println("나머지는 0입니다.");
			break;
		case 1:
			System.out.println("나머지는 1입니다.");
			break;
		default :
			System.out.println("나머지는 2입니다.");
			break;
		}
		
		
		/*
		switch문 사용시 주의사항
		-long 타입의 변수는 사용이 불가능하다.
		-byte/short/int/char/String만 사용가능하다. 
		-논리식도 사용이 불가능하다.
		 */
//		long ln = 100;
//		switch(ln) {
//		case 100;
//			System.out.println("long타입 사용??");
//		default : 
//			System.out.println("안되는군!");
//		}
//		switch(iNum%3==0) {
//		System.out.println("논리식도 안되는군!");
//		}
		
		/*
		 문자열이나 문자는 switch문에서 사용가능하다.
		 */
		String title = "자바";
		switch(title) {
		case "자바" : System.out.println("자바 좋아");
			break;
		case "JAVA" : System.out.println("JAVA Gooood");
			break;
		}
		
		/*
		 여러 case를 동시에 처리할 때는 break문 없이 case를 나열한다.
		 if 구문에서 ||(논리or)로 연결한 것과 동일하다.
		 */
		int season = 4;
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8: case 9:
			System.out.println("여름입니다.");
			break;
		case 10: 
			System.out.println("가을입니다.");
			break;
		case 11: case 12:
			System.out.println("겨울입니다.");
			//break X
		}
		
		
	}

}
