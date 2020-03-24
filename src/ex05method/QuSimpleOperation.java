package ex05method;

import java.util.Scanner;

/*문제5-1)
 두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
메소드명 : arithmetic()
실행예 :
덧셈결과 -> 177
뺄셈결과 -> 23
곱셈결과 -> 7700
나눗셈 몫 -> 1
나눗셈 나머지 -> 23
 */
public class QuSimpleOperation {

	public static void arithmetic(int n1, int n2){
		System.out.println("덧셈결과 -> "+ n1+n2);
		System.out.println("뺄셈결과 -> "+ ((n1>n2)? n1-n2 : n2-n1));
		System.out.println("곱셈결과 -> "+ n1*n2);
		System.out.println("나눗셈 몫 -> "+ n1/n2);
		System.out.println("나눗셈 나머지 -> "+ n1%n2);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		arithmetic(a, b);
	}

}
