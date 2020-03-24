package ex05method;

import java.util.Scanner;

/*
 문제5-3)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
공식]
  화씨 = 1.8 * 섭씨 + 32
  섭씨 = (화씨 - 32) / 1.8
 */
public class QuTemperature {

	double Celsius;
	double Fahrenheitus;
	
	//섭씨 -> 화씨
	static double returnToFahrenheit(int c){
		return 1.8 * c + 32; // return으로 고치기
	}
	//화씨 -> 섭씨
	static double returnToCelsius(double f){
		return ((f - 32) / 1.8); // return으로 고치기
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		double b = scanner.nextDouble();
		
		System.out.println("화씨:"+returnToFahrenheit(a));
		System.out.println("섭씨:"+returnToCelsius(b));
		
	}

}
