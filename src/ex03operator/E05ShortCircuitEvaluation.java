package ex03operator;

public class E05ShortCircuitEvaluation {
	
	/*
	 SCE(Short-Circuit-Evaluation)
	 	하나의 조건검사만으로 결과를 알 수 있는 경우 JAVA컴파일러는
	 	뒤의 조건을 수행하지 않고 건너뛰게 된다. 이 경우 변수의 값이
	 	변경되는 코드가 있다면 실행되지 않으므로 주의해야 한다.
	 */
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		
		/*
		 &&(논리And)의 경우 둘 중 하나만 false이면 false를 반환하므로
		 첫 번째 조건이 flase이면 두 번째 조건을 검사(수행)하지 않는다.
		 */
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("result="+ result);//false
		System.out.println("num1="+ num1 +", num2="+ num2);//10, 0
		
		/*
		 ||(논리Or)의 경우 둘 중 하나만 true이면 true를 반환하므로
		 첫 번째 조건이 true이면 두 번째 조건을 검사하지 않는다.
		 */
		result = (num1+=10)>0 || (num2+=10)>0;
		System.out.println("result="+ result);//true
		System.out.println("num1="+ num1 +", num2="+ num2);//20, 0
		
		/*
		 따라서 num2의 결과가 프로그램에 영향을 미치게 되는 경우라면
		 별도의 처리를 해야하고 코드작성에 주의해야 한다.
		 */
	}

}
