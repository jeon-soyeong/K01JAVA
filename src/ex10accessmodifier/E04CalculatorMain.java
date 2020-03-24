package ex10accessmodifier;

import ex10accessmodifier.cal.Calculator;

public class E04CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		//연산의 결과 출력
		System.out.println("10+20="+ cal.addTwoNumber(10, 20));
		System.out.println("10+20="+ cal.addTwoNumber(55, 98));
		System.out.println("10+20="+ cal.subTwoNumber(100, 77));
		
		//연산의 횟수 출력
		cal.showOperatingTimes();
	
	}

}
