package ex05method;

import java.util.Scanner;

/*
 [메소드 형식4]
 	매개변수도 있고, 반환값도 있는 메소드.
 	4가지 형식 중에서 가장 활용빈도가 높은 메소드 형식이다.
 */
public class E05MethodType04_1 {
	/*
	시나리오] 인원수를 매개변수로 전달받아 인원수 만큼 나이를
	입력받아 그 나이의 합을 반환하는 메소드를 작성하시오.	 
	*/
	public static void main(String[] args) {
	
		int sumOfAge = getTotalAge(5);
		System.out.println("입력받은 나이의 합은?"+sumOfAge);
	}

	static int getTotalAge(int personCnt) {
		
		Scanner scanner = new Scanner(System.in);
		int sumAge = 0;//나이의 누적합을 저장할 변수
		
		//사람의 수만큼 반복하면서 나이를 입력받음
		for(int i = 1; i<= personCnt; i++) {
			System.out.print(i+"번째 사람의 나이");
			int age = scanner.nextInt();
			sumAge += age;
		}
		return sumAge;
	}
	
}
