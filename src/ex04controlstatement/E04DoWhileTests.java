package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

public class E04DoWhileTests {

	public static void main(String[] args) throws IOException{
		/*
		시나리오]국어, 영어, 수학 점수를 사용자로부터 입력받은 후
		평균을 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하시오.
		단, 사용자가 X,x(대소문자 구분없음)를 입력하면 프로그램이
		종료되어야 하며 do~while문으로 구현해야 한다.
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		
		
		do {System.out.print("국어점수:");
			kor = scanner.nextInt();
			System.out.print("영어점수:");
			eng = scanner.nextInt();
			System.out.print("수학점수:");
			math = scanner.nextInt();
					
			avg = (kor+eng+math)/(3*10);
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점입니다.");
				break;
			case 8 :
				System.out.println("B학점입니다.");
				break;
			case 7 :
				System.out.println("C학점입니다.");
				break;
			default :
				System.out.println("F학점입니다.");
			}
					
			System.out.println("종료하려면 x(X)를 입력하세요.");
			System.out.println("계속하려면 아무키나 입력하세요.");
			exitCode = System.in.read();
			
		} while (!(exitCode == 'x' || exitCode == 'X'));
	
	
	
	
	
	}

}
