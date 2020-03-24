package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*하나의 문자를 입력받아 사용자가 입력한 값이 숫자인지 판단하여 숫자라면
  2의배가 아닙니수인지를 다시 판단하여서
2의배수인 경우에만 "2의 배수 입니다"라고 출력하여라.
그 외에는 "2의 배수다" 라고 출력한다.
힌트] '0'의 아스키코드값은 48 입니다. 
(System.in.read()를 사용하세요)*/
public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("=입력해주세요=");
		int asciiCode = System.in.read();
		
		//'4'-'0'-> 아스키 코드 '0'(48)을 빼주면 그냥 수 나옴.
		if(asciiCode>='0' && asciiCode<='9'){
			if(asciiCode%2==0){
				System.out.println("2의 배수입니다.");
			}
			else{
				System.out.println("2의 배수가 아닙니다.");
				}
			}

		else{
			System.out.println("문자입니다.");
		}

		
//		======================================
		
		System.out.print("문자하나를 입력하세요:");
		int ascii = System.in.read();
		 		
		//아스키코드값을 알고있는 경우 구현방법
		//boolean isNumber = (ascii>=48 && ascii<=57);
		//아스키코드값을 모를때 구현방법
		boolean isNumber = (ascii>='0' && ascii<='9');
		if(isNumber==true) {
			/*
			숫자형문자가 가지고있는 아스키코드값에서 48(0의 아스키코드)
			을 빼면 해당문자의 정수가 된다.
			즉 '4' - '0' = (정수) 4
			 */
			if((ascii-'0') % 2 == 0) {
				System.out.println("2의 배수입니다.");
			}
			else {
				System.out.println("2의 배수가 아닙니다.");
			}	
		}
		else {
			System.out.println("숫자가 아닙니다.");
		}
	
		
		
		
	}
}

