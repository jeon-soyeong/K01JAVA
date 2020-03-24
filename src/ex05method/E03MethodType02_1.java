package ex05method;

/*
 [메소드 형태2] 매개변수는 없고 반환 값은 있는 경우
 	: 사용자로부터 입력 값을 받은 후 연산을 진행하고 결과를
 	반환하거나 난수를 생성하는 경우 사용된다.
 */
public class E03MethodType02_1 {

	static int noParamYesReturn() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum +=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		 
	System.out.println("1~10까지의 합:"+ noParamYesReturn());//반환 값이 있는 형태
	
	int sum10 = noParamYesReturn();
	System.out.printf("1에서 10까지의 합은 %d입니다.", sum10);//반환 값이 있는 형태
		
	}

}
