package ex03operator;

public class E06PrePostFixOperator {

	/*
	 증감연산자
	 	: 변수를 +1 혹은 -1한 것과 같은 결과를 반환한다.
	 	주로 반복문에서 사용된다.
	 	
	 Prefix(전위 증가 혹은 감소) : 연산자가 변수 앞에 있는 경우로
	 	1. 변수의 값이 먼저 증가한다.
	 	2. 증가한 값이 좌측으로 혹은 다른 코드에 반영된다.
	 Postfix(후위 증가 혹은 감소) : 연산자가 변수 뒤에 있는 경우로
	 	1. 변수의 값이 먼저 다른 코드에 반영된다.
	 	2. 실행된 이후 변수의 값이 변경된다.
	 */
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2, num3;
		
		num2 = ++num1;/*
						1. num1의 값이 먼저 1증가
						2. 증가된 값이 num2에 대입됨.
		*/
		num3 = --num1;/*
						1. num1의 값이 먼저 1감소
						2. 감소된 값이 num3에 대입됨.
						
						최종결과 :7, 8, 7 
		*/
		System.out.println("전위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d %n%n",
				num1, num2, num3);
///////////////////////////////////
		
		num1 = 7;
		
		num2 = num1++;/*
						1.num1의 값 7이 num2에 먼저 할담됨
						2.할당된 이후 1증가함.
		
		*/
		num3 = num1--;/*
						1.num1의 값 8이 num3에 먼저 할담됨
						2.할당된 이후 1감소함.
						
						최종결과 : 7, 7, 8
		*/
		
		System.out.println("후위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d %n%n",
				num1, num2, num3);
	
	}

}
