package ex03operator;

public class E02BokhapOperator {
	
	/*
	 복합대입연산자
	 	: 산술연산자와 대입연산자를 연결해놓은 형태로 
	 	좌우측의 값을 연산하여 좌측의 변수에 대입하는
	 	형태의 구조를 가진다. 문법구조상 항상 현재 타입을
	 	유지하는 특성을 가지고 있다.
	 */
	public static void main(String[] args) {
		
		double e = 3.1;
		e += 2.1; // 3.1 + 2.1 = 5.2
		e *= 2; // 5.2 * 2 = 10.4
//		e = e + e; // 10.4 + 10.4 = 20.8
		e += e;
		System.out.println("e의 결과값:"+ e);
		
		int n =5;
//		n = n * 2.7;//에러발생 : 계산의 결과가 double이므로 대입불가 
		
		n = (int)(2 * 2.7);//명시적 형변환 후 int형 변수에 대입
		n *= 2.7;/*정상 : 기존의 자료형을 유지한다. 단 결과는 13이 된다.
						문법구조상 명시적 형변환된 결과가 반환된다고 
						생각하면 된다.*/
		
		System.out.println("n의 결과값:"+ n);
			
	}

}
