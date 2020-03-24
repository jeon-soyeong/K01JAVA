package ex06array;

import org.omg.CORBA.OMGVMCID;

public class E01OneDimArray01 {

	public static void main(String[] args) {
		
		/*
		 자바에서는 배열을 객체를 통해 생성하게 된다.
		 생성된 배열은 힙(Heap)영역에 저장되고, 할당된 메모리의
		 주소값을 반환한다. 그래서 배열명(배열변수)는 주소값(참조값)
		 을 할당받게 된다. 해당주소를 통해 배열에 접근한다.
		 */
		//크기가 3인 배열이 선언되었으므로 index는 0~2까지 생성된다.
		int[] numArr = new int[3];
		numArr[0]=10;
		numArr[1]=20;
		numArr[2]=30;
		System.out.println("numArr의 2번 방의 값"+numArr[2]);
		System.out.println("배열명(numArr)="+ numArr);
		
		/*
		 배열의 선언 및 초기화
		 	: 배열은 여러개의 변수를 사용하기 위해 선언하므로
		 	접근을 위해 일반적으로 반복문을 사용한다.
		 배열명.length :  해당 배열의 크기를 반환한다. 배열의 크기가
		 	변경되는 경우에 유연하게 사용할 수 있다.
		 */
		int[] arrNumber= new int[40];
		for(int i=0; i<arrNumber.length; i++) {
			arrNumber[i]= i+10;
		}
		for(int i=0; i<4; i++) {
			System.out.println(i+"번방의 값="+ arrNumber[i]);
		}
		System.out.println("=======================");
		
		/*
		 객체 배열 
		 	: 기본자료형을 저장하는 배열이 아니라, 객체의 참조값을
		 	저장할 용도로 생성하는 배열이다. 사용방법은 동일하다.
		 */
		String[] strArr = new String[3];
		strArr[0] = "java";
		strArr[1] = "jsp";
		strArr[2] = "spring";
		for(int j=0; j<strArr.length; j++) {
			System.out.println(strArr[j]);
		}
		System.out.println("=======================");
		
		System.out.println("배열의 선언과 초기화");
		System.out.println("방법1 : 배열의 선언 이후 초기화");
		int[] initArr = new int[1];
		initArr[0]=100;
		System.out.println("initArr[0]="+initArr[0]);
		
		/*
		 배열의 선언과 동시에 초기화를 하는 경우 자바 컴파일러는
		 초기값의 갯수를 통해 크기를 결정할 수 있으므로 이런 경우
		 크기는 생략하도록 약속되어있다.
		 */
		System.out.println("방법2 : 선언과 동시에 초기화1");
//		int[] initArr2 = new int[3] {1, 20, 300};//에러발생
		int[] initArray2 = new int[] {1, 20, 300};
		
		/*
		 배열 요소의 갯수를 통해 배열을 즉시 생성한다. 이때
		 new 키워드는 생략한다.
		 */
		System.out.println("방법3 : 초기화값만으로 선언");
		int [] initArr3 = {11, 13, 17, 19, 23};
		int arrSum = 0;
		for(int x =0; x<initArr3.length; x++) {
			arrSum += initArr3[x];
		}
		System.out.println("배열요소의 합은="+ arrSum);
		
		
	}
	
}
