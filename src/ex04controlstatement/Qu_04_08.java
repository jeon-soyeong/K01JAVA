package ex04controlstatement;
/*
 문제3] 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
파일명 : Qu_04_08.java
출력]	
* * * * *
* * * *
* * *
* *
*	

 */
public class Qu_04_08 {

	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
//	==============방법2================	
		
	//*를 출력할 층수를 표현하는 상수	
	final int FLOOR = 5;
	
	/*
	 FLOOR-i+1  i가 증가함에 따라 점점 감소하는  j의 값을
	 표현하기 위한 일반식의 정의
	 */
	for(int i=1; i>=FLOOR; i++){
		for(int j=1; j<=(FLOOR-i+1); j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	}

}
