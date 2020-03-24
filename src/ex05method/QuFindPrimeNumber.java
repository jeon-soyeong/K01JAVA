package ex05method;
/*
 문제 5-4) 
전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고,
이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.
메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌 수 있는 것이 1과 자기 자신 밖에 없는 수.
실행예 :       n	 					i
2
3 
5
7
……중략…….
97
 */
public class QuFindPrimeNumber {
	
	static boolean isPrimeNumber(int num) {
		if(num==1) {
			return false;
		} 
		else {
			for(int i=2; i<num; num++) {
				if(num%i==0) 
					return false;
				
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=100; i++) {
			if(isPrimeNumber(i)==true) {
				System.out.println("소수="+i);
			}
		}
	}
}




