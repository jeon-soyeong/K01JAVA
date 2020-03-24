package ex20io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class E08StringWriter {

	public static void main(String[] args) {
		
		try {
			/*
			 문자열을 저장하기 위한 출력스트림을 생성한다.
			 문자열의 입력은 버퍼링에 따라 성능의 차이가  크기 때문에 
			 버퍼필터스트림을 추가적으로 연결해서 사용한다. 
			 */
			BufferedWriter out = new BufferedWriter(
					new FileWriter("src/ex20io/string.txt"));
			
			/*
			 write()메소드를 통해 문자열을 파일에 저장한다.
			 이때 개행(줄바꿈)은 newLine()메소드를 통해서 삽입하게 되는데,
			 각  OS별로 개행문자가 다르기 때문이다.
			 */
			out.write("나는 KOSMO에서 공부한다.");
			out.newLine();
			out.write("수료 후 꼭 취업하겠다");
			out.newLine();
			
			out.close();
			System.out.println("입력완료");
		}
		catch (FileNotFoundException e) {
			System.out.println("파일 없음");
		}
		catch(IOException e) {
			System.out.println("IO오류");
		}
	}
}
