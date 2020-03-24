package ex02variable;

public class E04StringType {

	public static void main(String[] args) {
		
		/*
		 String형 : 참조형 변수로서 기본자료형이 아님, 
		 	문자열을 저장할 수 있는 데이터타입로 실제로는 class이다.
		 	자바에서는 문자열을 표현할 때 " 으로 감싸고,
		 	연결할 때 + 기호를 사용한다.
		 */
		int number;
		number = 99;
		
		/*
		 참조형변수와 기본자료형 변수 사이에서는 형변환이 불가능하다.
		 서로 사용하는 메모리 공간이 다르기 때문이다.
		 	기본 자료형 -> 스택(Stack)영역 사용
		 	참조형(클래스) -> 힙(Heap)영역 사용
		 */
//		int stringNumber1 = (int)"100";
//		String StringNumber2 = (String)100;
		
		/*
		 문자열 + 정수 => 문자열
		 즉 문자열에 정수가 연결된 형태로 출력된다.
		 */
		String strNumber = "100";
		System.out.println(strNumber + number);//10099
		
		/*
		 String은 클래스이므로 new 키워드를 이용해서 인스턴스(객체)를
		 생성한 후 문자열을 참조한다.
		 */
		String newString = new String("new 키워드 사용");
		System.out.println("newString");
		
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		System.out.println(stringBasic +" "+ plusString);
		
		/*
		문자열+숫자 => 우선순위가 없다면 일반적으로 문자열로 출력된다.
		단, 산술연산의 결과를 출력하고 싶다면 아래와 같이 소괄호를 이용해서
		우선순위에 대한 변화를 주면된다. 
		 */
		int kor=100, eng=99, math=98;
		System.out.println("총점:"+kor+eng+math);
		System.out.println("총점:"+(kor+eng+math));
		
		

	}

}
