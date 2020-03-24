package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic {

	public static void main(String[] args) {
		
		/*
		 1]Syntax에러 (구문에러)
		 	: 실행자체가 되지 않는 코드로 오류를 수정해야만
		 	정상적으로 실행된다. 즉 코드에 문법적인 오류가
		 	발생되었음을 의미한다.
		 */
//		Int number = 10;//<- int를  Int로 표기했음
//		if(true);
//		{}
//		else //<-if문이 종료되어 의미없는 else문이 되었음
//		{}
		
		//위 문장에서 구문오류가 있는 부분을 수정한 코드
		int number = 10;
		if(true){
			System.out.println("참이다");
		}
		else {
			System.out.println("거짓이다");
		}
		
		/*
		 외부자원을 사용할 때 발생되는 예외
		 
		 방법1] main()함수 밖으로 예외를 던진다. 이것을
		 "예외던지기"라고 표현하고, 내부에서 예외를 처리하지 않고
		 무시하겠다는 의미이다. 
		 
		 public static void main(String[] args) throws IOException{
		 */
		
		/*
		 방법2] 예외가 발생된 지점에서 try~catch문으로 직접
		 	예외를 처리한다.
		 */
		try {
		System.out.print("문자하나를 입력하세요");
		int iChar = System.in.read();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}

}
