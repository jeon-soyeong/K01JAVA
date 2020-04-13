package ex06array;
/*
 문제1) 파일명 : QuNumberCounter.java
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다.
배열 전체의 데이터를 읽어서 각 정수가 몇 개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
int[] counter = new int[4];
 
실행결과]
counter[0] => 3 
counter[1] => 2
counter[2] => 2
counter[3] => 4
 */
public class QuNumberCounter {

	public static void main(String[] args) {
		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		int count0=0, count1=0, count2=0, count3=0;
		
		for(int i=0; i<answer.length; i++) {
			if(answer[i]==1) {
				count0 += 1;
				counter[0] = count0 ;
			}
			else if(answer[i]==2) {
				count1 += 1;
				counter[1] = count1 ;
			}
			else if(answer[i]==3) {
				count2 += 1;
				counter[2] = count2 ;
			}
			else if(answer[i]==4) {
				
				count3 += 1;
				counter[3] = count3 ;
			}
		}
		System.out.println("counter[0] => "+counter[0]);
		System.out.println("counter[1] => "+counter[1]);
		System.out.println("counter[2] => "+counter[2]);
		System.out.println("counter[3] => "+counter[3]);

	}
}
