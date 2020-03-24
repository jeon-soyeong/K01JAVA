package ex03operator;

public class E07BitOperator {

	public static void main(String[] args) {
		
		
		/*
		 비트연산자 : 자료를 bit단위로 논리 연산한다.
		 	& : And. 좌우가 둘 다 1일 때만 1을 반환.나머지는 0
		 	| : Or. 좌우 둘 중 하나만 1이면 1을 반환. 둘 다 0일 때 0반환
		 	^ : XOR. 둘이 같으면 0, 다르면 1을 반환
		 	~ : NOT. 반전된 값을 반환, 1이면 0, 0이면 1을 반환
		 */
		int num1 = 5; //00000000 00000000 00000000 00000101
		int num2 = 3; //00000000 00000000 00000000 00000011
		int num3 = -1;//11111111 11111111 11111111 11111111
					// -1이 위와 같은 이유는 1을 더했을 때 0이 되기 때문이다.
					// 양수 1을 2의 보수를 취하면 -1이 된다.
		
		System.out.println("비트AND:"+ (num1 & num2));
		System.out.println("비트OR:"+ (num1 | num2));
		System.out.println("비트XOR:"+ (num1 ^ num2));
		System.out.println("비트Not:"+ (~num3));
	}

}
