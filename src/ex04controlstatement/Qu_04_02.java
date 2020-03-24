package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
 하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
(System.in.read()를 사용하세요)
 */
public class Qu_04_02 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("=입력해주세요=");
		int asciiCode = System.in.read();
		
		int reasciiCode = (asciiCode>='0' && asciiCode<='9')? 0: 1;
			if(reasciiCode==0){
				System.out.println("숫자입니다.");
			}
			else{
				System.out.println("문자입니다.");
				
				
//		=============================
				
			System.out.print("하나의 문자를 입력하세요:");
			int inputChar = System.in.read();
			/*
			삼항연산자 형식 : 
			변수 = (조건식) ? 참일때값 : 거짓일때값;
			*/

			String resultStr = (inputChar>='0' && inputChar<='9') ? 
					"숫자입니다" : "숫자가아닙니다";
			
			System.out.println(resultStr);		
			}
			
	}

}
