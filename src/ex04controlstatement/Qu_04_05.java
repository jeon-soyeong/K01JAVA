package ex04controlstatement;
//아래 코드를 삼항연산자를 사용하지 말고 if~else문으로 변경해보자.
//	big = (num1>num2)? num1:num2; //조건?참:거짓;
//	System.out.println(big);
//	
//	diff = (num1>num2)? num1-num2: num2-num1;
//	System.out.println(diff); 
public class Qu_04_05 {

	public static void main(String[] args) {
		
		System.out.println("---------- java ----------");
		
		int num1=50, num2=100;
     	int big, diff;
     	
     	if(num1>num2){
     		System.out.println(num1);
     		System.out.println(num1-num2);
     	}
     	else{
     		System.out.println(num2);
     		System.out.println(num2-num1);
     	}
     	
//     	=============================
     	if(num1>num2){
			big = num1;
		}
		else{
			big = num2;
		}
     	System.out.println(big);
     	
     	if(num1>num2) {
     		diff = num1-num2;
     	}
     	else {
     		diff = num2-num1;
     	}     	
     	System.out.println(diff);
	

	}
}
