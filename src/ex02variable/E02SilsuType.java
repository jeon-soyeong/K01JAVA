package ex02variable;

public class E02SilsuType {

	public static void main(String[] args) {
		
		/*
		 실수자료형
		 -정수형보다는 실수형이 더 큰 자료형이다.(0과 1사이에 무수한
		 실수가 존재하기 때문)
		 -따라서 long과 float의 연산결과는 float형이 된다.
		 */
		long long1 = 100;
		float float1 = 200;
		float result1 = long1 + float1;
		System.out.println("long1 + float = "+ result1);
		
		
		/*
		 float와 long의 연산결과를 long으로 받고 싶다면
		 방법1 : float를 long으로 형변환 후 연산하거나 
		 방법2 : 계산 결과 전체를 long으로 명시적(강제)형변환 한다.
		 */
		long result2 = long1 + (long)float1;
		System.out.println("형변환 후 연산="+result2);
		long result3 = (long)(long1 + float1);
		System.out.println("계산 후 형 변환="+ result3);
		
		/*
		 -실수형에서 기본형은 double이다.
		 -소수점이 있는 데이터를 컴파일러는 무조건 double로 인식한다.
		 -단, 소수점이 없는 데이터는 float에 대입할 수 있다.
		 -소수점이 있는 데이터를 float에 대입하려면 접미사(f or F)사용한다.
		 -형변환도 가능하지만 Java에서는 권장하지 않는다.
		 */
		float f3 = 100;
		
//		float f4 = 3.14;[에러발생]=> 3.14 자체를 double형으로 인식함.
		float f4 = (float)3.14;//형변환 후 대입(권장사항이 아님)
		System.out.println("f4="+ f4);
		
		float f5 = 3.14F;//자바에서는 접미사 사용을 권장하고 있음.
		System.out.println("f5="+ f5);
		
		float f6 = f3 + f4;// float + float = float
		System.out.println("f6="+ f6);
		
		double d1 = 3.14;
		double d2 = f6 + d1;//float +double = double(큰 쪽으로 따라감)
		System.out.println("d2="+ d2);

	}

}
