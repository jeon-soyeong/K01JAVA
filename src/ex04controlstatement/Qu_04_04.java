package ex04controlstatement;
/*
 다음 예제는 두개의 if문을 사용하고 있다.이를 하나의 if문으로 변경해보자
실행결과]
---------- java ----------
양수이면서 짝수
출력 완료 (1초 경과) - 정상 종료

 */
public class Qu_04_04 {
	public static void main(String[] args) {
		
		System.out.println("---------- java ----------");
		int num = 120;
			if (num > 0 && (num % 2) == 0) {
				System.out.println("양수이면서 짝수");
		         }
		System.out.println("출력 완료 (1초 경과) - 정상 종료");
		
   	}
}
