package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 스트림(Stream)
 	: IO모델의 핵심개념이라 할 수 있는 스트림은 '데이터의 흐름'
 	혹은 '데이터의 흐름을 형성해주는 통로'정도로 정의할 수 있다.
 	입력(Input)스트림과 출력(Output)스트림으로 나눌 수 있다.
 */
public class E01ByteFileCopy {

	/*
	 IO관련 작업에서는 많은 부분에서 예외처리가 필요하다.
	 이때 예외를 throws하는 것보다 try~catch로 예외처리를
	 해주는 것을 권장하고 있다. 예외를 무시하게 되면 문제가 
	 생겼을 때 적절한 조치를 취하기 힘들기 때문이다.
	 */
	public static void main(String[] args) {
		
			InputStream in = null;
			OutputStream out = null;
			int copyByte = 0;
			try {
				//원본파일을 읽어오기 위한 입력스트림 생성
				in =  new FileInputStream("src/ex20io/A38Http2.zip");
				//복사본을 만들기 위한 출력스트림 생성
				out = new FileOutputStream("src/ex20io/A38Http2_copy.zip");
				int bData;//원본에서 1byte를 읽어 저장하기 위한 변수
				
				while(true) {
					//원본파일에서 1byte씩 읽어옴
					bData = in.read();
					
					if(bData==-1) {
						//파일의 끝까지 읽으면 -1을 반환하므로 탈출한다.
						break;
					}
					
					//읽어온 데이터를 복사본에 입력
					out.write(bData);
					copyByte++;
				}
			}
			catch (FileNotFoundException e) {
				System.out.println("파일이 존재하지 않습니다.");
			}
			catch (IOException e) {
				System.out.println("파일스트림 생성시 오류발생됨");
			}
			finally {
				try {
					//입출력이 완료되면 생성한 스트림을 닫아준다.
					in.close();
					out.close();
					
					System.out.println("복사된 kByte 크기:"+
							(copyByte/1024));
				}
				catch (IOException e2) {
					System.out.println("파일스트림닫기 오류");
				}
			}
	}
}
