package ex07string;

public class E02StringMethod {

	public static void main(String[] args) {
		
		System.out.println("String 클래스의 주요 메소드");
		
		String str1 = "Welcome to java";
		String str2 =  "자바야 놀자!";
		
		/*
		 1] length() : 문자열의 길이를 반환한다.
		 */
		System.out.println("str1의 길이:"+ str1.length());
		System.out.println("str2의 길이:"+ str2.length());
			
		/*
		 2] charAt(인덱스) : 문자열에서 특정 index에 해당하는
		 문자 하나를 반환한다. index는 0부터 시작한다.
		 */
		System.out.println("str1의 두번째 문자:"+
				 str1.charAt(1));
		System.out.println("str2의 두번째 문자:"+
				str2.charAt(1));
		
		/*
		 시나리오] 주민등록번호를 이용하여 성별을 판단하는 프로그램을
		 작성하시오.
		 190419-3000000 => 남자
		 190419-4000000 => 여자
		 */
		String juminNum = "190419-5000000";
		if(juminNum.charAt(7)=='1'
				|| juminNum.charAt(7)=='3') {
			System.out.println("남자입니다.");
		}
		else if(juminNum.charAt(7)=='2'
				|| juminNum.charAt(7)=='4') {
			System.out.println("여자입니다.");
		}
		else if(juminNum.charAt(7)=='5'
				|| juminNum.charAt(7)=='6') {
			System.out.println("외국인입니다.");
		}
		else {
			System.out.println("주민번호가 잘못되었습니다.");
		}
		
		/*
		 4] compareTo() : 두 문자열을 첫 번째 문자부터 순차적으로
			 비교하면서
			 	앞의 문자열의 아스키코드가 크면 양수를 반환
			 	뒤의 문자열의 아스키코드가 크면 음수를 반환
			 	같으면 0을 반환한다.
		 */
		String str3 = "A";
		String str4 = "B";
		System.out.println(str3.compareTo(str4));//-1
		System.out.println(str4.compareTo(str3));//1
		System.out.println("ABC".compareTo("ABC")==0?
				"문자열이 같다" :  "문자열이 다르다");
		
		/*
		 5] concat() : 두 개의 문자열을 연결할 때 사용한다. +기호와
		 	동일한 역할을 한다.
		 */
		System.out.println("JAVA".concat(" WORLD").concat(" Go"));
		System.out.println("JAVA"+" WORLD"+" Go");
		
		/*
		 6] contains() : 문자열에 특정 문자열이 포함되어 있는지 
		 	판단하여 포함되었으면 true, 아니면 false를 반환한다.
		 */
		
		System.out.println(str1.contains("To"));
		System.out.println(str1.contains("to"));
		
		/*
		 시나리오] 해당 문자열이 이메일 형식인지 검사하는
		 프로그램을 작성하시오.
		 hong@ikosmo.co.kr => 이메일 형식임
		 not@naver => 이메일 형식이 아님
		 */
		String email1 = "hong@ikosmo.co.kr";
		if(email1.contains("@") && email1.contains(".")) {
			System.out.println("이메일 형식임");
		}
		else {
			System.out.println("이메일 형식이 아님");
		}
		
		/*
		 7] endsWith() 
		 	: 문자열이 특정 문자열로 끝나면 true, 아니면
		 	false를 반환한다.
		 8] startsWith()
		 	: 문자열이 특정 문자열로 시작하면  true, 아니면
		 	false를 반환한다.
		 */
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));
	
		/*
		 9]format()
		 	: 출력형식을 지정하여 문자열로 반환하고 싶을 때 사용.
		 	printf()와 사용법은 동일하고 주로 웹어플리케이션(JSP)를
		 	제작할 때 사용된다.
		 */
		System.out.printf("국어:%d,영어:%d,수학:%d\n",
				81,92,100);
		
		String formatStr = 
				String.format("국어:%d,영어:%d,수학:%d\n",
						81,92,100);
		System.out.println(formatStr);
		
		/*
		 10] indexOf()
		 	: 문자열에서 특정 문자열의 시작 인덱스를 반환한다.
		 	만약 찾는 문자열이 없다면 -1을 반환한다.
		 */
		System.out.println(str1.indexOf("ava"));//12
		System.out.println(str1.indexOf("j"));//-1
		System.out.println(email1.indexOf("0")!=-1?
				"이메일 형식 맞음" : "이메일 형식 아님");
		
		/*
		 시나리오] 주민등록번호를 indexOf를 사용하여 성별을
		 구분하는 프로그램을 작성하시오.
		 */
		juminNum = "120403-3012345";
		int index = juminNum.indexOf("-") +1;
		if(juminNum.charAt(index)=='3') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		/*
		11] lastIndexOf()
			: 사용법은 indexOf와 동일하나 문자열의 뒤에서부터
			문자열을 찾아서 인덱스를 반환한다.
		*/
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("j"));
		System.out.println("indexOf:"+ str1.indexOf("a"));//12(앞에 있는 a의 인덱스)
		System.out.println("lastIndexOf:"+
				str1.lastIndexOf("a"));//14(뒤에 있는 a의 인덱스)
		
		/*
		 12] replace
		 	: 특정 문자열을 찾아서 지정된 문자열로 변경한다.
		 	만약 찾는 문자열이 없다면 변경만 되지 않을 뿐 에러가
		 	발생하지는 않는다.
		 */
		System.out.println("J를 G로 변경하기");
		System.out.println(str1.replace("J", "G"));//변화없음
		System.out.println("java를 KOSMO로 변경하기");
		System.out.println(str1.replace("java", "KOSMO"));//KOSMO로 변경됨
		
		/*
		 13] split()
		 	: 문자열을 구분자를 통해 분리해서 String타입의 배열로
		 	반환한다. 해당 구분자가 없는 경우에는 크기가 1인 String
		 	배열로 반환한다.
		 */
		String phoneNumber = "010-1234-5678";
		String[] phoneArr = phoneNumber.split("-");
		for(int i =0; i<phoneArr.length; i++) {
			System.out.printf("phoneArr[%d]=%s\n",
					i,phoneArr[i]);
		}
		phoneArr = phoneNumber.split("%");
		for(int i =0; i<phoneArr.length; i++) {
			System.out.printf("phoneArr[%d]=%s\n",
					i,phoneArr[i]);
		}
		
		
		/*
		 14] substring()
		 	: 시작 인덱스와 끝 인덱스 사이의 문자열을 잘라서 반환해줌,
		 	즉 문자열을 자를 때 사용하는 메소드이다.
		 	사용법1 : substring(인덱스) -> 이 경우 인덱스부터
		 	 		문자열의 끝까지를 잘라서 반환한다.
		 	사용법2 : substring(인덱스1, 인덱스2) -> 인덱스에
		 			포함되는 부분만 잘라서 반환한다.
		 */
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		
		/*
		 시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을 
		 작성하시오
		 파일명 : my.file.images.jpg
		 */
		
		String filename = "my.file.images.jpg";
		int beginIndex = filename.lastIndexOf(".")+1;
		System.out.println("파일의 확장자는:"+
				filename.substring(beginIndex));
			
	}

}
