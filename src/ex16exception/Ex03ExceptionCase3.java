package ex16exception;

import java.io.IOException;

/*
 예외처리방법3]
 	예외가 발생한 위치에서는 처리하지 않고 외부로 던지고,
 	함수를 호출한 지점에서 예외객체를 받은 후 처리한다.
 	이때 예외발생과 상관없이 finally절은 실행된다.
 */
public class Ex03ExceptionCase3 {

	static void compileFunc() throws IOException {
		try {
			System.out.print("하나의 문자를 입력하세요:");
			int userChar = System.in.read();
			System.out.println("입력된 문자는:"+(char)userChar);
		}
		finally{
			System.out.println("예외발생? 난 몰러..!!");
		}
	}	
	
	public static void main(String[] args) {
		try {
			compileFunc();
//			compileFunc1();
//			compileFunc2();
//			compileFunc3();
//			compileFunc4();
			//-> main으로 넘겨서 한번에 처리해도 됨.
		} 
		catch (IOException e) {
			System.out.println("compileFunc()메소드에서 예외발생됨");
		}
	}
}
